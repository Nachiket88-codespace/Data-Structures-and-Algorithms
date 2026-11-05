public class Pairing_arrays {

    public static void pairing_array(int number[]){
        int start = 0 ; 
        int end = number.length-1 ; 

        for(int i=start ; i<=end ; i++){
            for(int j=i ; j<=end ; j++){
                System.out.print("("+number[i]+","+number[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int array_num[] = {2,4,6,8,10,12,14,16,18,20} ; 
        pairing_array(array_num);

    }
}


