package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 1, 9, 18};

        for (int i=0; i<arr.length-1; i++){
            for (int j=i-1; j<arr.length-1; j++){
                if (arr[i]>arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                    System.out.println(arr[i]);
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
