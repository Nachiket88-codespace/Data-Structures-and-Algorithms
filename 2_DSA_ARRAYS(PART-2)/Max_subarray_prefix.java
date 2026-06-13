public class Max_subarray_prefix {

    public static int prefix_sum_arrays(int list_numbers[]){

        int prefix_array[] = new int[list_numbers.length] ; 
        prefix_array[0] = list_numbers[0] ; 
        for(int i=1 ; i < list_numbers.length ; i++){
            prefix_array[i] = prefix_array[i-1] + list_numbers[i] ; 
        }
        System.out.print("printing original array : ");
        for(int k=0 ; k < list_numbers.length ; k++){
            System.out.print(list_numbers[k] + " , ");
        }
        System.out.println();
        System.out.println("=====================================");
        System.out.print("printing prefix array : ");
        for(int l=0 ; l < prefix_array.length ; l++){
            System.out.print(prefix_array[l] + " , ");
        }
        System.out.println();
        System.out.println("=====================================");

        int max_value = Integer.MIN_VALUE ; 

        for(int i=0 ; i < list_numbers.length ; i++){
            int start = i ;
            for(int j=i ; j < list_numbers.length ; j++){
                int end = j ; 
                // int prefix_sum = 0 ;

                  int prefix_sum = (start == 0)? prefix_array[end] : prefix_array[end] -prefix_array[start-1] ; 
                
                if(prefix_sum > max_value){
                    max_value = prefix_sum ;
                }
            }
        }
        return max_value ;
    }

    public static void main(String[] args) {
        int list_numbers[] = {2,4,6,8,10} ; 

        int max_of_subarray = prefix_sum_arrays(list_numbers) ; 
        System.out.println("so highest value of sum of subarray is : " + max_of_subarray);
    }
}