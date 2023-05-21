package battleship;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RivalTest {
    @Test
    public void setShipTest() {
        Rival rival = new Rival();
        rival.getGrid()[0][0] = 1;

        Rival rivalTest = new Rival();
        rivalTest.setShip(0, 0);
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

    @Test
    public void setShipTestHorizontal() {
        Rival rival = new Rival();
        rival.getGrid()[0][0] = 1;
        rival.getGrid()[0][1] = 1;
        rival.getGrid()[0][2] = 1;
        rival.getGrid()[0][3] = 1;

        Rival rivalTest = new Rival();
        rivalTest.setShip(4, 0, 0, "horizontal");
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

    @Test
    public void setShipTestVertical() {
        Rival rival = new Rival();
        rival.getGrid()[0][0] = 1;
        rival.getGrid()[1][0] = 1;
        rival.getGrid()[2][0] = 1;
        rival.getGrid()[3][0] = 1;

        Rival rivalTest = new Rival();
        rivalTest.setShip(4, 0, 0, "vertical");
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

    @Test
    public void setShipTestInvalidSize() {
        Rival rival = new Rival();

        Rival rivalTest = new Rival();
        rivalTest.setShip(0, 0, 0, "horizontal");
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

    @Test
    public void setShipTestInvalidCoordinates() {
        Rival rival = new Rival();

        Rival rivalTest = new Rival();
        rivalTest.setShip(4, 10, 10, "horizontal");
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

    @Test
    public void setShipTestOverflowCoordinates() {
        Rival rival = new Rival();

        Rival rivalTest = new Rival();
        rivalTest.setShip(4, 8, 8, "horizontal");
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }

    @Test
    public void setShipTestInvalidOrientation() {
        Rival rival = new Rival();

        Rival rivalTest = new Rival();
        rivalTest.setShip(4, 0, 0, "diagonal");
        assertArrayEquals(rival.getGrid(), rivalTest.getGrid());
    }
}
