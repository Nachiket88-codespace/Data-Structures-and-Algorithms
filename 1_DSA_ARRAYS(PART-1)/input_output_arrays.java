import java.util.*;
public class input_output_arrays {
    
    public static void main(String[] args) {
        int marks[] = new int[100] ; 

        int length = marks.length ; 
        System.out.println("length of an array is : " + length);
        System.out.println();

        Scanner sc = new Scanner(System.in) ; 

        System.out.print("enter physics marks : ");
        marks[0] = sc.nextInt() ; 
        System.out.print("enter chemistry marks : ");
        marks[1] = sc.nextInt() ; 
        System.out.print("enter maths marks : ");
        marks[2] = sc.nextInt() ; 
        System.out.print("enter english marks : ");
        marks[3] = sc.nextInt() ; 
        System.out.print("enter cse marks : ");
        marks[4] = sc.nextInt() ; 
        marks[2] = 95 ; 

        System.out.println("==========================================================");

        System.out.println("physics marks are : " + marks[0]);
        System.out.println("chemistry marks are : " + marks[1]);
        System.out.println("mathematics marks are : " + marks[2]);
        System.out.println("english marks are : " + marks[3]);
        System.out.println("cse marks are : " + marks[4]);

        //UPDATING AN ARRAY :)
        System.out.println("-------------------------");

        marks[2] = marks[2] + 5 ; 
        System.out.println("mathematics marks are: " + marks[2]);

        // float percent = ((marks[0] + marks[1] + marks[2] + marks[3] + marks[4])/6)*1 ; 
        // System.out.println("total % scored : " + percent);

        sc.close();
    }
}
