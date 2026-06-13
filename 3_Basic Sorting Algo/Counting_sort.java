// import java.util.*;
public class Counting_sort {

    public static void sort_counting(int array_lists[]){

        
    int largest = Integer.MIN_VALUE ; 
    for(int i=0 ; i < array_lists.length ; i++){
        largest = Math.max(largest, array_lists[i]) ; 
    }

    int count_freq[] = new int[largest + 1 ] ; 
    for(int i=0 ; i < array_lists.length ; i++){
        count_freq[array_lists[i]]++ ; 
    }

    int k = 0 ;
    for(int j=0 ; j < count_freq.length ; j++){
        while(count_freq[j] > 0){
            array_lists[k] =  j ;
            k++ ; 
            count_freq[j]-- ; 
        }
    }
    
    }

    public static void main(String[] args) {
        int array_lists[] = {1,4,1,3,2,4,3,7} ; 

        sort_counting(array_lists);

        for(int y=0 ; y < array_lists.length ; y++){
            System.out.print(array_lists[y] + " ");
        }
    }
}
