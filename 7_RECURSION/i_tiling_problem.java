import java.util.*; 

public class i_tiling_problem {

    public static int ways(int num){//length = n & breadth = 2 ;

        if(num==0 || num==1){
            return 1 ;
        }
        //vertical placing :
        int fnm1 = ways(num-1) ;
        //horizontal placing :
        int fnm2 = ways(num-2) ;
        //total :
        int total = fnm1 + fnm2 ;

        return total ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter length of tile : ");
        int length = sc.nextInt() ;

        System.out.println(ways(length));

        sc.close();
    }
}