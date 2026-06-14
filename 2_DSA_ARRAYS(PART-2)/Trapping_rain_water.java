// import java.util.*;
public class Trapping_rain_water {

    public static void trap_water_level(int bar_level[]){

        int right_max[] = new int[bar_level.length] ; 
        right_max[0] = bar_level[0] ;

        for(int i=1 ; i<bar_level.length ; i++){
            right_max[i] = Math.max(bar_level[i], right_max[i-1]) ; 
        }

        for(int j=0 ; j<right_max.length ; j++){
            System.out.print(right_max[j] + " ");
        }

        System.out.println();
        System.out.println("======================================================");
        System.out.println();

        int left_max[] = new int[bar_level.length] ; 
        left_max[bar_level.length-1] = bar_level[bar_level.length-1] ; 

        for(int k=bar_level.length-2 ; k>=0 ; k--){
            left_max[k] = Math.max(bar_level[k], left_max[k+1]) ; 
        }

        for(int m=0 ; m<left_max.length ; m++){
            System.out.print(left_max[m] + " ");
        }
        System.out.println();
        System.out.println("======================================================");
        System.out.println();

        int water_level[] = new int[bar_level.length] ; 
        for(int h=0 ; h<water_level.length ; h++){
            water_level[h] = Math.min(left_max[h], right_max[h]) ; 
        }

        int sum = 0 ;
        for(int a=0 ; a<bar_level.length ; a++){
            sum = sum + (water_level[a] - bar_level[a]) ; 
        }
        
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int bar_level[] = {4,2,0,6,3,2,5}  ;

        trap_water_level(bar_level);
    }
}
