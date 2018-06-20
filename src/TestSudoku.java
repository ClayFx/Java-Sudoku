import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertTrue;

public class TestSudoku {
    @Rule
    public Timeout globalTimeout = Timeout.millis(4000);

    @Test
    public void TestSimple() {
        assertTrue("Something Wrong",1==1);
    }

}
