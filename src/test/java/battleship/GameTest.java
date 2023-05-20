package battleship;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
    private Game game;
    private Player player;
    private Rival rival;

    @Before
    public void setUp() {
        game = new Game();
        player = new Player();
        rival = new Rival();
        rival.setShip(4, 4);
        rival.setShip(2, 2, 3, "horizontal");
        rival.setShip(3, 6, 6, "vertical");
        player.setRival(rival);
    }

    @Test
    public void testEndGameVerification() {
        // Arrange
        player.predict(4, 4);
        player.predict(6, 6);
        player.predict(7, 6);
        player.predict(8, 6);
        player.predict(2, 3);
        player.predict(2, 4);

        // Act
        boolean endGame = game.endGameVerification(player, rival);

        // Assert
        Assert.assertFalse(endGame);
    }

    @Test
    public void testEndGameVerification_GameNotFinished() {
        // Arrange
        player.predict(0, 0);
        player.predict(0, 1);
        player.predict(0, 2);
        player.predict(0, 3);

        // Act
        boolean endGame = game.endGameVerification(player, rival);

        // Assert
        Assert.assertTrue(endGame);
    }
}
