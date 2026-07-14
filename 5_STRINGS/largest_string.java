public class largest_string {
    public static String return_largest_string(String name_fruits[]){
        String largest = name_fruits[0] ; 
        for(int i=1 ; i<name_fruits.length ; i++){
            if(largest.compareToIgnoreCase(name_fruits[i]) < 0){
                largest = name_fruits[i] ; 
            }
        }
        return largest ; 
    }
    public static void main(String[] args) {
        String fruits[] = {"apple" , "mango" , "orange" , "banana" , "grapes" , "pineapple" , "gauva"} ;
         
        String largest_string_name = return_largest_string(fruits) ; 
        System.out.println(largest_string_name);

    }
}
