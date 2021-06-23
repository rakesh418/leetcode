package array;

import java.util.Arrays;
import java.util.List;

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        int[] inputArr = {2,5,1,3,4,7};
        int n = inputArr.length;
        int[] finalArr = shuffle(inputArr, n);
        System.out.println(Arrays.toString(finalArr));

        System.out.println(Arrays.asList(finalArr));
    }

    public static int[] shuffle(int[] inputArr, int n){
        int i=0, j=n/2;
        int[] tempArr = new int[n];
        for(int k=0; k<n-1;k+=2){
            tempArr[k]=inputArr[i];
            tempArr[k+1]=inputArr[j];
            i++;
            j++;
        }
        return tempArr;
    }
}
