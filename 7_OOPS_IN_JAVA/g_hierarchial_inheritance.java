public class g_hierarchial_inheritance {
    public static void main(String[] args) {
        humans h1 = new humans() ; 
        birds b1 = new birds() ; 

        h1.breadth();
        h1.speaks();

        b1.breadth();
        b1.fly();
    }
}
class animals{
    void eats(){
        System.out.println("eats food");
    }
    void breadth(){
        System.out.println("breadths oxygen");
    }
}
class humans extends animals{
    void speaks(){
        System.out.println("speaks languages");
    }
} 
class birds extends animals{
    void fly(){
        System.out.println("flys in the air");
    }
}
