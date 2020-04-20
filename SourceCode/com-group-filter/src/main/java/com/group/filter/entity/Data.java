package com.group.filter.entity;

public class Data {

	private String displayName;
	
	private String uuid;
	
	private int score;
	
	private double value;
	
	private boolean status;

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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Data [displayName=" + displayName + ", uuid=" + uuid + ", score=" + score + ", value=" + value
				+ ", status=" + status + "]";
	}
}
