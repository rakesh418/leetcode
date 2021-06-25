package design.string;

public class LongestCommonPrefix2 {
    public static void main(String[] args) {
        String[] input = {"aab","aabb","aabacc"};
        String prefix= input[0];

        for(int i =1; i<input.length; i++){
            prefix = findCommonPrefix(prefix,input[i]);
            if(prefix.length()==0){
                break;
            }
        }
        System.out.println(prefix);
    }

    public static String findCommonPrefix(String prefix, String str){
        int i =0;
        while(i<prefix.length() && i<str.length() && prefix.charAt(i)==str.charAt(i)){
            i++;
        }
        return prefix.substring(0,i);
    }
}
