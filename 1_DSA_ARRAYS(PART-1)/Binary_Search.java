import java.util.*;
public class Binary_Search {

    public static int Binary_searching(int array[] , int keys){
        int start = 0 ; 
        int end = array.length-1 ; 
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(array[mid] == keys){
                System.out.println("key found !");
                return mid ; 
            }
            else if(keys > array[mid]){
                start = mid + 1 ;
            }
            else if(keys < array[mid]){
                end = mid-1 ; 
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter search key value : ");
        int key = sc.nextInt() ; 

        int num_array[] = {2,4,6,8,10,12,14,16,18,20,22} ; 

        int index = Binary_searching(num_array, key) ;
        if(index != -1){
            System.out.println("key found at index : "+index);
            System.out.println("found value is : "+num_array[index]);
        }
        else{
            System.out.println("key not found in num_list ");
        }

        sc.close();

    }
}