public class Reversing_an_array {

    public static void reversing(int list_of_integers[]){
        int start = 0 ; 
        int end = list_of_integers.length-1 ; 

        while(start <= end){
            int temp_num = list_of_integers[end] ; 
            list_of_integers[end] = list_of_integers[start] ; 
            list_of_integers[start] = temp_num ; 

            start++ ; 
            end-- ; 
        }
        for(int k=0 ; k < list_of_integers.length ; k++){
            System.out.print(list_of_integers[k]+ " , ");
        }
    }

    public static void main(String[] args) {
        int list_of_integers[] = {2,4,6,8,10,12,14,16,18,20};

        reversing(list_of_integers);

        
    }
}




