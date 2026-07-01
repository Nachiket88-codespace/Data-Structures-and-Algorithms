import java.util.*;
public class charectar_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num of rows = ");
        int total_rows = sc.nextInt() ; 

        char ch = 'A' ; 
        for(int i=1 ; i<=total_rows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(ch+" ");
                ch++ ; 
            }
            System.out.println();
        }
        sc.close();
    }
}
