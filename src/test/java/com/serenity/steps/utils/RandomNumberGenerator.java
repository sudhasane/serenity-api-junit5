package com.serenity.steps.utils;

import java.sql.Timestamp;

public class RandomNumberGenerator {
    static final RandomNumberGenerator instance = new RandomNumberGenerator();

    private RandomNumberGenerator(){}

    public static RandomNumberGenerator getInstance() {
        return instance;
    }

    public synchronized String generateUniqueNumber() throws InterruptedException {
        Thread.sleep(100);
        return new Timestamp(System.currentTimeMillis()).toString().replaceAll("[^0-9]", "");
    }
}
