public class Rook extends Piece{
    private static final String name = "Rook";


    public Rook(Spot spot, String id, boolean white) {
        super(name, String.valueOf(spot), id, white);
    }
}
