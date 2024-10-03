package com.qProject.queue.InterviewProblems.patternMatching;

public class Sample {

    public static String process(Trade trade){
        return switch (trade){
            case Sell shell when shell.quantity() >= 99 -> "its a big order, processing "+shell.ticker()+ " we processed "+shell.quantity();
            case Sell sell -> "looks like you are selling: "+sell.ticker()+ " we processed "+sell.quantity();
            case Buy buy when buy.quantity()  >=99 -> "Large buy of "+buy.ticker()+ " "+buy.quantity();
            case Buy buy -> "looks like you are buying "+buy.ticker()+ " we processed "+buy.quantity();
            case null -> "Something is wrong, input is null, sending to tech team";
            default -> "what the hell??";
        };
    }
    public static void main(String[] args) {
        System.out.println(process(new Sell("GOOGL", 100)));
        System.out.println(process(new Sell("AMZN", 20)));
        System.out.println(process(new Buy("TSLA", 1)));
        System.out.println(process(new Buy("INTUIT", 100)));
        System.out.println(process(new Trade() {
        }));
        System.out.println(process(null));

    }

}
