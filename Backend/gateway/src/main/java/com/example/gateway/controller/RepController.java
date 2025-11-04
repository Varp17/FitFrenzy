package com.example.gateway.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class RepController {

    // Client sends to /app/rep
    @MessageMapping("/rep")
    @SendTo("/topic/reps") // broadcast to all subscribers
    public RepEvent broadcastRep(RepEvent repEvent) throws Exception {
        // Here you can save to DB or Redis if needed
        System.out.println("Received rep: " + repEvent.getExercise() + " #" + repEvent.getRepIndex()
                + " from user " + repEvent.getUserId());
        return repEvent; // broadcast to clients
    }
}
