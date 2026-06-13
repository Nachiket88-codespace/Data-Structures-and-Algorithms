// import java.util.* ; 
public class Largest_in_array {

    public static int largest_num_array(int list_numbers[]){
        int largest = Integer.MIN_VALUE ; 
        for(int i=0 ; i < list_numbers.length ; i++){
            if(list_numbers[i] > largest){
                largest = list_numbers[i] ; 
            }
        }
        return largest ; 
    }

   public static void main(String[] args) {
    int list_numbers[] = {2,4,6,8,10,12,14,16,18,20,22,25};

    int max_value = largest_num_array(list_numbers) ; 
    System.out.println("largest num in arrray is : " + max_value);
    
   }
}
