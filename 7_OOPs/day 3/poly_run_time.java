public class poly_run_time {
    public static void main(String[] args) {
        deer d1 = new deer() ; 
        d1.eats(); ; 
        d1.walks(); ; 
    }
}
class animal{
    void walks(){
        System.out.println("walks");
    }
    void eats(){
        System.out.println("eats anything");
    }
}
class deer extends animal{
    void eats(){
        System.out.println("eats grass only");
    }
}
