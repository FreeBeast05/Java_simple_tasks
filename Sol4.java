package com.company;

import java.util.Scanner;

public class sol4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();
        int res = func1(n, k);
        System.out.println(res);
    }
    public static int func1(int n, int k) {
        return n > 1 ? (func1(n - 1, k) + k - 1) % n + 1 : 1;
    }
}
