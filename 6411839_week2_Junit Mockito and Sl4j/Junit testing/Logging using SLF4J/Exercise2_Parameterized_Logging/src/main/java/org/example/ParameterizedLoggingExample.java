package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "ajay";
        int loginAttempts = 3;

        logger.info("User {} has logged in successfully.", username);
        logger.warn("User {} has attempted to login {} times unsuccessfully.", username, loginAttempts);

        double transactionAmount = 1500.75;
        String transactionId = "TXN12345";

        logger.info("Transaction {} completed successfully with amount ₹{}.", transactionId, transactionAmount);
    }
}
