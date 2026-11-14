import java.util.*;
public class Linear_Search {

    public static int Linear_search(int array[] , int key_num){
        for(int i=0 ; i<array.length ; i++){
            if(array[i] == key_num){
                return i ; 
            }
        }
        return -1 ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter any key value : ");
        int key_val = sc.nextInt() ; 

        int num_list[] = {2,4,6,8,10,12,14,16,18,20,22} ;

        int index = Linear_search(num_list, key_val) ; 
        if(index != -1){
            System.out.println("key value found at index "+index+" and value is : "+num_list[index]);
        }
        else if(index == -1){
            System.out.println("no key found in array matching key_val ");
        }
        
        sc.close();
    }
}