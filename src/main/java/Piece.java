public class Piece {

    private String spot;
    private String id;
    private boolean white;
    private boolean killed;


    public Piece(String name, String spot, String id, boolean white) {
        this.name = name;
        this.spot = spot;
        this.id = id;
        this.white = white;
    }

    private String name;

    public String getName() {
        return name;
    }

    public String getSpot() {
        return spot;
    }

    public String getId() {
        return id;
    }

    public boolean isWhite() {
        return white;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "spot='" + spot + '\'' +
                ", id='" + id + '\'' +
                ", white=" + white +
                ", killed=" + killed +
                ", name='" + name + '\'' +
                '}';
    }
}
