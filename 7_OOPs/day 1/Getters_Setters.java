public class Getters_Setters{
    public static void main(String[] args) {
        Pen p1 = new Pen() ; 
        p1.set_color("red");
        p1.set_tip(7);

        // System.out.println(p1.color); // cant access as they are private 
        // System.out.println(p1.tip);   // cant access as they are private 

        System.out.println(p1.get_color());
        System.out.println(p1.get_tip());
    }
}

class Pen{
    private String color ; 
    private int tip ; 

    String get_color(){
        return this.color ; 
    }

    int get_tip(){
        return this.tip ; 
    }

    void set_color(String color ){
        this.color = color ; 
    }

    void set_tip(int tip){
        this.tip = tip ; 
    }
}
