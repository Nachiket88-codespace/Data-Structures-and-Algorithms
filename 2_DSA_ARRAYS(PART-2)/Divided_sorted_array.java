public class Divided_sorted_array {

    public static int binary_divided_search(int num_set[] , int key){
        int start = 0 ;
        int end = num_set.length-1 ; 

        while(start<=end){
            int mid = start + (end-start)/2 ; 

            if(num_set[mid] == key){
                System.out.println("key found at index = "+ mid);
                return mid ;
            }
            else if(num_set[start] <= num_set[mid]){
                if(key >=num_set[start] && key < num_set[mid]){
                    end = mid -1 ;
                }
                else{
                    start = mid +1 ; 
                }
            }
            else{
                if(key > num_set[mid] && key <= num_set[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int num_set[] = {4,5,6,7,0,1,2} ; 
        int key = 0 ;

        binary_divided_search(num_set, key) ; 

    }
}
