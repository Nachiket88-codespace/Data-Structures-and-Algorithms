public class concept_new {
    public static void main(String[] args) {
        
        fish_n f1 = new fish_n() ; 
        f1.swim_n();
    }
}
class fish_n{
    {
        System.out.println("a new fish was born");
    }
    void swim_n(){
        System.out.println("swims");
    }

    fish_n(){
        System.out.println("fish constructor");
    }
}
