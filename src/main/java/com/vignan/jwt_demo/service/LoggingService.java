package com.vignan.jwt_demo.service;

import com.vignan.jwt_demo.model.LogEntry;
import com.vignan.jwt_demo.repository.LogEntryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoggingService {

    private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    @Autowired
    private LogEntryRepository logEntryRepository;

    public void logAction(String username, String action, String request, String response) {
        logger.info("User: {}, Action: {}, Request: {}, Response: {}", username, action, request, response);

        LogEntry logEntry = new LogEntry();
        logEntry.setUsername(username);
        logEntry.setAction(action);
        logEntry.setRequest(request);
        logEntry.setResponse(response);
        logEntry.setTimestamp(LocalDateTime.now());
        logEntryRepository.save(logEntry);
    }
}