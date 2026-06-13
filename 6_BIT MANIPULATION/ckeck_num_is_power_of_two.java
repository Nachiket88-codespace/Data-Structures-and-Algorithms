public class ckeck_num_is_power_of_two {

    public static boolean check(int num){
        if((num & (num-1)) == 0){
            return true ; 
        }
        return false ; 
    }
    public static void main(String[] args) {
        System.out.println(check(15));
    }
}
