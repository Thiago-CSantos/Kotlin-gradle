import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertTrue(countXO("xxoo"))
    }

}