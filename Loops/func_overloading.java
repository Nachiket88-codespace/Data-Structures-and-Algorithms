public class func_overloading {
    
    public static int sum (int a , int b){
        return a + b ; 
    }
    public static float sum (float a , float b ){
        return a+ b ; 
    }
    public static void main(String[] args) {
        System.out.println(sum(3.7f , 8.9f));
        System.out.println(sum(7 , 4 ));
}
}
