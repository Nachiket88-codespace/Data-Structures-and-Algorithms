public class String_Builder {
    public static void main(String[] args) {
        
        StringBuilder new_sb = new StringBuilder("") ; 

        for(char ch='a' ; ch<='z' ; ch++){
            new_sb.append(ch) ; 
        }

        System.out.println(new_sb);

        int length = new_sb.length() ; 
        System.out.println(length);
    }
}
