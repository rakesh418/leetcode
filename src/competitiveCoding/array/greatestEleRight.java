package competitiveCoding.array;

import java.util.Arrays;

/*
Replace every element with the greatest element on right side
{16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class greatestEleRight {
    public static void main(String[] args) {

        int[] input = {16, 17, 4, 3, 5, 2};
        int max = -1;
        int length=input.length;
        for(int i=length-1; i>=0; i--){
            int value =input[i];
            input[i]=max;
            if(max<value){
                max = value;
            }
        }
        Arrays.stream(input).forEach(x-> System.out.print(x+","));
    }
}
