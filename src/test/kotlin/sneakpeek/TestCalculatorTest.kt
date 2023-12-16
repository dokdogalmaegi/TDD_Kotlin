package sneakpeek

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun plus() {
        val result = calculator.plus(1, 2)

        assertThat(result).isEqualTo(3)
    }

    @ParameterizedTest
    @CsvSource("1, 2, 3", "2, 3, 5", "4, 5, 9")
    fun plus2(first: Long, second: Long, expected: Long) {
        val result = calculator.plus(first, second)

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun minus() {
        val result = calculator.minus(2, 1)

        assertThat(result).isEqualTo(1)
    }

    @ParameterizedTest
    @CsvSource("2, 1, 1", "5, 3, 2", "10, 5, 5")
    fun minus2(first: Long, second: Long, expected: Long) {
        val result = calculator.minus(first, second)

        assertThat(result).isEqualTo(expected)
    }
}