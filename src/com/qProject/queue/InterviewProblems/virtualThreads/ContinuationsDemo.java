//package com.qProject.queue.InterviewProblems.virtualThreads;
//
//import jdk.internal.vm.Continuation;
//import jdk.internal.vm.ContinuationScope;
//
//// make sure your compiler settings has : --enable-preview--add-exports java.base/jdk.internal.vm=ALL-UNNAMED
//
//public class ContinuationsDemo {
//    public static void main(String[] args) {
//        var continuations = getContinuation();
//        continuations.run();
//        System.out.println("Doing some other tasks");
//        continuations.run();
//        continuations.run();
//    }
//
//    private static Continuation getContinuation(){
//        var continuationScope = new ContinuationScope("Demo");
//        var continuation = new Continuation(continuationScope, () -> {
//            System.out.println('A');
//            Continuation.yield(continuationScope);
//            System.out.println("B");
//            Continuation.yield(continuationScope);
//            System.out.println("C");
//        });
//        return continuation;
//    }
//}
