// import java.util.Scanner;

public class a_classes_and_objects {
    public static void main(String[] args) {
        Pen p1 = new Pen() ; //created an object of Pen class in heap memory.
        p1.setcolor("Blue");
        p1.changesize(5);
        System.out.println(p1.color);
        System.out.println(p1.size);

        Bank b1 = new Bank() ; 
        System.out.println(b1.username);
        // System.out.println(b1.password);

        b1.changepwd("nachiket10852");
        // password cannot be accessed but can be change using changepwd function.


        System.out.println("---------------------------------------------");
        Student s1 = new Student() ; 
        s1.name = "harish" ; 
        s1.setroll_no(10852);
        s1.set_marks(94.57f);


        System.out.println(s1.getname());
        s1.getmarks() ; 
        System.out.println(s1.get_roll_no());

    }
}

class Bank{
    public String username ; 
    private String password ; 

    public void changepwd(String new_pwd){
        this.password = new_pwd ; 
    }
}

class Pen{
    int size ; 
    String color ; 

    void setcolor(String new_color){
        this.color = new_color ; 
    }
    void changesize(int newsize){
        this.size = newsize ; 
    }
}

class Student{
    public String name ; 
    private int roll_no ; 
    protected float marks ; 

    public void setname(String newname){
        this.name = newname ; 
    }

    public void setroll_no(int newrollno){
        this.roll_no = newrollno ; 
    }

    public void set_marks(float new_marks){
        marks = new_marks ; 
    }

    String getname(){
        return this.name ; 
    }

    float getmarks(){
        System.out.println(this.marks);
        return this.marks ; 
    }

    int get_roll_no(){
        return this.roll_no ; 
    }
}