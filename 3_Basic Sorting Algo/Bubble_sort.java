public class Bubble_sort {

    public static void sort_bubble(int num_array[]){

        for(int i=0 ; i <= num_array.length-2 ; i++){
            for(int j=0 ; j <= num_array.length-2-i ; j++){
                if(num_array[j] > num_array[j+1]){
                    int temp = num_array[j+1] ; 
                    num_array[j+1] = num_array[j] ; 
                    num_array[j] = temp ;
                }
            }
        }

        for(int k=0 ; k < num_array.length ; k++){
            System.out.print(num_array[k] + " ");
        }
    }
    public static void main(String[] args) {
        int num_array[] = {5,4,1,3,2} ;

        sort_bubble(num_array);



    }
}