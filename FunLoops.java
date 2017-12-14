package com.company;

public class FunLoops {
    public static boolean isConsecutive(long n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += i;
            if (total == n) {
                return true;
            } else if (total > n) {
                return false;
            }
        };
        return false;
    }

    public static void printMagicSquares(int n){
        int magicSquaresPrinted = 0;
        for (long i = 0; magicSquaresPrinted < n; i++){
            if ((Math.sqrt(i) % 1 == 0) && isConsecutive(i)){
                System.out.println(i);
                magicSquaresPrinted++;
            }
        }
    }

    public static int lcm(int x, int y){
        for(int i = Math.max(x,y); i < x * y; i++){
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return x * y;
    }
}
