package battleship;

import static org.junit.Assert.assertArrayEquals;

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
    
}
