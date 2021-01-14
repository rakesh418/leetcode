package binaryTree;

import java.util.HashMap;
import java.util.Map;

public class PreInToPost {

    private static int preIndex=0;

    public static void printPostTraversal(int[] in, int[] pre, int stIndex, int endIndex, HashMap<Integer, Integer> hm){
        if(stIndex>endIndex)
            return;
        int inIndex = hm.get(pre[preIndex]);
        preIndex++;
        printPostTraversal(in,pre,stIndex,inIndex-1,hm);
        printPostTraversal(in,pre,inIndex+1,endIndex,hm);
        System.out.print(in[inIndex] + " ");
    }

    public static void main(String[] args) {
        int[] in = {4,2,5,1,3,6};
        int[] pre = {1,2,4,5,3,6};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<in.length;i++){
            hm.put(in[i],i);
        }
        printPostTraversal(in,pre,0,in.length-1,hm);
    }
}
