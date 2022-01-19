package com.company.dataStructure;

import java.util.Arrays;

/**
 * Created by asseel tarish on 19/01/2022.
 */
public class ArrayOpration {
    public static void main(String[] args) {
        int [] array={11,12,13,14,15};
        System.out.println("Array before reverse:");
        System.out.println(Arrays.toString(array));

        System.out.println("after the reverse");
        System.out.println(Arrays.toString(reverse(array)));
        System.out.println("after the left shift");
        System.out.println(Arrays.toString(left_shift(array)));
        System.out.println("after the right shift ");
        System.out.println(Arrays.toString(right_shift(array)));
    }
    // method to shift array elements from right side
    public static int[] right_shift(int[] a) {
        int temp=a[a.length-1];

        for(int i=a.length-1;i>0;i-- ){
            a[i]=a[i-1];
        }
        a[0]=temp;
        return a;
    }

        // method to shift array elements from left side
    public static int[] left_shift(int[] a) {
        int temp=a[0];

        for(int i=0;i<a.length/2;i++ ){
           a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        return a;
    }

    //method to reverse an array elements
    public static int[] reverse(int[] a) {
        int temp;
        int n=a.length-1;
        for(int i=0;i<a.length/2;i++ ){
            temp=a[i];
            a[i]=a[n];
            a[n]=temp;
            n--;
        }
        return a;
    }

}
