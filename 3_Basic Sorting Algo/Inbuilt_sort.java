import java.util.*;
public class Inbuilt_sort {
    
    public static void main(String[] args) {
        int numbers[]  = {5,4,1,3,2,6,9,8,7} ; 

        // Arrays.sort(numbers);

        Arrays.sort(numbers , 2 , 8);

        for(int i=0 ; i < numbers.length ; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
