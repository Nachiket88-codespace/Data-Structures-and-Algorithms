import java.util.*;
public class Linear_Search {


    public static int linear_search(int array[] , int search){
        for(int i=0 ; i<array.length ; i++){
            if(array[i] == search){
                return i ; 
            }
        }
        return -1 ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int key ; 
        System.out.print("enter your search key : ");
        key = sc.nextInt() ; 

        int num_array[] = {2,3,5,4,7,8,10,9,5,6,12} ;
        int index = linear_search(num_array, key) ;
        System.out.println("key found at : "+ index); 
        System.out.println("search key is : " + num_array[index]);
        
        sc.close();

    }
}