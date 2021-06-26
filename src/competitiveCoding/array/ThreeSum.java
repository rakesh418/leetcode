package competitiveCoding.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        int target = 0;
        List<List<Integer>> result= new ArrayList<>();

        for(int i = 0; i< nums.length-2;i++){
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for(int j=i+1; j<nums.length;j++){
                List<Integer> itmResult= new ArrayList<>();
                int twoSumTarget = target-nums[i];
                if(hashMap.containsKey(twoSumTarget-nums[j])){
                    itmResult.add(nums[i]);
                    itmResult.add(twoSumTarget-nums[j]);
                    itmResult.add(nums[j]);
                    result.add(itmResult);
                }else{
                    hashMap.put(nums[j],j);
                }
            }
        }
        System.out.println(result);
    }
}
