package sneakpeek

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestCalculatorTest {

    private val testCalculator = TestCalculator()

    @Test
    fun plus() {
        val result = testCalculator.plus(1, 2)

        assertThat(result).isEqualTo(3)
    }

    @ParameterizedTest
    @CsvSource("1, 2, 3", "2, 3, 5", "4, 5, 9")
    fun plus2(first: Long, second: Long, expected: Long) {
        val result = testCalculator.plus(first, second)

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun minus() {
        val result = testCalculator.minus(2, 1)

        assertThat(result).isEqualTo(1)
    }
}