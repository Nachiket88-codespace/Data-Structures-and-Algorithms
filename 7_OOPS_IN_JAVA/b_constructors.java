public class b_constructors {

    public static void main(String[] args) {
        cars c1  = new cars();
        c1.name = "ferrari" ; 

        cars c2 = new cars("mustang" , 500003.1546) ; 
        cars c3 = new  cars("mclaren","navy blue",5);

        System.out.println(c1.name);
        System.out.println(c2.price);
        System.out.println(c3.color);


    }
}
class cars{
    String name ; 
    int exhausts ; 
    double price ; 
    String color ; 

    cars(){
        System.out.println("default constructor invoked");
    }
    cars(String name , double price){
        this.name = name ; 
        this.price = price ; 
    }
    cars(String name , String color , int exhausts){
        this.name = name ; 
        this.color = color ; 
        this.exhausts = exhausts ; 
    }
}