import java.util.*;
public class Linear_Search {

    public static int search(int num[] , int key){
        for(int i=0 ; i<num.length ; i++){
            if(num[i] == key){
                System.out.print("key found at index "+ i);
                return i ;
           }
        }
        System.out.print("no key found");
        return -1 ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter search key : ");
        int key = sc.nextInt() ; 
        int num[] = {2,4,6,8,10,12} ; 
        
        search(num, key) ; 
        sc.close();
    }
}