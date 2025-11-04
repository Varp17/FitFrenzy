package com.example.gateway.service;

import com.example.gateway.model.RepEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RepService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void saveRepEvent(RepEvent event) {
        // Save in Redis for real-time session state
        String key = "session:" + event.getSessionId() + ":reps";
        redisTemplate.opsForList().rightPush(key, event);

        // Optional: set TTL to 1 day
        redisTemplate.expire(key, java.time.Duration.ofDays(1));

        // TODO: save in Postgres (session history) if needed
    }
}
