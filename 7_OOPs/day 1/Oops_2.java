public class Oops_2 {
    
    public static void main(String[] args) {
        Bank_Accounnt b_1 = new Bank_Accounnt() ; 
        b_1.name = "Hari" ; 

        // b_1.password = 12345678 ; (can't access password directly inside pakage and change it)

        b_1.change_pwd(4867591327l);

        // System.out.print(b_1.password); (again cant access password within pakage just can change it.)
    }
}

class Bank_Accounnt{
    public String name ; 
    // private long password ; 
    int accountnumber ; // its a default access modifier on its own ...

     void change_pwd(long pwd){
        // password = pwd ; 
    }
    
    
}
