import java.util.*;
public class creating_string{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in) ; 

        char array_ch[] = {'a','b','c','d','e'} ; 
        String str_1 = "abcde" ; 
        String str_2 = new String("WXYZ") ; 

        for(int i=0 ; i<array_ch.length ; i++){
            System.out.print(array_ch[i] + " ");
        }
        System.out.println();
        System.out.println(str_1);
        System.out.println(str_2);

        System.out.print("enter any name : ");
        String name = sc.nextLine() ; 
        System.out.println(name);

        sc.close();

    }
}