public class M_static_keyword {
    public static void main(String[] args) {
        college_student c1 = new college_student();
        c1.Schoolname = "VIT Bhopal" ; 

        college_student c2 = new college_student() ;
        System.out.println(c2.Schoolname);

        college_student c3 = new college_student();
        c3.Schoolname = "John Hopkings" ; 

        System.out.println(c2.Schoolname);
    }
}
class college_student{

    static int calculatepercent(int math,int physics,int chemistry){
        return (math+physics+chemistry)/3 ;
    }

    String name ; 
    int roll_no ; 

    static String Schoolname ;

    void setdata(String name , int roll_no){
        this.name = name ; 
        this.roll_no = roll_no ; 
    }

    void getdata(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
}
