public class k_remove_duplicates_2_og {

    public static String delete_duplicate(String str,int index,StringBuilder newstring,boolean map[]){

        if(index == str.length()){
            // System.out.println(newstring);
            return (newstring.toString()) ;
        }
        char current_char = str.charAt(index) ;

        if(map[current_char-'a']==true){
            delete_duplicate(str, index+1, newstring, map);
        }
        else{
            map[current_char-'a'] = true ;
            delete_duplicate(str, index+1, newstring.append(current_char), map);
        }
        return (newstring.toString()) ;
    }
    public static void main(String[] args) {
        
        String str = "appnnacollege" ;
        StringBuilder sb = new StringBuilder() ;
        boolean array[] = new boolean[26] ;

        String update = delete_duplicate(str, 0, sb, array);

        System.out.println(update);
    }
}