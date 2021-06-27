package competitiveCoding.string;

public class Anagram {
    public static void main(String[] args) {
        String word = "YMARY";
        String anagram="ARMYY";

        System.out.println(isAnagram(word,anagram));
    }

    public static boolean isAnagram(String word, String anagram){
        if(word.length()!=anagram.length())
            return false;
        for(char ch : word.toCharArray()){
            int index = anagram.indexOf(ch);
            if(index!=-1){
                anagram =anagram.substring(0,index)+anagram.substring(index+1,anagram.length());
            }else
                return false;
        }
        return anagram.isEmpty();
    }
}
