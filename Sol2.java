package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int size = Integer.parseInt(s);
        double[][] massiv = new double[size][2];
        for (int i = 0; i < size; i++) {
            String[] a = reader.readLine().split(" ");
            massiv[i][0] = Double.parseDouble(a[0]);
            massiv[i][1] = Double.parseDouble(a[1]);
        }
        double res = 0;
        double x1 = massiv[0][0];
        double y1 = massiv[0][1];
        for (int i=size-1; i>=0; i--){
            double x2= massiv[i][0];
            double y2 = massiv[i][1];
            res+=function1(x1, x2, y1,y2);
            x1=x2;
            y1=y2;
        }
        System.out.println(res);
    }
    public static double function1(double x1, double x2, double y1,double y2){
        return (x1 - x2) * (y1 + y2)/2;

    }
}


