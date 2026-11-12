public class e_inheritance {
    public static void main(String[] args) {
        fish whale = new fish() ; 
        whale.fins_no = 2 ; 
        System.out.println(whale.fins_no);
        whale.eats();
        whale.breadth();
        whale.swims();
    }
}
class animals{
    void eats(){
        System.out.println("eats food");
    }
    void breadth(){
        System.out.println("breadths oxygen");
    }
    void color(){
        System.out.println("have skin color");
    }
}
class fish extends animals{
    int fins_no ; 

    void swims(){
        System.out.println("swims in water");
    }
}
