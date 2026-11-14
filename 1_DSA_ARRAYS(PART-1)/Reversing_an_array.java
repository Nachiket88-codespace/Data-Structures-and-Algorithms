public class Reversing_an_array {

    public static void reversing_array(int num_list[]){
        int temp ; 
        int start = 0 ; 
        int end = num_list.length - 1;

        for(int i=start ; i<=end ; i++){
            temp = num_list[start] ; 
            num_list[start] = num_list[end] ; 
            num_list[end] = temp ; 

            start = start + 1 ; 
            end = end - 1 ; 

        }
    }

    public static void main(String[] args) {
        int num_array[] = {10,20,30,40,50,60,70,80,90,100} ; 

        reversing_array(num_array);
        for(int i=0 ; i<num_array.length ; i++){
            System.out.println(num_array[i]);
        }
    }
}

