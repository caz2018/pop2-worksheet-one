import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BarChartTest {

    @Test
    public void chartLength() {
        String chars = BarChart.getBar(1000);

        Assert.assertTrue(chars.length() == 10);
    }
}