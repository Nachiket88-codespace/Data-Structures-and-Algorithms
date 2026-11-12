public class i_method_overriding {
    public static void main(String[] args) {
        dog d1 = new dog() ; 
        deer d = new deer() ; 

        d1.eats();
        d.eats();
    }
}
class dog{
    void eats(){
        System.out.println("eats anything");
    }
}
class deer extends dog{
    void eats(){
        System.out.println("eats grass only");
    }
}
