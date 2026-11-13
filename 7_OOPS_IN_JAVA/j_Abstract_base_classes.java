public class j_Abstract_base_classes {
    public static void main(String[] args) {
        horse h = new horse() ; 
        chiken c = new chiken() ; 

        h.eats();
        h.walks();
        c.eats();
        c.walks();
    }
}
abstract class animal{
    void eats(){
        System.out.println("eats food for survival");
    }
    abstract void walks();
}

class horse extends animal{
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
class chiken extends animal{
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
