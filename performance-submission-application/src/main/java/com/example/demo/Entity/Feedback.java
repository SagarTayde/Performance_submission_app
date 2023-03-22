package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer feedbackEmployeeID;
    private String feedbackTobeSubmitted;

    // Empty Constructor
    public Feedback() {
    }

    // Parameters Constructor
    public Feedback(Integer feedbackEmployeeID, String feedbackTobeSubmitted) {
    	this.feedbackEmployeeID = feedbackEmployeeID;
    	this.feedbackTobeSubmitted = feedbackTobeSubmitted;
    }

    // Getters & Setters
    public Integer getFeedbackEmployeeID() {
        return feedbackEmployeeID;
    }

    public void setFeedbackEmployeeID(Integer feedbackEmployeeID) {
    	this.feedbackEmployeeID = feedbackEmployeeID;
    }

    public String getFeedbackTobeSubmitted() {
        return feedbackTobeSubmitted;
    }

    public void setFeedbackTobeSubmitted(String feedbackTobeSubmitted) {
    	this.feedbackTobeSubmitted = feedbackTobeSubmitted;
    }
}
