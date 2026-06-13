import java.util.*; 
public class String_linear_search {

    public static int string_search(String menu[] , String item){
        for(int i= 0 ; i < menu.length ; i++){
            if(menu[i].equals(item)){
                return i ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        String menu[] = {"idli" , "dosa" , "upma" , "wada" , "poha" , "tea" , " coffee"} ; 
        Scanner sc = new Scanner(System.in)  ;
        System.out.print("enter any item that's need to be searched in array : ");
        String item = sc.nextLine() ; 

        int index = string_search(menu, item) ; 
        if(index == -1){
            System.out.println("item not found ");
        }
        else{
            System.out.println("index number of " + item + " is = " + index );
        }

        sc.close();


    }
}
