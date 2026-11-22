import java.util.*;

public class e_fibonacci {

    public static int fibo(int num){

        if(num==0 || num==1){
            return num ; 
        }

        int fnm1 = fibo(num-1) ;
        int fnm2 = fibo(num-2) ; 
        int fn = fnm1 + fnm2 ;

        System.out.println(fn);

        return fn ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter num : ");
        int num = sc.nextInt() ;

        System.out.println(fibo(num));

        sc.close();

    }
}