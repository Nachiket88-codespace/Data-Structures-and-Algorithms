import java.util.* ; 
public class Swap_numbers {

    public static void Swap(int num_1 , int num_2){
        int temp = num_1 ; 
        num_1 = num_2 ; 
        num_2 = temp ; 
        System.out.println("numbers_1 = " + num_1);
        System.out.println("numbers_2 = " + num_2);

        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number = ");
        int numbers_1 = sc.nextInt() ; 
        System.out.print("enter 2nd number = ");
        int numbers_2 = sc.nextInt() ; 

        Swap(numbers_1, numbers_2);
        System.out.println("numbers_1  = " + numbers_1);
        System.out.println("numbers_2  = " + numbers_2);

        sc.close();
    }

}
