import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest extends TestCase {
    private Game g;

    protected void setUp() throws Exception{
        g = new Game();
    }

    @Test
    public void testGutterGame() throws Exception {
        int n = 20;
        int pins = 0;
        for (int i = 0; i < n; i++){
            g.roll(pins);
            Assert.assertEquals(0, g.score());
        }
    }

    @Test
    public void testAllOnes() throws Exception {
        for(int i = 0; i < 20; i++){
            g.roll(1);
            Assert.assertEquals(20, g.score());
        }
    }
}