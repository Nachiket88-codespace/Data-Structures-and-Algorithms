import java.util.*;
public class Linear_Search {

    public static int Linear_Search_num(int number[] , int key ){
        for(int i=0 ; i < number.length ; i++){
            if(number[i] == key){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18} ; 
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any key from an array = ");
        int key = sc.nextInt() ; 

        int index = Linear_Search_num(number, key) ; 
        System.out.println(index);

        sc.close();

    }
}