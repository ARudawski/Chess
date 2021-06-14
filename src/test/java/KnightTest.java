import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KnightTest {

    @Category(Knight.class)
    @Test
    public void KnightReach() {

        Knight McKnight = new Knight(new Position(0,0));
        Knight McMiddleKnight = new Knight(new Position(4,4));
        Knight FarAwayKnight = new Knight(new Position(-10, 0));

        assertThat(McKnight.getReach().size(), is(2));
        assertThat(McMiddleKnight.getReach().size(), is(8));
        assertThat(FarAwayKnight.getReach().size(), is(0));
    }

    @Test
    public void KnightMovePosition() {
        Knight McKnight = new Knight(new Position(0,0));
        Knight McMiddleKnight = new Knight(new Position(4,4));
        Knight FarAwayKnight = new Knight(new Position(-10 ,0));

        Move move = new Move(2, -2);
        Position standing = new Position(0, 0);
        Position position1 = new Position(6, 2);

        assertThat(McKnight.movePosition(move).equals(standing), is(true));
        assertThat(McMiddleKnight.movePosition(move).equals(position1), is(true));
        assertThat(FarAwayKnight.movePosition(move).toString(), is("Thats not on any Chessfield."));
    }

    @Test
    public void KnightSetPosition() {

        Position faraway = new Position(-10, 0);
        Position standing = new Position(0, 0);
        Position position1 = new Position(6, 2);

        Knight McKnight = new Knight(standing);
        assertThat(McKnight.getPosition().equals(standing), is(true));

        McKnight.setPosition(position1);
        assertThat(McKnight.getPosition().equals(position1), is(true));

        McKnight.setPosition(faraway);
        assertThat(McKnight.getPosition().toString(), is("Thats not on any Chessfield."));

    }
}