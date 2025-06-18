package com.ai.springAI.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.deepseek.DeepSeekChatModel;
import org.springframework.ai.deepseek.DeepSeekChatOptions;
import org.springframework.ai.deepseek.api.DeepSeekApi;
import org.springframework.stereotype.Service;

@Service
public class DeepseekService {

    private final DeepSeekChatModel chatModel;

  //  private final DeepSeekChatOptions options = new DeepSeekChatOptions.Builder().build();

    public DeepseekService(DeepSeekChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String askDeepSeek(String prompt) {
        //chatModel.call(question);
        //(DeepSeekApi.ChatModel.DEEPSEEK_CHAT.getValue()

        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        DeepSeekChatOptions.builder()
                                .model("deepseek/deepseek-r1-0528:free")
                                .temperature(0.5)
                                .build()
                ));
        String res=response.getResult().getOutput().getText();
        return res ;
    }

    public String answer(String question) {
        return chatModel.call(question);
    }


}
