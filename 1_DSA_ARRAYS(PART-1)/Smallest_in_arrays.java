public class Smallest_in_arrays {

    public static int smallest_num(int numberss[]){
        int smallest = Integer.MAX_VALUE ; 
        for(int i=0 ; i < numberss.length ; i++){
            if(numberss[i] < smallest){
                smallest = numberss[i] ; 
            }
        }
        return smallest ; 
    }
    public static void main(String[] args) {
        int numberss[] = {2,4,6,8,10,12,14,16,-8} ; 

        int smallestnum = smallest_num(numberss) ; 
        System.out.println(smallestnum);
    }
}
