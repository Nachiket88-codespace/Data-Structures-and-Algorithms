public class Pairing_arrays {

    public static void pairing_up(int arrays[]){
        for(int i=0 ; i<arrays.length ; i++){
            for(int j=i ; j<arrays.length ; j++){
                System.out.print("("+arrays[i]+","+arrays[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,20} ; 
        pairing_up(numbers);

    }
}

