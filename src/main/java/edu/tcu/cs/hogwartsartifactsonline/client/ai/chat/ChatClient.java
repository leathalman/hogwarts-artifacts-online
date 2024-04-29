package edu.tcu.cs.hogwartsartifactsonline.client.ai.chat;

import edu.tcu.cs.hogwartsartifactsonline.client.ai.chat.dto.ChatRequest;
import edu.tcu.cs.hogwartsartifactsonline.client.ai.chat.dto.ChatResponse;

public interface ChatClient {
    ChatResponse generate(ChatRequest chatRequest);
}
