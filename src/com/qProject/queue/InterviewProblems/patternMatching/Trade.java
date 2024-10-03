package com.qProject.queue.InterviewProblems.patternMatching;

public interface Trade {}
record Sell(String ticker, Integer quantity) implements Trade{}
record Buy(String ticker, Integer quantity) implements Trade{}

