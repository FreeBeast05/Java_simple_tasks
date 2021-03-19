package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Sol3 {
    public static void main(String[] args) throws IOException {
        Scanner reader= new Scanner(System.in);
        int size1=reader.nextInt();
        int[] a= new int[size1];
        for (int i = 0; i < a.length; i++) {
            a[i] =reader.nextInt();
        }
        int size2=reader.nextInt();
        int[] b= new int[size2];
        for (int i = 0; i < b.length; i++) {
            b[i] =reader.nextInt();
        }
        int sum=reader.nextInt();
        reader.close();
        int answer=0;
        int index_start=0;
        for ( int i=size2-1; i>-1; i--){
            for (int j=index_start; j < size1; j++){
                if (sum==b[i]+a[j]){
                    answer++;
                }
                else if (b[i]+a[j]>sum){
                    index_start=j;
                    break;
                }

            }
        }
        System.out.println(answer);
    }
}
