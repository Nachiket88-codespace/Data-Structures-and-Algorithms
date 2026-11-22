public class g_first_occurence_in_array {

    public static int first_occurence(int array[],int index,int key){

        if(index == array.length){
            return -1 ; 
        }

        if(array[index] == key){
            return index ; 
        }
        return first_occurence(array, index + 1, key) ; 
    }
    public static void main(String[] args) {
        int array[] = {2,1,5,3,4,5,8,9} ; 

        System.out.println(first_occurence(array, 0, 5));

    }
}