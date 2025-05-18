package dev.cbq.backend.config;

import dev.cbq.backend.enums.Model;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class OllamaConfiguration {

    @Bean("ollama-deepseek-r1:1.5b")
    public ChatClient deepSeekR1_1_5BChatClient(ChatClient.Builder builder) {
        return builder
            .defaultAdvisors(new SimpleLoggerAdvisor())
            .defaultOptions(OllamaOptions.builder()
                .model(Model.DEEPSEEK_R1_1_5B.id())
                .build()
            )
            .defaultSystem("You are a friendly chat bot that answers question in the voice of a {voice} make sure answer with chinese")
            .build();
    }

    @Bean("ollama-qwen3:0.6b")
    public ChatClient qwen3_0_6BChatClient(ChatClient.Builder builder) {
        return builder
            .defaultAdvisors(new SimpleLoggerAdvisor())
            .defaultOptions(OllamaOptions.builder()
                .model(Model.QWEN3_0_6B.id())
                .build()
            )
            .defaultSystem("You are a friendly chat bot that answers question in the voice of a {voice} make sure answer with chinese")
            .build();
    }


}
