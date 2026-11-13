public class j_Abstract_base_classes {
    public static void main(String[] args) {
        horse h = new horse() ; 
        chiken c = new chiken() ; 

        h.eats();
        h.walks();
        c.eats();
        c.walks();
        System.out.println("------------------------");
        System.out.println(h.color);
        System.out.println(c.color);
        h.changecolor();
        c.changecolor();
        System.out.println(h.color);
        System.out.println(c.color);

    }
}
abstract class animal{
    String color ; 

    animal(){
        System.out.println("animal constructor invoked");
        color = "black" ; 
    }
    void eats(){
        System.out.println("eats food for survival");
    }
    abstract void walks();
}

class horse extends animal{
    horse(){
        System.out.println("horse constructor invoked");
    }
    void changecolor(){
        this.color = "brown" ; 
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}
class chiken extends animal{
    chiken(){
        System.out.println("chicken constructor invoked");
    }
    void changecolor(){
        this.color = "white" ; 
    }
    void walks(){
        System.out.println("walks on 2 legs");
    }
}
