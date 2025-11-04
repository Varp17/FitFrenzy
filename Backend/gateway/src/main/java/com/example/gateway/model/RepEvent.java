package com.example.gateway.model;

public class RepEvent {
    private String type;
    private String userId;
    private String sessionId;
    private String exercise;
    private int repIndex;
    private long timestamp;

    // Getters & Setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }
    public String getExercise() { return exercise; }
    public void setExercise(String exercise) { this.exercise = exercise; }
    public int getRepIndex() { return repIndex; }
    public void setRepIndex(int repIndex) { this.repIndex = repIndex; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
