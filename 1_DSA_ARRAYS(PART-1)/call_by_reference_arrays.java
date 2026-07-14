// import java.util.* ; 
public class call_by_reference_arrays {

    public static void update_array(int marks_scored[] , int nonchangable){

        nonchangable = 11 ; 

        for(int i=0 ; i < marks_scored.length ; i++){
            marks_scored[i] = marks_scored[i] + 11 ; 
        }
    }
    public static void main(String[] args) {
        int marks_scored[] = {75 , 77 , 82} ;
        int unchanged = 7 ;
        update_array(marks_scored , unchanged);

        for(int i=0 ; i < marks_scored.length ; i++){
            System.out.println(marks_scored[i]);
            System.out.println(unchanged);
            System.out.println("=======");
        }
    }

}
