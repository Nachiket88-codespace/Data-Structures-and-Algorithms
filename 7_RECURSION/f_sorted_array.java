public class f_sorted_array {
    
    public static boolean is_sorted(int array[] , int index){

        if(index == array.length-1){
            return true ; 
        }

        if(array[index] > array[index+1]){
            return false ; 
        }

        return is_sorted(array , index + 1) ; 
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8} ; 
        boolean status = is_sorted(num, 0) ; 

        if(status == true){
            System.out.println("sorted");
        }
        else{
            System.out.println("un-sorted");
        }
    }
}
