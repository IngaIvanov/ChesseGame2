import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {
//        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true, 2000, 20);
//        Player blackPlayer = new Player("Vasiliy Borgov", "vasiliy.borgov@yandex.ru", false, 2500, 40);
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player: players){
            System.out.println(player);
        }

        HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);

//        System.out.println("The player 1 name is " + whitePlayer.getName());
//        System.out.println("The player 2 name is " + blackPlayer.getName());
//
//        System.out.println(whitePlayer);
//        System.out.println(blackPlayer);

//        try {
//            whitePlayer.setRank(10000);
//        }
//        catch (IllegalArgumentException err){
//            System.out.println("please update the rank to valid");
//        }
//        System.out.println(whitePlayer.getRank());


//        blackPlayer.setRank(-100);

        Player test = null;
        test.getName();


    }
    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasiliy Borgov", "vasiliy.borgov@yandex.ru", false, 2500, 40);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }

    public HashMap<String, Piece> createPieces(){

        King whiteKing = new King(new Spot("h", 7), "white_king", true);
        King blackKing = new King(new Spot("d", 8), "black_king", false);
        Rook whiteRook1 = new Rook(new Spot("a", 7), "white_rook", true);
        Rook blackRook2 = new Rook(new Spot("g", 7), "black_rook", true);
        Knight blackKnight = new Knight(new Spot("d", 6), "black_knight", false);

        //System.out.println(whiteKing);
        HashMap <String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(blackRook2.getId(),blackRook2);
        pieceHashMap.put(blackKnight.getId(), blackKnight);

        return pieceHashMap;

    }
}

