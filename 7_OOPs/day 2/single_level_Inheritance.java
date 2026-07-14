public class single_level_Inheritance {
    public static void main(String[] args) {
        fish shark = new fish() ; 
        shark.eat(); ; 
        shark.breath(); 
    }
}
// base class : 
class animal{
    String color ; 
    String nature ; 

    void breath(){
        System.out.println("breathes");
    }
    void eat(){
        System.out.println("eats");
    }
}
// derived class : 
class fish extends animal{
    int fins ; 

    void swim(){
        System.out.println("swims in water");
    }
}
