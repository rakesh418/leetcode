package competitiveCoding.sorting;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = { 1, 11, 13, 5, 6, 7 };
        sort(arr);
    }

    public static void sort(int[] arr){

        int length = arr.length;

        for(int i=(length-1)/2; i>=0;i--){
            heapify(arr,length,i);
        }

        for(int i=length-1; i>0;i--){
            int swap = arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            heapify(arr,i,0);
        }

        Arrays.stream(arr).forEach(x-> System.out.print(x+","));
    }

    public static void heapify(int[] arr, int length, int index){
        int largest = index;
        int l = 2*index+1;
        int r = 2*index+2;

        if(l<length && arr[largest]<arr[l]){
            largest=l;
        }

        if(r<length && arr[largest]<arr[r]){
            largest=r;
        }
        if(largest!=index){
            int swap =arr[index];
            arr[index] = arr[largest];
            arr[largest] = swap;
            heapify(arr,length,largest);
        }

    }
}
