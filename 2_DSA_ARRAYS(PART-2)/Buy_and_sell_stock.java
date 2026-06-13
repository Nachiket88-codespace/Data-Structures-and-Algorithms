// import java.util.*;
public class Buy_and_sell_stock {
    
    public static int Stock_track(int prices[]){
        int buyprice = Integer.MAX_VALUE ; 
        int max_profit = 0 ;

        for(int i=0 ; i < prices.length ; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice ; 
                max_profit = Math.max(max_profit , profit) ; 
            }
            else{
                buyprice = prices[i] ; 
            }
        }
        return max_profit ; 
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4} ; 

        int global_profit = Stock_track(prices) ; 
        System.out.println(global_profit);
    }
}
