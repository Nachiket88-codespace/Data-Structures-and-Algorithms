import java.util.* ; 
public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.print("Enter your current age = ");
        float age = sc.nextFloat() ; 

        if(age<=13){
            System.out.println("Yet to become a teenager ");
        }
        if(age>13 && age<18){
            System.out.println("you are a teenager ");
        }
        if(age>=18){
            System.out.println("you are eligible to vote and drive ");
        }
        else{
            System.out.println("Hmmmmmmmmmmm");
        }

        sc.close();
    }
}
