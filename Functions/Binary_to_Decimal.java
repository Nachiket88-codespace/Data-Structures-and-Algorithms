import java.util.*;
public class Binary_to_Decimal {

    public static void Bin_to_Dec(int number){
        int decimal = 0 ; 
        int power = 0 ; 
        int temp = number ; 
        while (temp>0) {
            int remain = temp%10 ; 
            decimal = decimal + remain*(int)(Math.pow(2,power)) ; 
            power++ ; 
            temp = temp / 10 ; 
        }
        System.out.println("decimal number is : " + decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("enter number : ");
        int nums = sc.nextInt() ; 

        Bin_to_Dec(nums);
        sc.close();
    }
}