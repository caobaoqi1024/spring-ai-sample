package dev.cbq.backend.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ollama")
public class OllamaController {

    private final ChatClient ollamaDeepSeekR1_1_5BChatClient;
    private final ChatClient qwen3_0_6BChatClient;

    public OllamaController(
        @Qualifier("ollama-deepseek-r1:1.5b") ChatClient ollamaDeepSeekR115BChatClient,
        @Qualifier("ollama-qwen3:0.6b") ChatClient qwen306BChatClient) {
        ollamaDeepSeekR1_1_5BChatClient = ollamaDeepSeekR115BChatClient;
        qwen3_0_6BChatClient = qwen306BChatClient;
    }

    @GetMapping("/say-hello-dskR1:1.5b")
    public String sayHelloWithDskR1_1_5B(
        @RequestParam(name = "username", defaultValue = "caobaoqi1024") String username,
        @RequestParam(name = "voice", defaultValue = "Donald John Trump") String voice

    ) {
        return ollamaDeepSeekR1_1_5BChatClient.prompt()
            .system(sp -> sp.param("voice", voice))
            .user(String.format("hello my name is %s what`s your name?", username))
            .call()
            .content();
    }

    @GetMapping("/say-hello-qwen3:0.6b")
    public ChatResponse sayHelloWithQwen3_0_6B(
        @RequestParam(name = "username", defaultValue = "caobaoqi1024") String username,
        @RequestParam(name = "voice", defaultValue = "Donald John Trump") String voice
    ) {
        return qwen3_0_6BChatClient.prompt()
            .system(sp -> sp.param("voice", voice))
            .user(String.format("hello my name is %s what`s your name?", username))
            .call()
            .chatResponse();
    }

}
