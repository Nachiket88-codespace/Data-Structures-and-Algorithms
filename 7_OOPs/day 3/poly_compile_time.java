public class poly_compile_time {
    public static void main(String[] args) {
        calculator calc_1 = new calculator() ; 
        System.out.println(calc_1.sum(1.2f, 3.4f));
        System.out.println(calc_1.sum(1, 5));        
        System.out.println(calc_1.sum(1, 5 , 4));        

    }
}
class calculator{
    int sum(int a , int b){
        return a+b ; 
    }
    float sum(float a , float b){
        return a+b  ; 
    }
    int sum(int a , int b , int c){
        return a+b+c ; 
    }
}
