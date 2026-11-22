import java.util.* ; 

public class c_factorial_via_recursion {

    public static int fact(int num){

        if(num == 0){
            return 1 ;
        }
        int fnm1 = fact(num-1);
        int fn = num * fnm1 ; 

        return fn ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter num : ");
        int num = sc.nextInt() ; 

        System.out.println(fact(num));

        sc.close();

    }
}