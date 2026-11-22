public class f_sorted_array {

    public static boolean sort_array(int array[] , int index){
        if(index == array.length-1){
            return true ;
        }
        if(array[index]>array[index+1]){
            return false ; 
        }
        return sort_array(array, index+1) ; 
    }
    public static void main(String[] args){

        int array[] = {2,3,4,5,6,7,8,9} ; 

        boolean status = sort_array(array, 0) ;

        if(status == true){
            System.out.println("sorted");
        }
        else{
            System.out.println("un-sorted");
        }
    }
}