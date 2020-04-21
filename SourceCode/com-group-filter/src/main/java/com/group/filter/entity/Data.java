package com.group.filter.entity;

/*
 * The Data class
 * */
public class Data {

	/*Instance variables*/
	private String displayName;
	
	private String uuid;
	
	private int score;
	
	private double value;
	
	private int status;
	
	
    
	public Data(String displayName, String uuid, int score, double value, int status) {
		this.displayName = displayName;
		this.uuid = uuid;
		this.score = score;
		this.value = value;
		this.status = status;
	}

	/*Getters and setters*/
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Data [displayName=" + displayName + ", uuid=" + uuid + ", score=" + score + ", value=" + value
				+ ", status=" + status + "]";
	}
}
