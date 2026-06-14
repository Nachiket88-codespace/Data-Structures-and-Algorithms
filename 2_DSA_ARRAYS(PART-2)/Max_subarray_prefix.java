public class Max_subarray_prefix {

    public static int max_sum(int list_of_num[]){
        int prefix_num[] = new int[list_of_num.length] ; 
        prefix_num[0] = list_of_num[0]  ;
        for(int i=1 ; i<list_of_num.length ; i++){
            prefix_num[i] = list_of_num[i] + prefix_num[i-1] ; 
        }

        for(int k=0 ; k<prefix_num.length ; k++){
            System.out.print(prefix_num[k] + " ");
        }
        System.out.println();
        System.out.println();

        // finding max_sum . 
        int max = Integer.MIN_VALUE ;
        for(int n=0 ; n<prefix_num.length ; n++){
            int start = n ;
            for(int m=n ; m<prefix_num.length ; m++){
                int end = m ;

                int largest = (start == 0)? prefix_num[end] : prefix_num[end]-prefix_num[start-1];

                if(largest > max){
                    max = largest ; 
                }
            }
        }
        return max ; 

    }
    public static void main(String[] args) {
        int list_of_num[] = {2,4,6,8,10} ; 

        for(int j=0 ; j<list_of_num.length ; j++){
            System.out.print(list_of_num[j] + " ");
        }
        System.out.println("==================================================");

        System.out.println(max_sum(list_of_num)) ;

    }
}