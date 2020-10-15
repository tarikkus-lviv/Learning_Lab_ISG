package sample;

//program for sorting an array

public class Main {

    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 2};
        int temp;
        boolean Sorted = false;

        while(!Sorted){
            Sorted = true;
            for (int i=0; i<arr.length-1; i++){
                if (arr[i]<arr[i+1]){

                    Sorted = false;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
