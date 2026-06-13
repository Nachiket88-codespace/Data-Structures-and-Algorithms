import java.util.* ; 
public class Inverted_Num_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

    System.out.print("enter how many lines to be printed : ");
    int number = sc.nextInt() ; 

    for(int line = 1 ; line <= number ; line++){
        for(int print = number ; print >= line ; print--){
            System.out.print(print);
        }
        System.out.print("\n");
    }
    sc.close();
    }
}
