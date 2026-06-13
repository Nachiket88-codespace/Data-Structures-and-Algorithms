// import java.util.*;
public class Trapping_rain_water {

    public static int water_trap(int height[]){

        if (height == null || height.length <= 2) {
            return 0;
        }

        
        int left_max_boundary[] = new int[height.length] ; 
        left_max_boundary[0] = height[0]  ;
        for(int i=1 ; i < height.length ; i++){
            left_max_boundary[i] = Math.max(height[i], left_max_boundary[i-1]) ; 
        }
        
        int right_max_boundary[] = new int[height.length] ; 
        right_max_boundary[height.length-1] = height[height.length-1] ; 
        for(int j=(height.length-2) ; j >=0 ; j--){
            right_max_boundary[j] = Math.max(height[j], right_max_boundary[j+1]);
        }

        int trapped_water = 0 ;
        for(int k=0 ; k < height.length ; k++){
            int water_level = Math.min(left_max_boundary[k], right_max_boundary[k]) ; 
            trapped_water = trapped_water + (water_level - height[k]) ; 
        }
        return trapped_water ; 
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1}  ;

        int answer = water_trap(height) ; 
        System.out.println(answer);   

        
        

    }
}
