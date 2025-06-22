package com.ai.springAI.service;

import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.stabilityai.StabilityAiImageModel;
import org.springframework.ai.stabilityai.api.StabilityAiImageOptions;
import org.springframework.stereotype.Service;

@Service
public class StabilityService {

    public final StabilityAiImageModel stabilityaiImageModel;

    public StabilityService(StabilityAiImageModel stabilityaiImageModel) {
        this.stabilityaiImageModel = stabilityaiImageModel;
    }

    public String generateImage(String prompt) {

        ImageResponse response = stabilityaiImageModel.call(
                new ImagePrompt(prompt,
                        StabilityAiImageOptions.builder()
                                .stylePreset("anime")
                                .N(1)
                                .height(1024)
                                .width(1024).build())

        );
        String res=response.getResult().getOutput().getB64Json();
        return "data:image/png;base64," + res;
        //return res ;
    }
}
