package com.example.chatroom.model;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String username;

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String sender) {
        this.username = sender;
    }
}