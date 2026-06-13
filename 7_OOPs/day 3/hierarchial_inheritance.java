public class hierarchial_inheritance {
    public static void main(String[] args) {
        
    }
}
class Animals{
    void eats(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breaths");
    }
}
class mamal extends Animals{
    void walks(){
        System.out.println("walks");
    }
}
class fish extends Animals{
    void swim(){
        System.out.println("swims");
    }
}
class bird extends Animals{
    void fly(){
        System.out.println("fly");
    }
}
