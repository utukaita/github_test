package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            System.out.printf("%d:%b\n", i, isPrime(i));
        }
        int a = 387;
        int b = 6381;
        System.out.printf("%d %d:%d\n", a, b, smallestDivisible(a, b));
        String utu = String.format("%daasi", a);
        System.out.println(utu);
    }
    public static boolean isPrime(int n) {
        for ( int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0)
                return false;
        }
        return true;

    }
    public static int smallestDivisible(int a, int b){
        boolean counting = true;
        int n = 1;
        while (counting){
            if(n % a == 0 && n % b == 0)
                return n;
            n++;
        }
        return 0;
    }
}
