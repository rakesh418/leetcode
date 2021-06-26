package competitiveCoding.array;

import java.util.Arrays;

public class ArrayRotationReversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int d=5;

        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

        Arrays.stream(arr).forEach(x-> System.out.print(x+","));
    }

    public static void reverse(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
