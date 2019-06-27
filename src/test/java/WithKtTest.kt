import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.Duration.ofMillis

internal class WithKtTest {

    @Test
    fun naturalNumber() {
  //      assertEquals(1,naturalNumber(list,3).size)
 //       assertEquals(3,naturalNumber(list,3).get(0))
        assertEquals(2,naturalNumber(list,6).size)


    }

    @Test
    fun isprime() {
        assertEquals(true,isprime(2))
        assertEquals(false,isprime(4))
        assertTimeout(ofMillis(1)) {
          isprime(10000000)

        }
    }
}