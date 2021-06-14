public class Position {
    private int x;
    private int y;

    String[] CHESS_AXIS = {"A", "B", "C", "D", "E","F", "G", "H"};

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String toString(){
        int y_chess = y + 1 ;
        try {
            return  "(" + CHESS_AXIS[x] + y_chess + ")";
        } catch (Exception ArrayIndexOutOfBoundsException){
            return "Thats not on any Chessfield.";
        }
    }

    public boolean equals(Position position){
        return x == position.x && y == position.y;
    }

    public boolean checkSpot() {
        return x <= 7 && x >= 0 && y <= 7 && y >= 0;
    }
}
