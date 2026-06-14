public class Kadanes_algorithm {

    public static void optimized(int array[]){
        int max = Integer.MIN_VALUE ; 
        int curr_sum = 0 ;

        for(int i=0 ; i<array.length ; i++){
            curr_sum = curr_sum + array[i] ; 

            if(curr_sum < 0){
                curr_sum = 0 ;
            }
            
            if(max < curr_sum){
                max = curr_sum ; 
            }
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};

        optimized(array);
    }
}
