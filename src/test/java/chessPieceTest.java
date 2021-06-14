import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class chessPieceTest {

    @Category(chessPiece.class)
    @Test
    public void movePosition() {
        Move moves = new Move(2, -2);
        assertThat(moves.getX(), is(2));
        assertThat(moves.getY(), is(-2));
    }
}
