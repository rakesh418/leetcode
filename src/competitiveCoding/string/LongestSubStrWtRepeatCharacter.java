package competitiveCoding.string;

import java.util.HashMap;

public class LongestSubStrWtRepeatCharacter {
    public static void main(String[] args) {
        String input = "abcxabcbb123456";

        int j = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int length = input.length();
        int max = 0;
        int start=0;
        for(int i=0; i<length;i++)
        {
            if(hashMap.containsKey(input.charAt(i))){
                j=Math.max(j, hashMap.get(input.charAt(i))+1);
            }
//            max=Math.max(max,i-j+1);
            if(max<i-j+1){
                max=i-j+1;
                start=j;
            }
            hashMap.put(input.charAt(i), i);
        }
        System.out.println(max);
        System.out.println(input.substring(start, start+max));
    }
}
