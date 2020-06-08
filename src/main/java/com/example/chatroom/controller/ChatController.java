package com.example.chatroom.controller;

import com.example.chatroom.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/user")
	public ChatMessage sendMessage(@Payload ChatMessage webSocketChatMessage) {
		return webSocketChatMessage;
	}
	@MessageMapping("/chat.newUser")
	@SendTo("/topic/user")
	public ChatMessage newUser(@Payload ChatMessage webSocketChatMessage,
							   SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", webSocketChatMessage.getUsername());
		return webSocketChatMessage;
	}
}