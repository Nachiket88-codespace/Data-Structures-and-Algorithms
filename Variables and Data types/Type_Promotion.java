public class Type_Promotion {
    public static void main(String[] args) {
        
        int num_1 = 47 ; 
        int num_2 = 12 ; 
        char num_3 = 'n' ; 

        int sum = num_1+num_2+num_3 ; 
        System.out.println(sum);

        byte convert = (byte)(sum) ; 
        System.out.println(convert);
    }
}
