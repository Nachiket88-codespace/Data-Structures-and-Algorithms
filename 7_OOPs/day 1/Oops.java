public class Oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen() ; // created a pen object called p1...
        // p1.set_color("blue");
        // System.out.println(p1.color);

        // p1.set_tip(5);
        // System.out.println(p1.tip);

        System.out.println("------------------------------------------");

        Student s1 = new Student() ; //created an object s1 ....
        s1.name_of_student("hari") ; 
        System.out.println(s1.name);

        s1.age_is(19.11f) ; 
        System.out.println(s1.age);

        s1.percent(75, 77, 82) ;
        System.out.println(s1.cgpa);

    }
    
}
// defining a class with its own properties and functions:
// class Pen{
//     // properties or attributes of pen . 
//     String color ; 
//     int tip ; 

//     // functions to change or control properties/attributes of pen .
//     void set_color(String newColor){
//         color = newColor ; 
//     }

//     void set_tip(int newTip){
//         tip = newTip ; 
//     }
// }

class Student{
     // properties or attributes of student . 
    String name ; 
    float age ; 
    float cgpa ; 

    // functions to change or control properties/attributes of student .
    String name_of_student(String identity){
        name = identity ; 
        return name ; 
    }

    float age_is(float age_info){
        age = age_info ; 
        return age ; 
    }

    float percent(float phy , float chem , float math){
        cgpa = (phy+chem+math)/3 ; 
        return cgpa ; 
    }
}
