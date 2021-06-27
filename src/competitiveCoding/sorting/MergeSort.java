package competitiveCoding.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr ={ 12, 11, 13, 5, 6, 7 };
        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(x-> System.out.print(x+","));
    }

    public static void mergeSort(int[] arr, int low, int high ){
       sort(arr,low,high);
    }

    public static void sort(int[] arr, int low , int high){
        if(low>=high)
            return;
        int mid = (low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] left = new int[n1];
        for(int i=0; i<n1;i++){
            left[i]=arr[i+low];
        }
        int[] right = new int[n2];
        for(int i=0; i<n2;i++){
            right[i]=arr[i+mid+1];
        }

        int i=0,j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }

}
