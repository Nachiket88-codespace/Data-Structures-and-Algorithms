public class l_multiple_inheritance_via_interfaces {
    public static void main(String[] args) {
        bear b1 = new bear() ;
        b1.eats(); ; 
        b1.walks();
        b1.breadths();
    }
}
interface herbivore{
    void eats() ; 
}
interface carnivore{
    void walks() ; 
    void breadths() ;
}
class bear implements herbivore,carnivore{
    public void eats(){
        System.out.println("eats both plants and animals flesh");
    }
    public void walks(){
        System.out.println("walks on 2 as well as on 4 legs");
    }
    public void breadths(){
        System.out.println("breadths oxygen via nose and mouth similar to humans");
    }
}

