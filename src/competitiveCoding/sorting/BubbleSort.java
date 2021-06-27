package competitiveCoding.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = { 5, 9, 4, 2, 1,3};
        int[] arr = { 1, 2, 3, 4, 6,5};
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0; j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
            Arrays.stream(arr).forEach(x-> System.out.print(x+","));
            System.out.println("");
        }
        Arrays.stream(arr).forEach(x-> System.out.print(x+","));
    }
}
