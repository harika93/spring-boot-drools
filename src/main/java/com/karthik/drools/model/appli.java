package com.karthik.drools.model;

import lombok.Data;

 @Data
public class appli {
	
	private int score;
	private String status;
	private boolean succ;

	 public void setStatus(String status) {
		 this.status = status;
	 }

	 public void setScore(int score) {
		 this.score = score;
	 }
 }
