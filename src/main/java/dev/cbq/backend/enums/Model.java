package dev.cbq.backend.enums;

import org.springframework.ai.model.ChatModelDescription;

public enum Model implements ChatModelDescription {

    QWEN3_0_6B("qwen3:0.6b"),
    /**
     * The Llama 3.2 1B language model from Meta.
     */
    DEEPSEEK_R1_1_5B("deepseek-r1:1.5b");

    private final String id;

    Model(String id) {
        this.id = id;
    }

    public String id() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.id;
    }

}
