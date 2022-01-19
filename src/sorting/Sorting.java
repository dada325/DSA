package sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        Random rand =new Random ();
        int[] numbers = new int[10];

        for(int i=0;i< numbers.length;i++) {
            numbers[i] = rand.nextInt(100);
        }

            System.out.println("Before");
            printArray(numbers);

            quickSort(numbers,0, numbers.length-1);
            System.out.println("After");
            printArray(numbers);

    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }


    public static void bubbleSort(int[] arr){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }


    public static void selectionSort(int[] arr){
        int minIndex;
        for (int i = 0; i<arr.length-1;i++){
            minIndex = i;
            for (int j = i+1; j < arr.length-1;j++){
                if (arr[minIndex]>arr[j]){
                    // 记录最小值的下标
                    minIndex = j;
                }
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertSort(int[] arr) {
        // 从第二个数开始，往前插入数字
        for (int i = 1; i < arr.length; i++) {
            // j 记录当前数字下标
            int j = i;
            // 当前数字比前一个数字小，则将当前数字与前一个数字交换
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                // 更新当前数字下标
                j--;
            }
        }
    }


    public static void mergeSort(int[] arr){


    }

    public static void quickSort(int[] array, int lowIndex, int highIndex){
        if (lowIndex>=highIndex){
            return;
        }
        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){

            while(array[leftPointer]<= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer<rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer,rightPointer);

        }
        swap(array,leftPointer,highIndex);
        
        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);

    }

    public static void randomSort(int[] arr){
    

    }

}
