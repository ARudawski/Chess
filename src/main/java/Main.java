import java.util.Arrays;

public class Main {

    public static void main (String[] args)
    {
        Knight McKnight = new Knight(new Position(1,1));
        System.out.println((McKnight.allMatchUpPositions()).size()); // hab eine println für allMatchUpPositions eingebaut für einen strukturierteren Überblick, an sich gibt die Funktion aber eine ArrayList<MoveHistory> zurück.

    }
}