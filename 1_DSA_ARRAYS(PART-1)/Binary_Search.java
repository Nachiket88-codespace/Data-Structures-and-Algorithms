import java.util.*;
public class Binary_Search {

    public static int search_Bin(int array[] , int key){
        int start = 0 ;
        int end = array.length-1 ; 

        while (start <= end) {
            int mid = (start + end)/2 ; 
            if(array[mid] == key){
                System.out.println("key found at index " + mid);
                return mid ; 
            }
            else if(key > array[mid]){
                start = mid + 1 ;
            }
            else{
                end = mid - 1 ;
            }
        }
        return -1 ;
    }
   public static void main(String[] args) {
    int array[] = {2,3,5,7,11,13,17,19,21} ; 
     Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter search key : ");
        int key = sc.nextInt() ; 

        System.out.println(search_Bin(array, key));
        sc.close();
   }
}