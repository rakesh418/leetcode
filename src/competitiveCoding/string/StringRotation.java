package competitiveCoding.string;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        String input = "abc";
        String rotatedWord="bca";

        Scanner scanner =new Scanner(System.in);
        String input1 = scanner.nextLine();
        scanner.close();

        System.out.println(input1);

        String concatWord=input+input;
        System.out.println(concatWord);
        if(concatWord.indexOf(rotatedWord)!=-1)
            System.out.println("Rotated String");
    }
}
