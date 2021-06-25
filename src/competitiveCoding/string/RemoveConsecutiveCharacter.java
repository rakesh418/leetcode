package competitiveCoding.string;

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        String input = "cccaaabbbbbzzzz";
        int freq = 2;

        StringBuilder builder = new StringBuilder();

        int length = input.length();

        int index =0;
        //case1 : remove consecutive charater and replace by 1
        for(int i=0; i<length; i++){
            if(input.charAt(i)==input.charAt(index) && i!=length-1){
                continue;
            }else if(i!=length-1){
                builder.append(input.charAt(index));
                index=i;
            }else if (i!=index){
                builder.append(input.charAt(index));
            }else{
                builder.append(input.charAt(i));
            }
        }
        System.out.println(builder.toString());

        builder=new StringBuilder();
        index =0;
        int count=0;
        //case1 : remove consecutive charater and replace by 1
        for(int i=0; i<length; i++){
            if(input.charAt(i)==input.charAt(index) && i!=length-1){
                count++;
                continue;
            }else if(i!=length-1){
                if(count==1) {
                    builder.append(input.charAt(index));
                    index = i;
                }
            }else if (i!=index){
                builder.append(input.charAt(index));
            }else{
                builder.append(input.charAt(i));
            }
        }
        System.out.println(builder.toString());


        //case2 : remove consecutive with freq k charater
        builder = new StringBuilder();
        count=0;
        index=0;
        for(int i=0; i<length; i++){
            if(input.charAt(i)==input.charAt(index) && i!=length-1){
                count++;
                continue;
            }else if(i!=length-1){
                if(count!=2){
                    builder.append(input.substring(index,i));
                    count=0;
                }
                index=i;
            }else if (i!=index){
                if(count!=2){
//                    builder.append(input.charAt(index));
                    builder.append(input.substring(index,i));
                    count=0;
                }
            }else{
//                builder.append(input.charAt(i));
                builder.append(input.substring(i,i));
            }
        }
        System.out.println(builder.toString());
    }
}
