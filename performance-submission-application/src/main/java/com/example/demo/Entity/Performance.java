package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Performance {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer keyID;         // Primary Key
    private String performance; // Access By Admin Only
    private String feedback;  // Access By Employee Only

    // Empty Constructor
    public Performance() {
    }

	public Performance(Integer keyID, String performance, String feedback) {
		super();
		this.keyID = keyID;
		this.performance = performance;
		this.feedback = feedback;
	}

	public Integer getKeyID() {
		return keyID;
	}

	public void setKeyID(Integer keyID) {
		this.keyID = keyID;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

  
}
