package string;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static int findMinLength(ArrayList<String> A){
        int min = A.get(0).length();

        for(String str : A){
            if(str.length() <min){
                min = str.length();
            }
        }
        return min;

    }

    public static void main(String[] args) {
        String[] A = {"abcdefgh", "abcdghijk", "abcdefgh"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(A));

        int minLength = findMinLength(list);

        String commonPrefix = findCommonPrefix(A, minLength);
        System.out.println(commonPrefix);
    }

    public static String findCommonPrefix(String[] A, int minLength){
        String result ="";
        for(int i=0; i<minLength;i++){
            char initial = A[0].charAt(i);
            for(int j=0; j<A.length;j++){
                if(A[j].charAt(i)!=initial) {
                    return result;
                }
            }
            result=result+initial;
        }
        return result;
    }
}
