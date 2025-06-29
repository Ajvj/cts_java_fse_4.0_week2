package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.debug("Debug message - useful for debugging during development.");
        logger.info("Info message - general application information.");
        logger.warn("Warning message - something might be wrong.");
        logger.error("Error message - something definitely went wrong.");
    }
}
