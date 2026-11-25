public class m_friends_pairing {

    public static int friend_pair_up(int num){

        if(num==1 || num==2){
            return num ;
        }

        //if all stay single .
        int fnm1 = friend_pair_up(num-1) ;

        //if one pairs up then left over people have 2 choices either to stay single
        //or to make pair ;
        int fnm2 = friend_pair_up(num-2) ; 
        int pairways  = (num-1)*fnm2 ; 

        int total = fnm1 + pairways ;

        return total ;
    }
    public static void main(String[] args) {
        
        int ans = friend_pair_up(2) ; 
        System.out.println(ans) ; ;
    }
}