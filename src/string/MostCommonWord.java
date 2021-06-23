package string;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob hit. a ball, hi hi hi hi hi the hit. BALL. flew far after it was hit";
//        String paragraph = "Bob. hIt baLl";
        String[] bannedWord = {"bob","hit"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        HashSet<String> banned = new HashSet<>();
        for(String str: bannedWord){
            banned.add(str);
        }

        String ans = "na";
        int maxCount=0;

        StringBuilder builder = new StringBuilder();

        char[] pargChar = paragraph.toCharArray();
        for(int i=0; i<pargChar.length;i++){
            char ch = pargChar[i];
            if(Character.isLetter(ch)){
                builder.append(Character.toLowerCase(ch));
                if(i!=pargChar.length-1)
                    continue;
            }
            if(builder.length()>0) {
                String word = builder.toString();
                if (!banned.contains(word)) {
                    int newCount = wordCount.getOrDefault(word, 0) + 1;
                    wordCount.put(word, newCount);
                    if (newCount > maxCount) {
                        ans = word;
                        maxCount = newCount;
                    }
                }
                builder = new StringBuilder();
            }
        }
        System.out.println(wordCount);
        System.out.println(ans);
    }
}
