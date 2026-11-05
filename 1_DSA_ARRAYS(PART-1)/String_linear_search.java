import java.util.*;
public class String_linear_search {

    public static int string_search(String menus[] , String choice){
        for(int i=0 ; i<menus.length ; i++){
            if(menus[i].equals(choice)){
                return  i ; 
            }
        }
        return -1 ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        String dish ; 
        System.out.println("enter your favourite dish : ");
        dish = sc.nextLine() ;

        String menu[] = {"poha","upma","wada","dosa","idli","pongal"} ; 
        int index = string_search(menu, dish) ; 
        if(index != -1){
            System.out.println("dish found at index : " + index);
            System.out.println("dish is : "+menu[index]);
        }
        else{
            System.out.println("no dish found");
        }

        sc.close();

    }
}