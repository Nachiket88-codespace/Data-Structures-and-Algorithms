public class Copy_constructor {
    public static void main(String[] args) {
        student_portfolio s1 = new student_portfolio() ; 
        s1.name = "harish" ; 
        s1.user_id = "n08072006" ; 
        s1.password = "75994861320" ; 
        s1.roll_no = 10852 ; 
        s1.marks[0] = 97 ; 
        s1.marks[1] = 92 ; 
        s1.marks[2] = 95 ; 

        student_portfolio s2 = new student_portfolio(s1) ; 
        System.out.println(s2.name);
        System.out.println(s2.user_id);
        System.out.println(s2.password);
        System.out.println(s2.roll_no);
        
        System.out.println("===========================================================");

        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println("===========================================================");
        s1.marks[0] = 88 ; 
        s1.marks[1] = 85 ; 
        s1.marks[2] = 80 ; 
        
        for(int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class student_portfolio{
    String name  ; 
    int roll_no  ;
    String password ; 
    String user_id ; 
    int marks[] ; 

    student_portfolio(){
        marks = new int[3] ; 
    }

    // //shallow copy constructor : 
    // student_portfolio(student_portfolio s1){
    //     marks = new int[3] ; 
    //     this.name = s1.name ; 
    //     this.roll_no = s1.roll_no ; 
    //     this.password = s1.password ; 
    //     this.user_id = s1.user_id ;
        
    //     this.marks = s1.marks ; 
    // }

    //deep copy constructor : 
    student_portfolio(student_portfolio s1){
           marks = new int[3] ; 
        this.name = s1.name ; 
        this.roll_no = s1.roll_no ; 
        this.password = s1.password ; 
        this.user_id = s1.user_id ;

        for(int j=0 ; j<marks.length ; j++){
            this.marks[j] = s1.marks[j] ; 
        }

    }
}