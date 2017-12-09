import com.structural.bridge.Cooker;
import com.structural.bridge.SimpleCooker;
import com.structural.bridge.cookingActions.CookCake;
import com.structural.bridge.cookingActions.CookPizza;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class MessageTest {

    @Test
    public void testGetContent() {
        Cooker cooker = new SimpleCooker("Oleg", new CookCake());

        CookPizza cookPizza = new CookPizza();
        cooker.setCookingAction(cookPizza);

        assertEquals(cooker.getCookingAction(), cookPizza);
    }
}
