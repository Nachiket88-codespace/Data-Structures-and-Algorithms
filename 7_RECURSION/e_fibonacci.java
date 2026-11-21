import java.util.Scanner;

public class e_fibonacci {
    
    public static int fibo(int num){

        if(num == 0 || num == 1){
            return num ; 
        }

        int fnm1 = fibo(num-1) ;
        int fnm2 = fibo(num-2) ;
        int fnb = fnm1 + fnm2 ; 

        return fnb ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter any num : ");
        int num = sc.nextInt() ;


        System.out.println(fibo(num));

        sc.close();
    }
}
