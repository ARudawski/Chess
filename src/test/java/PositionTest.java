import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PositionTest {

    @Category(Position.class)
    @Test
    public void PositionCheck() {

        Position position1 = new Position(7, 7);
        Position position2 = new Position(0, 0);
        Position position3 = new Position(-3, -1);

        assertThat(position1.checkSpot(), is(true));
        assertThat(position2.checkSpot(), is(true));
        assertThat(position3.checkSpot(), is(false));
    }
}
