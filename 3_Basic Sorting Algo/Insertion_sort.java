public class Insertion_sort {

    public static void sort_insertion(int list_num[]) {
        for (int i = 1; i <= list_num.length - 1; i++) {
            // FIX: Store the actual value of the 'card' in a variable
            // If you use list_num[current], it gets overwritten during shifting!
            int temp = list_num[i]; 
            int previous = i - 1;

            // FIX: Compare the elements in the hand with 'temp'
            while (previous >= 0 && list_num[previous] > temp) {
                list_num[previous + 1] = list_num[previous]; 
                previous--;
            }
            
            // FIX: Place the stored value into its correct position
            list_num[previous + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int list_num[] = {5, 2, 4, 3, 1};

        sort_insertion(list_num);

        for (int i = 0; i < list_num.length; i++) {
            System.out.print(list_num[i] + " ");
        }
    }
}

