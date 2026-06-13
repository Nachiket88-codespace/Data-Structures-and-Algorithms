import java.util.* ; 
public class PALLINDROME_NUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("enter a number :");
        int num = sc.nextInt() ; 
        int temp_num = num ; 
        int rev_num = 0 ; 

        while(temp_num > 0){
            int last_digit = temp_num % 10 ;
            temp_num = temp_num / 10 ;
            rev_num = rev_num*10 + last_digit ; 
        }

        if(rev_num == num){
            System.out.println(num +" is a pallindrome number.");
        }
        sc.close();
    }
}
