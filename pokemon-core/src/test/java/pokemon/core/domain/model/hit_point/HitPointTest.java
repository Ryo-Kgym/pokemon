package pokemon.core.domain.model.hit_point;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

class HitPointTest {

    @Test
    void valueOfError() {
        assertThrows(AssertionError.class, () -> HitPoint.valueOf(-1));
    }

    @ParameterizedTest(name = "value: {0}, expected: {1}")
    @MethodSource("isDyingProvider")
    void isDying(long value, boolean expected) {
        var hitPoint = HitPoint.valueOf(value);
        assert hitPoint.isDying() == expected;
    }

    private static Stream<Arguments> isDyingProvider() {
        return Stream.of(
                Arguments.of(0, true),
                Arguments.of(1, false)
        );
    }
}