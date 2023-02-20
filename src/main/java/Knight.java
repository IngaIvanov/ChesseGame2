public class Knight extends Piece{
    private static final String name = "Knight";

    public Knight(Spot spot, String id, boolean white) {
        super(name, String.valueOf(spot), id, white);
    }
}
