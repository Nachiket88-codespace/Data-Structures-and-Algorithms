import java.util.* ; 
public class Binary_Search {

    public static int search_binary(int list_of_number[],int keys){
        // Arrays.sort(list_of_number);
        int start = 0 ; 
        int end = list_of_number.length-1 ; 
        while(start <= end){
            int mid_value = (start+end) / 2 ;
            if(list_of_number[mid_value] == keys){
                System.out.print(keys + " found at index " + mid_value);
                return mid_value ; 
            }
            else if(list_of_number[mid_value] < keys){
                start = mid_value + 1 ;
            }
            else{
                end = mid_value - 1 ;
            }
        }
        return -1 ; 
    }
    public static void main(String[] args) {
        int list_of_number[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 25} ; 
        Scanner sc = new Scanner(System.in) ; 
        System.out.print("enter any key from an array = ");
        int key = sc.nextInt() ; 

        int index = search_binary(list_of_number, key) ; 
        System.out.println(index);

        sc.close();

    }
}