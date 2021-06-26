package competitiveCoding.string;

public class PermutationString {
    public static void main(String[] args) {
        String input = "123";
        permutation("", input);
    }

    public static  void permutation(String perm, String input){
        if(input.length()==0){
            System.out.println(perm+input);
        }else{
            int length=input.length();
            for(int i=0; i<length;i++){
                permutation(perm+input.charAt(i), input.substring(0,i)+input.substring(i+1,length));
            }
        }
    }
}
