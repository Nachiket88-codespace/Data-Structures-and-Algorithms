public class Reversing_an_array {

    public static void reverse_array(int array[]){
        int temp ; 
        int start = 0 ; 
        int end = array.length-1 ; 

        while (start<=end) {
            temp = array[start] ; 
            array[start] = array[end] ; 
            array[end] = temp ; 

            start++ ; 
            end-- ; 
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14} ; 

        reverse_array(number);
        for(int i=0 ; i<number.length ; i++){
            System.out.println(number[i]);
        }
    }
}




