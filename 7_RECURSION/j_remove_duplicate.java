public class j_remove_duplicate {

    public static void duplicate(String str,int index,StringBuilder newstring,boolean map[]){
        if(index == str.length()){
            System.out.println(newstring);
            return  ;
        }

        char curr_char = str.charAt(index) ;
        if(map[curr_char-'a']==true){
            duplicate(str, index+1, newstring, map);
        }
        else{
            map[curr_char-'a']=true ;
            duplicate(str, index+1, newstring.append(curr_char), map);
        }
    }
    
    public static void main(String[] args) {
        String str = "appnnacollege" ;
        duplicate(str, 0, new StringBuilder(), new boolean[26]);
    }
}
