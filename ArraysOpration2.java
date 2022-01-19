package com.company.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asseel tarish on 19/01/2022.
 */
public class ArraysOpration2 {

    int []x;
    int numofelements;

    // default constructor initializing
    public ArraysOpration2(){
        x=new int[5];
        numofelements=0;
    }

    // method for adding degrees
    public int add(int e){
       if (numofelements<x.length) {
           x[numofelements] = e;
           numofelements++;
           return 0;
       }
       return -1;
    }

    public static void main(String[] args) {
        ArraysOpration2 test=new ArraysOpration2();
        Scanner in=new Scanner(System.in);
        System.out.println("input element");

        for (int i = 0; i <7 ; i++) {
            if (test.add(in.nextInt())==0)
                System.out.println("added successfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }

    }
}
