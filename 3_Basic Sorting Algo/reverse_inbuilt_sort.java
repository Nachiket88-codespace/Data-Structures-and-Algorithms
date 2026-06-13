import java.util.Arrays;
import java.util.Collections;
public class reverse_inbuilt_sort {
    
    public static void main(String[] args) {
        Integer numbers[] = {5,4,1,3,2,6,9,8,7} ; 

        // Arrays.sort(numbers , Collections.reverseOrder());

        Arrays.sort(numbers , 1 , 8 , Collections.reverseOrder() );

        for(int i=0 ; i < numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
