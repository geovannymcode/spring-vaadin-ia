package com.geovannycode.domain;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;
//import org.springframework.ai.anthropic.AnthropicChatClient;

@Service
public class ClaudeAIService {
  //  private final AnthropicChatClient anthropicChatClient;

    public ClaudeAIService(/*AnthropicChatClient anthropicChatClient*/) {
    //    this.anthropicChatClient = anthropicChatClient;
    }

    public String chatWithClaude(String message) {
        Prompt prompt = new Prompt(message);
        //ChatResponse response = anthropicChatClient.call(prompt);
        //return response.getResult().getOutput().getContent();
        return "";
    }
}
