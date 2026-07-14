public class Subarrays {

    public static void print_subarrays(int list_of_int_numbers[]){
        for(int i=0 ; i<list_of_int_numbers.length ; i++){
            int start = i ; 
            for(int j=i ; j<list_of_int_numbers.length ; j++){
                int end = j ;
                for(int k=start ; k<=end ; k++){
                    System.out.print(list_of_int_numbers[k] + " ");
                }
                System.out.println();
            }

            System.out.println("----------------------------------------------------");
        }
    }
    public static void main(String[] args) {
        
        int list_of_int_numbers[] = {2,4,6,8,10,12,14,16,18,20,22,24,25} ; 

        print_subarrays(list_of_int_numbers);
    }
}
