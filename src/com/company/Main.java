package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("toplam: " + ciftFibonacciToplami(4000000));
    }

    // 1 2 3 5 8 13 21 34 55 89

    public static int ciftFibonacciToplami(int n) {
        int oncekiFibonacci = 1;
        int mevcutFibonacci = 2;
        int ciftFibonacciToplami = 0;
        do {
            if (mevcutFibonacci % 2 == 0) {
                ciftFibonacciToplami += mevcutFibonacci;
                System.out.println(mevcutFibonacci);
            }

            int yeniFibonacci = oncekiFibonacci + mevcutFibonacci;
            oncekiFibonacci = mevcutFibonacci;
            mevcutFibonacci = yeniFibonacci;
        } while (mevcutFibonacci < n);

        return ciftFibonacciToplami;
    }
}
