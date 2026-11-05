import java.util.*;
public class call_by_reference_arrays {

    public static void array_change(int change[] , int nonchange){

        nonchange = 11 ; 

        for(int i=0 ; i<change.length ; i++){
            change[i] = change[i] + nonchange ; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int num[] = {50 , 60 , 70 , 80} ; 
        int static_num  = 7 ; 
        array_change(num, static_num);

        for(int i=0 ; i<num.length ; i++){
            System.out.println(num[i]);
            System.out.println("-------------------");
        }

        sc.close();
    }
}
