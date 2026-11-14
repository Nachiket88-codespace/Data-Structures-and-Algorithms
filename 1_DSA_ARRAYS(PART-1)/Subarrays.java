public class Subarrays {

    public static void create_subarray(int array[]){
        int start = 0 ; 
        int end = array.length-1 ; 

        for(int i=start ; i<=end ; i++){
            start = 0 ; 
            while(start <= end){
                for(int j=i ; j<start+1 ; j++){
                    System.out.print(array[j]+",");
                }
                System.out.println();
                start = start + 1 ;
            }
            System.out.println("-----------------------");
        }
    }
    public static void main(String[] args) {
        int num_list[] = {2,4,6,8,10,12,16,18,20,22,24} ; 

        create_subarray(num_list);

    }
}
