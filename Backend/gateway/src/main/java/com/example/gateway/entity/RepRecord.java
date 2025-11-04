package com.example.gateway.entity;

import jakarta.persistence.*;

@Entity
public class RepRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exercise;
    private int repIndex;
    private long timestamp;

    // getters and setters
    public Long getId() { return id; }
    public String getExercise() { return exercise; }
    public void setExercise(String exercise) { this.exercise = exercise; }
    public int getRepIndex() { return repIndex; }
    public void setRepIndex(int repIndex) { this.repIndex = repIndex; }
    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
