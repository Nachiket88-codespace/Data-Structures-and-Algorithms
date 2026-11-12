public class h_method_overloading {
    public static void main(String[] args) {
        calculation_sum c1 = new calculation_sum() ; 
        System.out.println(c1.sum(2.5f, 3.8f));
        System.out.println(c1.sum(2, 3));
        System.out.println(c1.sum(2, 3 , 5));
    }
}
class calculation_sum{
    int sum(int a , int b){
        return a + b ;
    }
    int sum(int a , int b , int c){
        return a + b + c ; 
    }
    float sum(float a , float b){
        return a + b ;
    }
}