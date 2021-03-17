package com.tts.feedback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//THESE RESPONSES GO TO THE INSTRUCTOR, BASED ON STUDENTS' AGGREGATED SURVEY ANSWERS (@LIONEL - DID
//WE BUILD THE AGGREGATION FUNCTIONALITY? I THINK NOT
@Entity
public class ResponseForInstructor extends Response {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int pace;
    private int clarity;
    private int comprehension;

    public ResponseForInstructor() {

    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getClarity() {
        return clarity;
    }

    public void setClarity(int clarity) {
        this.clarity = clarity;
    }

    public int getComprehension() {
        return comprehension;
    }

    public void setComprehension(int comprehension) {
        this.comprehension = comprehension;
    }
    public ResponseForInstructor(int pace, int clarity, int comprehension, String recipient, String sender) {
        super(recipient, sender);
        this.pace = pace;
        this.clarity = clarity;
        this.comprehension = comprehension;
    }
}
