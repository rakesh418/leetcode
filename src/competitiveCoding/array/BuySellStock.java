package competitiveCoding.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuySellStock {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,2,4,8,9,5,1,5);
        int profit = maxProfit(list);
        System.out.println(profit);
    }

    public static int maxProfit(List<Integer> list){
        int profit = 0;
        int ans=0;
        if(list.size()==0)
            return profit;
        int boughtPrice=list.get(0);
        for(int i =1; i< list.size();i++){
            if(list.get(i)<boughtPrice){
                boughtPrice= list.get(i);
                ans=ans+profit;
                profit=0;
            }else{
                if(list.get(i)-boughtPrice>=profit){
                    profit=list.get(i)-boughtPrice;
                }else{
                    ans+=profit;
                    profit=0;
                    boughtPrice=list.get(i);
                }
            }
        }
        return ans+profit;
    }
}
