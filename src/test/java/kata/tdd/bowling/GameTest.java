package kata.tdd.bowling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {

    private Game g;

    @BeforeEach
    void setupGame() {
        g = new Game();
    }

    @Test
    void testNullGame() {
        rollMany(20, 0);
        Assertions.assertEquals(0, g.getScore());
    }

    @Test
    void testAllOnes() {
        rollMany(20, 1);
        Assertions.assertEquals(20, g.getScore());
    }

    @Test
    void testOneSpare() {
        g.roll(1);
        g.roll(9); //spare
        g.roll(3); //counts double
        rollMany(17, 0);
        Assertions.assertEquals(16, g.getScore());
    }

    @Test
    void testOneStrike() {
        g.roll(10); //strike
        g.roll(2); //1st roll 2nd frame counts double
        g.roll(3); //2nd roll 2nd frame counts double
        rollMany(17, 0);
        Assertions.assertEquals(20, g.getScore());
    }

    @Test
    void testPerfectGame(){
        rollMany(12,10);
        Assertions.assertEquals(300, g.getScore());
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            g.roll(pins);
        }
    }

}
