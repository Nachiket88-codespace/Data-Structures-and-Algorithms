public class uppercase_string {

    public static String uppercasing_string(String message){
        StringBuilder sb = new StringBuilder("") ; 
        char ch = Character.toUpperCase(message.charAt(0)) ; 
        sb.append(ch) ; 

        for(int i=1 ; i<message.length() ; i++){
            if(message.charAt(i) == ' ' && i<message.length()-1){
                sb.append(message.charAt(i)) ; 
                i++ ; 
                sb.append(Character.toUpperCase(message.charAt(i))) ; 
            }else{
                sb.append(message.charAt(i)) ; 
            }
        }
        return sb.toString() ; 
    }
    public static void main(String[] args) {
        String mesg = "hello how is it going FOR YOU tODAY" ; 

        String upper_case = uppercasing_string(mesg) ; 
        System.out.println(upper_case);

    }
}