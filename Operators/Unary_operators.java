public class Unary_operators {
    public static void main(String[] args) {
        
        int num_a = 10 ; 
        int num_b = ++num_a ; 
        System.out.println(num_a);
        System.out.println(num_b);

        System.out.println("----------------------------------");

        int num_c = 10 ; 
        int num_d = num_c++ ; 
        System.out.println(num_c);
        System.out.println(num_d);

        System.out.println("----------------------------------");

        int num_e = 10 ; 
        int num_f = num_e-- ; 
        System.out.println(num_e);
        System.out.println(num_f);

        System.out.println("----------------------------------");

        int num_g = 10 ; 
        int num_h = --num_g ; 
        System.out.println(num_g);
        System.out.println(num_h);
    }
}
