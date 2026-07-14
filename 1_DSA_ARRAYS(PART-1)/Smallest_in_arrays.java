public class Smallest_in_arrays {

    public static int Smallest(int num[]){
        int smallest = Integer.MAX_VALUE ; 
        for(int i=0 ; i<num.length ; i++){
            if(num[i] < smallest){
                smallest = num[i] ; 
            }
        }

        // System.out.print(smallest);
        return smallest ;
    }

    public static void main(String[] args) {
        int num[] = {2,5,6,8,9,1,7,4,3} ; 

        System.out.println(Smallest(num));
        
    }
}
