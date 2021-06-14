import java.util.ArrayList;

public abstract class chessPiece {
    private Position position;

    public chessPiece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract ArrayList<Position> getReach();

    public abstract ArrayList<Position> getHalfReach();


    public Position movePosition(Move move) {
        Position moved = new Position(position.getX() + move.getX(), position.getY() + move.getY());
        if (moved.checkSpot()) {
            return moved;
        } else return position;
    }

    public ArrayList<MoveHistory> allMatchUpPositions() {
        ArrayList<MoveHistory> matches = new ArrayList<>();
        ArrayList<Position> currentReach;
        for(int i = 0; i < 8; i++ ) {
            for (int j = 0; j < 8; j++) {
                setPosition(new Position(i, j));
                currentReach = getReach();
                System.out.println(new Position(i,j) + " -> " + currentReach);
                for (int k = 0; k < getReach().size(); k++){
                    matches.add(new MoveHistory(getPosition(), currentReach.get(k)));
                }
            }
        }
        return matches;
    }
}