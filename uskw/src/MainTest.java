import org.junit.Assert;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void solve() {
        String sum = Main.Solve("11+22");
        Assert.assertEquals("11+22=33", sum);
    }
}