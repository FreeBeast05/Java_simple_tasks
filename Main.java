package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int size=Integer.parseInt(s);
        String[] a=reader.readLine().split(" ");
        String[] b=reader.readLine().split(" ");
        int[] maxim={0, 0};
        int i=0;
        for (int j =i; j<size; j++) {
            int elem1=Integer.parseInt(a[maxim[0]]);
            int elem2=Integer.parseInt(b[maxim[1]]);
            int elem3=Integer.parseInt(a[i]);
            int elem4=Integer.parseInt(b[j]);
            if (elem1 + elem2 < elem3+elem4) {
                maxim[0]=i;
                maxim[1]=j;
            }
            if (j==size-1){
                i++;
                j=i;
            }
        }

        System.out.print(maxim[0]+" "+maxim[1]);
    }
}