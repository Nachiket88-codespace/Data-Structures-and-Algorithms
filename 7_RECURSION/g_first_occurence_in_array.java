public class g_first_occurence_in_array {
    
    public static int first_occurence(int array[] , int key , int index){

        if(array[index] == array.length){
            return -1 ;
        }
        if(array[index] == key){
            return index ; 
        }
        return first_occurence(array, key, index +1) ;
    }
    public static void main(String[] args) {
        int array[] = {2,3,5,7,8,4,6,9,5,2,3,1} ; 
        int key = 5 ; 

        int ans = first_occurence(array, key, 0);
        System.out.println(ans);
    }
}
