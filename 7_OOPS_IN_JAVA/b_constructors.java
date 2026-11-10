public class b_constructors {

    public static void main(String[] args) {
        Student s1 = new Student("harish", 20) ; 
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

class Student{
    String name ; 
    int age ; 

    Student(String name , int age){
        this.name = name ; 
        this.age = age ; 
        System.out.println("student constructor is called ... ");
    }
}