import com.assertj.SecuredMethod
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

class SecuredMethodTest {

    @Test
    fun `The unlocked method should return a value`() {
        val service = SecuredMethod()

        val value = service.unlockedMethod()

        assertNotNull(value)
    }

    @Test
    fun `The locked method should return null`() {
        val service = SecuredMethod()

        val value = service.lockedMethod()

        assertNull(value)
    }
}