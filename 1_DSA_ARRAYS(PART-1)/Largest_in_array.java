import java.util.*;
public class Largest_in_array {

    public static int find_largest(int array[]){
        int largest = Integer.MIN_VALUE ; 
        for(int i=0 ; i<array.length ; i++){
            if(array[i] > largest){
                largest = array[i] ; 
            }
        }
        return  largest ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int num_array[] = {5,2,11,4,89,50,97,100,23,14,18} ; 

        int ans = find_largest(num_array) ; 
        System.out.println("final ans = " + ans);

        sc.close();
    }
}