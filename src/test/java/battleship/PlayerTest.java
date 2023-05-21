package battleship;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void predictTest() {
        Player player = new Player();
        Rival rival = new Rival();
        rival.setShip(4, 4);
        player.setRival(rival);
        player.getBoard()[4][4] = 'X';

        Player playerTest = new Player();
        playerTest.setRival(rival);
        playerTest.predict(4, 4);

        assertArrayEquals(player.getBoard(), playerTest.getBoard());
    }
    
    @Test
    public void predictTestInvalidCoordinates() {
        String expectedMessage = "Invalid coordinates";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalPrintStream = System.out;
        System.setOut(printStream);

        Player player = new Player();
        player.predict(10, 10);

        String actualMessage = outputStream.toString().trim();
        assertEquals(actualMessage, expectedMessage);

        System.setOut(originalPrintStream);
    }

    /* Not working
    @Test
    public void predictTestDoubleShot() {
        String expectedMessage = "You already shot there!";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalPrintStream = System.out;
        System.setOut(printStream);

        Player player = new Player();
        player.predict(0, 0);
        player.predict(0, 0);

        String actualMessage = outputStream.toString().trim();
        assertEquals(actualMessage, expectedMessage);

        System.setOut(originalPrintStream);
    }
    */

    @Test
    public void clearBoard() {
        Player player = new Player();

        Player playerTest = new Player();
        playerTest.getBoard()[0][0] = 'X';
        playerTest.clearBoard();
        
        assertArrayEquals( player.getBoard(), playerTest.getBoard());
    }
}
