import java.util.*;
public class input_output_arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        double marks[] = new double[5] ;
        for(int i=0 ; i<marks.length ; i++){
            marks[i] = sc.nextDouble() ;
        }

        System.out.println("printing arrays : - ");
        for(int i=0 ; i<marks.length ; i++){
            System.out.println(marks[i]);
        }

        sc.close();
    }
}