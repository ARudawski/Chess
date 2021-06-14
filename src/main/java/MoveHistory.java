
public class MoveHistory {
    private final Position from;
    private final Position to;

    public MoveHistory(Position position1, Position position2){
        from = position1;
        to = position2;
    }

    public String toString() {
        return from + " | " + to;
    }
}
