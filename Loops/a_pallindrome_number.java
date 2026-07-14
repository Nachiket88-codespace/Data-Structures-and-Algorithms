import java.util.Scanner;

public class a_pallindrome_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter number your choice = ");
        int num = sc.nextInt() ; 
        int rev_num = 0 ; 
        int temp = num ;

        while(temp>0){
            int remainder = temp % 10 ;
            rev_num = rev_num*10 + remainder ; 
            temp = temp / 10 ;
        }

        if(num == rev_num){
            System.out.println("it is a pallindrome");
        }
        else{
            System.out.println("it is not a pallindrome");
        }

        sc.close();
    }
}