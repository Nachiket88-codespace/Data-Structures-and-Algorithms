public class Compressed_string {

    public static String compression(String str){
        String compressed_str = "" ; 
        for(int i=0 ; i<str.length() ; i++){
            Integer count = 1 ; 
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++ ; 
                i++ ; 
            }
            compressed_str += str.charAt(i) ; 
            if(count>1){
                compressed_str += count.toString() ; 
            }
        }
        return compressed_str ; 
    }
    
    public static void main(String[] args) {
        String new_str = "aaaabbbcccccddeeeeeee" ; 
        System.out.println(compression(new_str));
    }
}
