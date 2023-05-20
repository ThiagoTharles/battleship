package battleship;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RivalTest {
    @Test
    public void setShip() {
        Rival rival = new Rival();
        rival.getGrid()[0][0] = 1;

        Rival rivalTest = new Rival();
        rivalTest.setShip(0, 0);
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

}
