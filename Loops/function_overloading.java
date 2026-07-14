public class function_overloading {
    public static int sum(int a , int b){
        return a + b ; 
    }
    public static int sum (int a , int b , int c){
        return a+b+c ; 
    }

    public static float multiply (int c , int d){
        return c*d ; 
    }
    public static int multiply (int c , int d , int e){
        return c*d*e ; 
    }
    public static void main(String[] args) {
        System.out.println(sum(9,11));
        System.out.println(sum(9,11 , 4));

        System.out.println("--------------------------------");

        System.out.println(multiply(4, 7));
        System.out.println(multiply(8, 1, 10));
    }
}
