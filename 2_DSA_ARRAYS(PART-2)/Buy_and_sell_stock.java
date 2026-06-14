// import java.util.*;
public class Buy_and_sell_stock {

    public static void max_profit_ans(int price[]){
        int profit = 0 ; 
        int max_profit = Integer.MIN_VALUE ; 

        int buy_price = price[0] ; 
        for(int i=1 ; i<price.length ; i++){
            if(buy_price > price[i]){
                buy_price = price[i]  ;
            }
            else{
                profit = price[i] - buy_price ; 
                max_profit = Math.max(max_profit, profit) ;
            }
        }
        System.out.println(max_profit);
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4} ; 

        max_profit_ans(price);
    }
}
