package pokemon.core.domain.model.hit_point;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pokemon.core.domain.model.damage.Damage;
import pokemon.core.domain.model.recovery.Recovery;

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

    @ParameterizedTest(name = "value: {0}, damage: {1}, expected: {2}")
    @MethodSource("removedByProvider")
    void removedBy(long value, long damage, long expected) {
        var hitPoint = HitPoint.valueOf(value);
        var damageValue = Damage.valueOf(damage);
        var removedHitPoint = hitPoint.removedBy(damageValue);
        assert removedHitPoint.getValue() == expected;
    }

    private static Stream<Arguments> removedByProvider() {
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(10, 10, 0),
                Arguments.of(10, 11, 0)
        );
    }

    @ParameterizedTest(name = "value: {0}, recovery: {1}, expected: {2}")
    @MethodSource("recoveredByProvider")
    void recoveredBy(long value, long recovery, long expected) {
        var hitPoint = HitPoint.valueOf(value);
        var recoveryValue = Recovery.valueOf(recovery);
        var recoveredHitPoint = hitPoint.recoveredBy(recoveryValue);
        assert recoveredHitPoint.getValue() == expected;
    }

    private static Stream<Arguments> recoveredByProvider() {
        return Stream.of(
                Arguments.of(10, 5, 15),
                Arguments.of(10, 10, 20)
        );
    }

    @ParameterizedTest(name = "value: {0}, hitPoint: {1}, expected: {2}")
    @MethodSource("compareWithGetMinProvider")
    void compareWithGetMin(long value, long hitPoint, long expected) {
        var hitPoint1 = HitPoint.valueOf(value);
        var hitPoint2 = HitPoint.valueOf(hitPoint);
        var comparedHitPoint = hitPoint1.compareWithGetMin(hitPoint2);
        assert comparedHitPoint.getValue() == expected;
    }

    private static Stream<Arguments> compareWithGetMinProvider() {
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(10, 10, 10),
                Arguments.of(10, 15, 10)
        );
    }
}