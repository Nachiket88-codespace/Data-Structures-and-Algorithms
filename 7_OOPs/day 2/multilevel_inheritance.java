public class multilevel_inheritance {
    public static void main(String[] args) {
        dog tommy = new dog() ; 
        tommy.eat(); ; 
        tommy.legs = 4 ; 
        System.out.println(tommy.legs);
        tommy.breath();
    }
}

class animals{
    String skin_tone ; 
    String nature ; 

    void eats(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}

class mamals extends animal{
    int legs ; 
}

class dog extends mamals{
    String breed ; 
}