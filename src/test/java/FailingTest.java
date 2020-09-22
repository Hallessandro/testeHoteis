import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FailingTest {

   @Test
   public void testThatFails() {
       assertTrue(false, "This should fail");
   }
}
