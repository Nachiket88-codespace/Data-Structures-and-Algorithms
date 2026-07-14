public class String_Compressed {

    public static String string_compression(String str_new_key) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str_new_key.length(); i++) {
            Integer count_char = 1;
            
            // Check boundary FIRST, then characters
            while (i < str_new_key.length() - 1 && str_new_key.charAt(i) == str_new_key.charAt(i+1)) {
                count_char++;
                i++;
            }
            
            sb.append(str_new_key.charAt(i));
            if (count_char > 1) {
                sb.append(count_char.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str_new_key = "aaaaarrrrrfffffbhbhbhbhnnnnnxcxcxcxzzzzz";
        System.out.println(string_compression(str_new_key));
    }
}
