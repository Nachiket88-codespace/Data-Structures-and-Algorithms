import java.util.* ; 
public class Charecter_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter how many lines to be printed : ");
        int number = sc.nextInt() ; 

        char num = 'A' ; 
        for(int line = 1 ; line <= number ; line++){
            for(int print = 1 ; print <= line ; print ++){
                System.out.print(num);
                num ++ ;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
