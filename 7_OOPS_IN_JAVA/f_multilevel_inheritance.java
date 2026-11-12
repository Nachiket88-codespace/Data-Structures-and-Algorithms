public class f_multilevel_inheritance {
    public static void main(String[] args) {
        mamals m1 = new mamals() ; 
        dogs d1 = new dogs() ; 

        m1.eats();
        d1.eats();
        d1.walks();
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
class mamals extends animals{
    void walks(){
        System.out.println("walks on legs");
    }
}
class dogs extends mamals{
    void barks(){
        System.out.println("barks at unknown");
    }
}
