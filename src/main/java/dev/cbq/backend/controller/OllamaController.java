package dev.cbq.backend.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/ollama")
public class OllamaController {

    private final ChatClient chatClient;

    public OllamaController(ChatClient.Builder builder) {
        builder.defaultOptions(OllamaOptions.builder()
            .model("qwen3:0.6b")
            .build()
        );
        builder.defaultSystem("answer the question for user ask");
        this.chatClient = builder.build();
    }

    @GetMapping("/say-hello-sync")
    public String sayHelloSync(
        @RequestParam(name = "username", defaultValue = "caobaoqi1024") String username) {
        return chatClient.prompt()
            .user(String.format("hello my name is %s what`s your name?", username))
            .call()
            .content();
    }

    @GetMapping("/say-hello-stream")
    public Flux<String> sayHelloStream(
        @RequestParam(name = "username", defaultValue = "caobaoqi1024") String username) {
        return chatClient.prompt()
            .user(String.format("hello my name is %s what`s your name?", username))
            .stream()
            .content();
    }

}
