public class Max_subarray {

    public static int max_of_subarray(int numbers[]){
        int max = Integer.MIN_VALUE ; 
        for(int i=0 ; i < numbers.length ; i++){
            int start=i ; 
            for(int j=i ;j <numbers.length ; j++){
                int end=j ; 
                int largest = 0 ; 
                for(int k = start ; k <= end ; k++){
                    largest = largest + numbers[k] ; 
                    }
                    if(largest > max){
                        max = largest ; 
                    }
            }
        }
        return max ; 
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20,22,25} ; 

        int maximum_sum = max_of_subarray(numbers) ; 
        System.out.println("maximum sum of subarray is : " + maximum_sum);
    }
}