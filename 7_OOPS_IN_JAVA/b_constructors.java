public class b_constructors {

    public static void main(String[] args) {
        Student s1 = new Student("harish", 20) ; 
        Student s2 = new Student();
        Student s3 = new Student("Darharya") ; 

        s2.name = "Narada" ; 

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s3.name);
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
    Student(){
        System.out.println("default constructor called ...");
    }
    Student(String name){
        this.name = name ; 
        System.out.println("name of the student is : " + this.name);
    }
}