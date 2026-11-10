public class c_copy_constructor {
    public static void main(String[] args) {
        student s1 = new student() ; 
        s1.name = "harish" ; 
        s1.age = 21 ; 
        s1.password = "10852" ; 

        student s2 = new student(s1) ; 
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);
        System.out.println("-------------------------------------------------");
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
class student{
    int age ; 
    String name ; 
    String password ; 

    student(student obj){
        this.name = obj.name ; 
        this.age = obj.age ; 
    }
    student(){
        System.out.println("default constructor called ...");
    }
    student(String name , int age , String password){
        this.name = name ; 
        this.age = age ; 
        this.password = password ; 
    }
}
