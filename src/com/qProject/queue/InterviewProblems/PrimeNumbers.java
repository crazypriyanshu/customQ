package com.qProject.queue.InterviewProblems;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumbers {

    public static void addPrimeFactor(int num, Set<Integer> primes) {
        while(num % 2 == 0){
            primes.add(2);
            num /= 2;
        }
        // check for odd factors :
        for (int i = 3; i*i <= num; i+=2) {
            while (num % i == 0) {
                primes.add(i);
                num /= i;
            }
        }
        if(num > 2){
            primes.add(num);
        }
    }

    public static int distinctPrimeDivisors(int[] A) {
        Set<Integer> primes = new HashSet<>();
        for (int num: A){
            if (num > 0) {
                addPrimeFactor(num, primes);
            }
        }
        return primes.size();


    }

    public static void main(String[] args) {
        int[] A = {96, 98 , 5, 41, 80};
        int res = distinctPrimeDivisors(A);
        System.out.println(res);
    }
}
