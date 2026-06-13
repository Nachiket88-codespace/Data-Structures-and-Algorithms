public class hybrid_inheritance {
    public static void main(String[] args) {
        
    }
}
class animals{
    void eats(){
        System.out.println("eats");
    }
    void breaths(){
        System.out.println("breaths");
    }
    void rest(){
        System.out.println("sleeps");
    }
}
class mamal extends animals{
    void walks(){
        System.out.println("walks");
    }
}
class fish extends animals{
    void swims(){
        System.out.println("swims");
    }
}
class birds extends animals{
    void fly(){
        System.out.println("fly");
    }
}
class human extends mamal{
    void speak(){
        System.out.println("speaks");
    }
}
class dog extends mamal{
    void barks(){
        System.out.println("barks");
    }
}
class shark extends fish{
    void nature(){
        System.out.println("carnivore");
    }
}
class whale extends fish{
    void size(){
        System.out.println("as big as ships");
    }
}
class eagle extends birds{
    void fast(){
        System.out.println("very fast");
    }
}
class peacock extends birds{
    void beauty(){
        System.out.println("beautiful");
    }
}
