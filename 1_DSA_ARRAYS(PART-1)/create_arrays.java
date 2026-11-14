public class create_arrays {
    public static void main(String[] args) {
       int arrays[] = new int[50] ; 
       int marks[] = {98,100,95,92,88,87} ; 
       String fruits[] = {"apples","oranges","grapes","mango","peach"} ; 
       
       System.out.println(arrays);
       System.out.println(marks);
       System.out.println(fruits);

       for(int i=0 ; i<fruits.length ; i++){
        System.out.println(fruits[i]);
       }
    }
}