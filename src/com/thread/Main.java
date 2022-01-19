package com.thread;
import sorting.Sorting;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,32,43,45,6};
        int [] arrAfter;
        sorting.Sorting.bubbleSort(arr);

        for (int j : arr) {
            System.out.println(j);
        }

        int [] arr2 = new int[3];
        arr2[0] = 1;
        System.out.println(arr2[0]);


    }
}
