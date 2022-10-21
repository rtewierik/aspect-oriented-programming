import com.assertj.SecuredMethodJava;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class SecuredMethodJavaTest {

    @Test
    public void theUnlockedMethodShouldReturnAValue() {
        SecuredMethodJava service = new SecuredMethodJava();

        String value = service.unlockedMethod();

        assertNotNull(value);
    }

    @Test
    public void theLockedMethodShouldReturnNull() {
        SecuredMethodJava service = new SecuredMethodJava();

        String value = service.lockedMethod();

        assertNull(value);
    }
}
