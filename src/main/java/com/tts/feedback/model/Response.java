package com.tts.feedback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Response {
    private Long id;
    private String recipient;
    private String sender;

    public Response(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;

    }

    public Response() {
    }
}
