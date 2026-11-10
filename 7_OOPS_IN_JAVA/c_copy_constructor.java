public class c_copy_constructor {
    public static void main(String[] args) {
        student s1 = new student() ; 
        s1.name = "harish" ; 
        s1.age = 21 ; 
        s1.password = "10852" ; 
        s1.marks[0] = 100 ; 
        s1.marks[1] = 97 ; 
        s1.marks[2] = 95 ; 

        student s2 = new student(s1) ; 
        s1.marks[0] = 88 ; 
        s2.password = "14579" ; 

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);
        System.out.println("-------------------------------------------------");
        System.out.println(s2.name);
        System.out.println(s2.age);
        for(int i=0 ; i<=2 ; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class student{
    int age ; 
    String name ; 
    String password ; 
    int marks[] ; 

    student(student obj){
        marks = new int[3] ; 
        this.name = obj.name ; 
        this.age = obj.age ; 
        this.marks = obj.marks ; 
    }
    student(){
        marks = new int[3] ; 
        System.out.println("default constructor called ...");
    }
    student(String name , int age , String password){
        marks = new int[3] ; 
        this.name = name ; 
        this.age = age ; 
        this.password = password ; 
    }
}
