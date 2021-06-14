import java.util.ArrayList;

public class Knight extends chessPiece{

    private static final Move[] MOVES = {new Move(2,1),new Move(2,-1), new Move(-1,2), new Move(1,2),
                    new Move(-2,1),new Move(-2,-1), new Move(1,-2), new Move(-1,-2)};

    public Knight(Position position) {
        super(position);
    }

    @Override
    public ArrayList<Position> getReach() {
      ArrayList<Position> possibleMoves = new ArrayList<>();
        for(int i = 0; i < 8; i++ ){
            if(movePosition(MOVES[i]) != getPosition()){
                possibleMoves.add(movePosition(MOVES[i]));
            }
        }
        return possibleMoves;
    }

    @Override
    public ArrayList<Position> getHalfReach(){
        ArrayList<Position> possibleMoves = new ArrayList<>();
        for(int i = 0; i < 4; i++ ){
            if(movePosition(MOVES[i]) != getPosition()){
                possibleMoves.add(movePosition(MOVES[i]));
            }
        }
        return possibleMoves;
    }
}
