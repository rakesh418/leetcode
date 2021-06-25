package competitiveCoding.string;

public class ReverseStringSentence {
    public static void main(String[] args) {
        String sentence = " the sky is blue ";
        System.out.println(sentence);
        int startIndex=0, endIndex=sentence.length()-1, length=sentence.length();
        char[] sentenceChar = sentence.toCharArray();
        char[] reverseStringChar = reverse(sentenceChar,startIndex,endIndex,length);

        System.out.println(reverseStringChar);

        int start=0;
        int end=0;
        for(int i=0; i<reverseStringChar.length;i++){
            while(i<reverseStringChar.length && (Character.isLetter(reverseStringChar[i]) || Character.isDigit(reverseStringChar[i]))){
                i++;
            };
            end=i-1;
            reverse(reverseStringChar, start, end, end-start+1);
            while(i<reverseStringChar.length && reverseStringChar[i]==' '){
                i++;
            }
            start=i;
            end=i;
        }
        System.out.println(reverseStringChar);
    }

    public static char[] reverse(char[] sentence,int startIndex, int endIndex, int length){
        for (int i= startIndex; i<startIndex+length/2;i++,endIndex--){
            char ch = sentence[i];
            sentence[i] = sentence[endIndex];
            sentence[endIndex]=ch;
        }
        return sentence;
    }
}
