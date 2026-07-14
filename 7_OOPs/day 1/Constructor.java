public class Constructor {
    public static void main(String[] args) {
        manager m1 = new manager(10852) ; 
        // System.out.println(m1.id_num);  // can't access because id_num is private 
        System.out.println(m1.get_id_num());

        System.out.println("---------------------------------------");

        manager m2 = new manager("hari") ; 
        System.out.println(m2.name_id);

        System.out.println("---------------------------------------");

        manager m3 = new manager("hari", 10852) ; 
        System.out.println(m3.name_id);
        // System.out.println(m3.id_num);// can't access because id_num is private 
        System.out.println(m3.get_id_num());
        
    }
}

class manager{
    public String name_id ; 
    private int id_num ; 
    int get_id_num(){
        return id_num ; 
    }

    String name_id(){
        return name_id ; 
    }

    // making a constructor ...

    // 1)non-parameterized...
    manager(){
        System.out.println("this a non-default constructor .....");
    }
    // 2)parameterized ...
    manager(int id_num){
        this.id_num = id_num ; 
    }
    // 2)parameterized ...
    manager(String name_id){
        this.name_id = name_id ; 
    }
    // 2)parameterized ...
    manager(String name_id , int id_num){
        this.name_id = name_id ; 
        this.id_num = id_num ; 
        // System.out.println(this.name_id);
        // System.out.println(this.id_num);
    }
}