package competitiveCoding.array;

import javax.swing.*;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,3,5,6};
        int target= 8;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] result = new int[2];

        for(int i=0; i<numbers.length; i++){
            if(hashMap.containsKey(target-numbers[i])){
                result[1]=i;
                result[0]=hashMap.get(target-numbers[i]);
//                System.out.println(result[0] +"-"+result[1]);
            }else{
                hashMap.put(numbers[i],i);
                System.out.println(hashMap);
            }
            System.out.println(result[0] +"-"+result[1]);
        }
    }
}
