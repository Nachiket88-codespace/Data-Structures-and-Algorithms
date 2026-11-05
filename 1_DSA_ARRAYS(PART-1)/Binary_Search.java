import java.util.*;
public class Binary_Search {

    public static int binary_search(int num_list[] , int search_key){
        int start = 0 ;
        int end = num_list.length-1 ; 
        

        while(start <= end){
            int mid = (start + (end - start))/2 ; 

            if(num_list[mid] == search_key){
                return  mid ; 
            }
            else if(search_key > num_list[mid]){
                start = mid + 1 ;
            }
            else if(search_key < num_list[mid]){
                end = mid - 1 ;
            }
        }
        return  -1 ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter your key value : ");
        int key ; 
        key = sc.nextInt() ; 

        int array_list[] = {2,4,6,8,10,12,14,16} ;
        System.out.println("----------------------------------");
        
        int index = binary_search(array_list, key) ; 
        System.out.println("key found at index : " + index);
        System.out.println("value is : "+array_list[index]);

        sc.close();
    }
}