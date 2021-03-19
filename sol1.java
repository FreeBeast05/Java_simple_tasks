package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sol1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int size=Integer.parseInt(s);
        String[] a=reader.readLine().split(" ");
        String[] b=reader.readLine().split(" ");
        int maxim=0;
        int curr_max=0;
        int[] max_pos= new int[size];
        for (int i=0; i<size; i++){
            int elem =Integer.parseInt(a[i]);
            if (elem>maxim){
                maxim=elem;
                curr_max=i;
            }
            max_pos[i]=curr_max;
        }
        int index_1=0, index_2=0;
        for (int i=0; i<size; i++){
            int elem=Integer.parseInt(b[i]);
            curr_max=elem+Integer.parseInt(a[max_pos[i]]);
            if (curr_max>maxim){
                maxim=curr_max;
                index_1=max_pos[i];
                index_2= i;
            }
        }
        System.out.print(index_1+" "+index_2);
    }
}

