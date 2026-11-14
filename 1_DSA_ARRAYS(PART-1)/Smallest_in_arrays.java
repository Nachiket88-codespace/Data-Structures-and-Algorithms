public class Smallest_in_arrays {

    public static int Smallest_number(int arrays[]){
        int smallest = Integer.MAX_VALUE ; 
        for(int i=0 ; i<arrays.length ; i++){
            if(arrays[i] < smallest){
                smallest = arrays[i] ; 
            }
        }
        return smallest ; 
    }
    public static void main(String[] args) {
        int values[] = {2,3,5,7,11,13,17,19,21,-8} ;

        int answer = Smallest_number(values) ; 
        System.out.println("smallest number in arrays is : "+answer);
    }
}