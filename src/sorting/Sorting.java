package sorting;

public class Sorting {

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


}
