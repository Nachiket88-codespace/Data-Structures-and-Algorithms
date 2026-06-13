public class Selection_sort {

    public static void sort_selection(int number_array[]){
        for(int i=0 ; i <= number_array.length-2 ; i++){
            int min_num_index = i ;
            for(int j=i+1 ; j <= number_array.length-1 ; j++){
                if(number_array[min_num_index] > number_array[j]){
                    min_num_index = j ;
                }
            }
            int temp = number_array[i] ; 
            number_array[i] = number_array[min_num_index] ; 
            number_array[min_num_index] = temp ;
        }

        for(int i=0 ; i < number_array.length ; i++){
            System.out.print(number_array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int number_array[] = {5,4,1,3,2} ; 

        sort_selection(number_array);
    }
}
