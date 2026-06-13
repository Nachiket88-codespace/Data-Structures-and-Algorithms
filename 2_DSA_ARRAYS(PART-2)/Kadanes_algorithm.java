public class Kadanes_algorithm {
    
    public static int kadanes_max_sum(int  list_of_numbers[]){
        int current_sum = 0 ; 
        int max_sum = Integer.MIN_VALUE ; 

        for(int i=0 ; i < list_of_numbers.length ; i++){
            current_sum = current_sum + list_of_numbers[i]  ;
            if(current_sum < 0){
                current_sum = 0 ;
            }
            max_sum = Math.max(max_sum, current_sum) ; 
        }
        return max_sum ; 
    }
    public static void main(String[] args) {
        int list_of_numbers[] = {-2,-3,4,-1,-2,1,5,-3} ; 

        int value = kadanes_max_sum(list_of_numbers) ; 
        System.out.println("the max value of subarray is : " + value);
    }
}
