import com.structural.flyweight.after.*;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class FlyweightTest {

    @Test
    public void testFactory() {
        final int NUMBER_OF_ROWS = 5;
        final int testRow = 2;

        MyPairFactory factory = new MyPairFactory(NUMBER_OF_ROWS);

        MyPair myPair = factory.getMyPair(testRow);

        assertNotNull(myPair);
    }
}
