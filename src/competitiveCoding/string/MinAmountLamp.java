package competitiveCoding.string;

public class MinAmountLamp {
    public static void main(String[] args) {
        String input = ".*......***...**..";
        int length = input.length();
        int i=0;
        while(i<length && input.charAt(i)=='.' ){
            i++;
        }
        if(length==i){
            System.out.println(length);
            System.out.println(Math.ceil(length*1.0/3));
        }

        StringBuilder copyInput = new StringBuilder(length);
        i=0;
        while(i<length){
            copyInput.append(input.charAt(i));
            i++;
        }
        System.out.println(copyInput.toString());
        for(i=0; i<length;i++){
            char ch = input.charAt(i);
//            copyInput.append(input.charAt(i));
            if(i==0 && ch=='*'){
                copyInput.setCharAt(i+1, '*');
            }else if(i==length-1 && ch=='*'){
                copyInput.setCharAt(i-1, '*');
            }else if(ch=='*'){
                copyInput.setCharAt(i-1, '*');
                copyInput.setCharAt(i+1, '*');
            }
        }
        System.out.println(copyInput.toString());
        String[] split = copyInput.toString().split("\\*");

        int ans = 0;
        for(String str : split){
            if(str.length()==0)
                continue;
            ans += Math.ceil(str.length()*1.0/3);
        }
        System.out.println(ans);



    }
}
