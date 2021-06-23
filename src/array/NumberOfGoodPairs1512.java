package array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfGoodPairs1512 {
    public static void main(String[] args) {
        int[] input = {1,2,3,1,1,3};
        int noOfPair = getGoodPair(input);
        System.out.println(noOfPair);
    }

    public static int getGoodPair(int[] input){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<input.length;i++){
            if(map.get(input[i])!=null){
                map.put(input[i],map.get(input[i])+1);
            }else{
                map.put(input[i],1);
            }
        }
        System.out.println(map.values());
        int sum=0;
        for(int element : map.values().stream().collect(Collectors.toList())){
            sum += element*(element-1)/2;
        }
        return sum;
    }
}
