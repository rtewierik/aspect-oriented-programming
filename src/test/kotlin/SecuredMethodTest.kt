import com.assertj.JWT
import com.assertj.SecuredMethod
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

class SecuredMethodTest {

    @Test
    fun `The unlocked method should return a value`() {
        val service = SecuredMethod()

        val value = service.unlockedMethod(JWT("valid"))

        assertNotNull(value)
    }

    @Test
    fun `The locked method should return null`() {
        val service = SecuredMethod()

        val value = service.lockedMethod(JWT("invalid"))

        assertNull(value)
    }

    @Test
    fun `The JWT method should return a value with a valid token`() {
        val service = SecuredMethod()

        val value = service.jwtMethod(JWT("valid"))

        assertNotNull(value)
    }

    @Test
    fun `The JWT method should return null with an invalid token`() {
        val service = SecuredMethod()

        val value = service.jwtMethod(JWT("invalid"))

        assertNull(value)
    }
}