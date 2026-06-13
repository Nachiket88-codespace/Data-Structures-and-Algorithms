public class Pairs_in_array {

    public static void pairing(int integers[]){
        for(int i=0 ; i < integers.length ; i++){
            for(int j=i+1 ; j < integers.length ; j++){
                System.out.print("( " + integers[i]+" , "+integers[j]+" )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int integers[] = {2,4,6,8,10,12,14,16} ; 

        pairing(integers);

    }
}