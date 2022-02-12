package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> a = new ArrayList<>();
    String[] s = scanner.nextLine().split("");
    Integer[] ints = new Integer[s.length];
    for (int i = 0;i<s.length;i++){
        ints[i]=Integer.parseInt(s[i]);
    }
    Collections.addAll(a,ints);
    Integer[] half1 = new Integer[ints.length/2];
    Integer[] half2 = new Integer[ints.length-half1.length];
    int prod1=1;
    int prod2=1;
    int sum1=0;
    int sum2=0;
    for (int i =0; i<half1.length; i++){
        prod1=prod1*half1[i];
        sum1=sum1+half1[i];
    }
        for (int i =0; i<half2.length; i++){
            prod2=prod2*half2[i];
            sum2=sum2+half2[i];
        }
        System.out.println(prod1);
        System.out.println(sum1);
        System.out.println(prod2);
        System.out.println(sum2);
    }
}
