public class Max_subarray {

    public static int max_sum(int num[]){
        int max = Integer.MIN_VALUE ; 
        // int largest = 0 ;

        for(int i=0 ; i<num.length ; i++){
            int start = i ;
            for(int j=i ; j<num.length ; j++){
                int end = j ; 

                int largest = 0 ;
                for(int k=start ; k<=end ; k++){
                    largest = largest + num[k] ; 

                    if(largest > max){
                        max = largest ; 
                    }
                }
            }
        }
        return max ; 
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10} ; 

        int max_ans = max_sum(num) ; 
        System.out.println(max_ans);
    }
}