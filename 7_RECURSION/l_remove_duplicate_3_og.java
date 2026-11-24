public class l_remove_duplicate_3_og {

    public static StringBuilder duplicate(String str,int index,StringBuilder newstring,boolean map[]){
        if(index == str.length()){
            // System.out.println(newstring);
            return newstring ;
        }

        char curr_char = str.charAt(index) ;
        if(map[curr_char-'a']==true){
            duplicate(str, index+1, newstring, map);
        }
        else{
            map[curr_char-'a']=true ;
            duplicate(str, index+1, newstring.append(curr_char), map);
        }

        return newstring ;
    }
    public static void main(String[] args) {
        String str = "appnnacollege" ;
        boolean array[] = new boolean[26] ; 
        StringBuilder sbs = new StringBuilder() ;

        StringBuilder update = duplicate(str, 0, sbs, array) ;
        System.out.println(update);

    }
}
