package string;

public class PalindromeNumber {
    public static void main(String[] args) {

        //Step 1
        int number =1234321;
        int temp = number ;
        int r;
        int sum=0;
        while(number>0){
            r=number%10;
            sum=(sum*10)+r;
            number=number/10;
        }
        if(sum==temp){
            System.out.println("Palindrome: Step1");
        }

        //Step 2
        String input2 = "12343212";
        boolean flag = true;
        for(int i= 0, j=input2.length()-1; i<input2.length()/2; i++, j--){
            if(input2.charAt(i)==input2.charAt(j))
                continue;
            else{
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("palindrome: Step2");
        }

    }
}
