import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

class SecuredMethodJavaTest {

    @Test
    fun `The unlocked method should return a value`() {
        val service = SecuredMethodJava()

        val value = service.unlockedMethod()

        assertNotNull(value)
    }

    @Test
    fun `The locked method should return null`() {
        val service = SecuredMethodJava()

        val value = service.lockedMethod()

        assertNull(value)
    }
}