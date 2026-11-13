public class k_Interfaces {
    public static void main(String[] args) {
        queen q1 = new queen() ; 
        rook r1 = new rook() ; 
        q1.moves();
        r1.moves();
    }
}
interface chessplayer{
    void moves() ; 
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("moves up,down,right,left,diagonal");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("moves vertically and horizontally");
    }
}
