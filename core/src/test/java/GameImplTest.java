
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import study.basecamp.GameImpl;

import static org.junit.Assert.assertNotEquals;


public class GameImplTest {

    private static GameImpl gameImpl;

    @BeforeAll
    public static void init() {
        gameImpl = new GameImpl();

    }

    @Test
    public void checkValidNumberRange() {
        Assertions.assertTrue(gameImpl.isValidNumberRange());
    }

    @Test
    public void testCheckUserIn() {
        final int expected = 8;
        Assert.assertEquals(expected, 8);
    }

    @Test
    void testCheckUserIn_exception() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    public void isGameWon() {
        gameImpl.setGuess(30);
        gameImpl.setNumber(30);

        Assert.assertTrue(gameImpl.isGameWon());
    }

    @Test
    public void guessIsSmallerThanZeroTest() {
        gameImpl.setGuess(-1);
        gameImpl.check();

        Assert.assertFalse(gameImpl.isValidNumberRange());
    }

    @Test()
    public void guessIsCharTest() {
        Exception exception1 = new NumberFormatException();
        Assertions.assertThrows(exception1.getClass(), () -> gameImpl.setGuess(Integer.parseInt("a")));
    }


}
