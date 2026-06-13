// import java.util.*;
public class Shrotest_path {
    public static float shortest_path(String path){
        int x_c = 0 ,  y_c = 0 ;
        for(int i=0 ; i<path.length() ; i++){
            char dire = path.charAt(i) ; 

            // south :
            if(dire == 'S'){
                y_c-- ; 
            }
            // north : 
            else if (dire == 'N') {
                y_c++ ;
            }
            // east :
            else if(dire == 'E'){
                x_c++ ;
            }
            //west :
            else if(dire == 'W'){
                x_c-- ;
            }
        }
        int x_sq = x_c*x_c ; 
        int y_sq = y_c*y_c ; 

        float shortest_range = (float)Math.sqrt(x_sq + y_sq) ; 
        return shortest_range ; 
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN" ; 

        float disp = shortest_path(path) ; 
        System.out.println(disp);
    }
}
