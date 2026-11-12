public class c_shallow_copy_constructor {
    public static void main(String[] args) {
        studentss s1 = new studentss(21, "harish") ; 
        s1.password = 12345 ; 
        s1.marks[0] = 100 ; 
        s1.marks[1] = 95 ; 
        s1.marks[2] = 97 ; 

        studentss s2 = new studentss(s1) ; 
        s2.password = 10852 ; 
        s1.marks[2] = 88 ;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.password);
        System.out.println("=====================================");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.password);
        for(int i=0 ; i<=2 ; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class studentss{
    int age ; 
    String name ; 
    int password ; 
    int  marks[] ; 

    studentss(studentss obj){
        marks = new int[3] ; 
        this.name = obj.name ; 
        this.age = obj.age ;
        this.marks = obj.marks ; 
    }

    studentss(){
        marks = new int[3] ;
        System.out.println("default constructor invoked .");
    }

    studentss(int age , String name){
        marks = new int[3] ;
        System.out.println("parameterized constructor invoked .");
        this.name = name ; 
        this.age = age ; 
    }
}
