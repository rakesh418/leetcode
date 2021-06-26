package competitiveCoding.arithmetic;

public class Factorial {
    public static void main(String[] args) {
        int input =5;
        int factorial = 1;

        //Step 1
        while(input>0){
            factorial*=input;
            input-=1;
        }
        System.out.println(factorial);

        //Step 2 Recursion
        input=5;
        int factorial2  = factorial(input);
        System.out.println(factorial2);
    }

    public static int factorial(int n){
        int factorial;
        if(n==0)
            return 1;
        else
            return n* factorial(n-1);
    }
}
