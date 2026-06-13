import java.util.* ; 
public class Binary_to_Decimal {
    public static void Bin_to_Dec(int Binary_number){
        int power = 0 ; 
        int decimal_ans = 0 ;

        while (Binary_number > 0 ) {
            int last_digit = Binary_number % 10 ;
            decimal_ans = decimal_ans + (int)(last_digit* Math.pow(2, power)) ;
            power++ ;
            Binary_number = Binary_number / 10 ;
        }
        System.out.println("=====================================");
        System.out.println(decimal_ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter binary number : ");
        int bin_num = sc.nextInt() ;

        Bin_to_Dec(bin_num);
        sc.close();
    }
}
