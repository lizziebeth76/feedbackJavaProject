package com.tts.feedback.model;

import java.util.List;

public class TweetDisplay {
    private User user;
    private String message;
    private String date;

    public TweetDisplay(User user, String message, String date) {
        this.user = user;
        this.message = message;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
