package com.example.gateway.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class RepEventHandler {

    // Client sends messages to /app/rep
    @MessageMapping("/rep")
    @SendTo("/topic/reps")  // Broadcast to all subscribed clients
    public RepEvent handleRepEvent(RepEvent event) throws Exception {
        System.out.println("Received rep event: user=" + event.getUserId()
                + ", session=" + event.getSessionId()
                + ", exercise=" + event.getExercise()
                + ", repIndex=" + event.getRepIndex()
                + ", angle=" + event.getMetrics().getAngle()
                + ", durationMs=" + event.getMetrics().getDurationMs());

        // Optionally: save to Redis or Postgres here

        return event;  // broadcast back to clients
    }
}
