package com.tts.feedback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//THESE RESPONSES GO TO THE STUDENT, BASED ON INSTRUCTORS ANSWERS
@Entity
public class ResponseForStudent extends Response {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int participation;
    private int collaboration;
    private int comprehension;
    private int progress;

    public ResponseForStudent() {

    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }

    public int getCollaboration() {
        return collaboration;
    }

    public void setCollaboration(int collaboration) {
        this.collaboration = collaboration;
    }

    public int getComprehension() {
        return comprehension;
    }

    public void setComprehension(int comprehension) {
        this.comprehension = comprehension;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public ResponseForStudent(int participation, int collaboration, int comprehension, int progress, String recipient, String sender) {
        super(recipient, sender);
        this.participation = participation;
        this.collaboration = collaboration;
        this.comprehension = comprehension;
        this.progress = progress;
    }
}
