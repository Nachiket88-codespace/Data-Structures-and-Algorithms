public class Sub_string {
    public static String substring_print(String str_new , int start_index , int end_index){
        String Sub_string = "" ; 
        for(int i=start_index ; i<end_index ; i++){
            Sub_string += str_new.charAt(i) ; 
        }
        return Sub_string ; 
    }
    public static void main(String[] args) {
        String str_new = "HelloWorld" ; 
        String print_sub_string = substring_print(str_new, 0, 6) ; 
        System.out.println(print_sub_string);

        // direct built in function : 
        String substring_print = str_new.substring(2, 7) ; 
        System.out.println(substring_print);

    }
}
