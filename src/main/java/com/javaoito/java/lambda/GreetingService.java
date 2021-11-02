package com.javaoito.java.lambda;

// SAM - single abstract method

@FunctionalInterface
public interface GreetingService {
    String greet(String firstName);
}
