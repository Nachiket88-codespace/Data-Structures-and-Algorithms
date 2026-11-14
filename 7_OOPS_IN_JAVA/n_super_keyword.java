public class n_super_keyword {

    public static void main(String[] args) {
        horse h1 = new horse() ; 
        System.out.println(h1.color);
    }
}
class animal{
    String color ; 

    animal(){
        System.out.println("animal constructor called");
    }
}
class horse extends animal{
    horse(){
        super.color = "brown" ; 
        System.out.println("horse constructor called");
    }
}