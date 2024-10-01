package com.qProject.queue.InterviewProblems.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    // function to generate all teh prime numbers upto sqrt(n)
    public static List<Long> simpleSeive(long limit){
        boolean[] isPrime = new boolean[(int) (limit+1)];
        Arrays.fill(isPrime, true);
        List<Long> primes = new ArrayList<>();
        for(long p =2; p*p < limit; p++) {
            if(isPrime[(int) p]) {
                for (long mul=p*p; mul <= limit; mul++){
                    isPrime[(int) mul] = false;
                }
            }
        }
        for (long p=2; p <= limit; p++){
            if(isPrime[(int) p]){
                primes.add(p);
            }
        }
        return primes;
    }

    // function to find all primes in the range[low, high]
    public static List<Long> segmentedSeive(long low, long high){
        // find all the prime upto sqr(high)
        long limit = (long) Math.sqrt(high)+1;
        List<Long> primes = simpleSeive(limit);

        // create a array to mark the prime
        boolean[] isPrimeSegment = new boolean[(int) (high - low +1)];
        Arrays.fill(isPrimeSegment, true);
        // mark non primes using the primes found in step1
        for(long prime: primes){
            long start = Math.max(prime*prime, (low+ prime -1)/prime*prime);
            // mark all the multiple of primes as non prime
            for (long j = start; j<= high; j += prime){
                isPrimeSegment[(int) (j-low)] = false;
            }
        }

        // collect all the primes in this segment
        List<Long> primeNumbers = new ArrayList<>();
        for(long i=0; i<= high; i++){
            if(isPrimeSegment[(int) (i-low)] && i > 1){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        long n = 100L;
        List<Long> primes = segmentedSeive(1, n);
        for(long prime: primes){
            System.out.println(prime);
        }
    }

}
