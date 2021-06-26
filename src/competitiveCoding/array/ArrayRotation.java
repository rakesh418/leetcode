package competitiveCoding.array;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int d=3;

        for(int j=0; j<d; j++){
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        }
        Arrays.stream(arr).forEach(x-> System.out.print(x+","));
    }
}
