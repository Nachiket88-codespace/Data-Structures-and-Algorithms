import java.util.*;
public class call_by_reference_arrays {

    public static void array_reference(int marks_array[] , int number){
        number = number + 3 ; 
        for(int i=0 ; i<marks_array.length ; i++){
            marks_array[i] = marks_array[i] + number ; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter any number : ");
        int unknown = sc.nextInt() ;

        int num_llist[] = {40,50,60,70,80,90} ; 
        System.out.println("arrays before changes : ");
        for(int i=0 ; i<num_llist.length ; i++){
            System.out.println(num_llist[i]);
        }
        System.out.println("----------------------------");

        array_reference(num_llist, unknown);
        for(int i=0 ; i<num_llist.length ; i++){
            System.out.println(num_llist[i]);
        }

        sc.close();
    }
}