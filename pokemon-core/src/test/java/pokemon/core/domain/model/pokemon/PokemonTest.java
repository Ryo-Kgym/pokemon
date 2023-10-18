package pokemon.core.domain.model.pokemon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pokemon.core.domain.model.damage.Damage;
import pokemon.core.domain.model.hit_point.HitPoint;
import pokemon.core.domain.model.recovery.Recovery;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PokemonTest {

    @Test
    void isDying() {
        var actual = Pokemon.builder()
                .serializedId(1L)
                .name("ピカチュウ")
                .hitPoint(HitPoint.valueOf(100))
                .maxHitPoint(HitPoint.valueOf(100))
                .build().isDying();

        assert !actual;
    }

    @Test
    void damagedBy() {
        var actual = Pokemon.builder()
                .serializedId(1L)
                .name("ピカチュウ")
                .hitPoint(HitPoint.valueOf(100))
                .maxHitPoint(HitPoint.valueOf(100))
                .build()
                .damagedBy(Damage.valueOf(10));

        assertThat(actual, is(Pokemon.builder()
                .serializedId(1L)
                .name("ピカチュウ")
                .hitPoint(HitPoint.valueOf(90))
                .maxHitPoint(HitPoint.valueOf(100))
                .build()));
    }

    @ParameterizedTest(name = "recover {0} hit point")
    @MethodSource("recoveredByProvider")
    void recoveredBy(Pokemon pokemon, Recovery recovery, Pokemon expected) {
        var actual = pokemon.recoveredBy(recovery);
        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> recoveredByProvider() {
        return Stream.of(
                Arguments.of(
                        Pokemon.builder()
                                .serializedId(1L)
                                .name("ピカチュウ")
                                .hitPoint(HitPoint.valueOf(100))
                                .maxHitPoint(HitPoint.valueOf(100))
                                .build(),
                        Recovery.valueOf(10),
                        Pokemon.builder()
                                .serializedId(1L)
                                .name("ピカチュウ")
                                .hitPoint(HitPoint.valueOf(100))
                                .maxHitPoint(HitPoint.valueOf(100))
                                .build()
                ),
                Arguments.of(
                        Pokemon.builder()
                                .serializedId(1L)
                                .name("ピカチュウ")
                                .hitPoint(HitPoint.valueOf(90))
                                .maxHitPoint(HitPoint.valueOf(100))
                                .build(),
                        Recovery.valueOf(10),
                        Pokemon.builder()
                                .serializedId(1L)
                                .name("ピカチュウ")
                                .hitPoint(HitPoint.valueOf(100))
                                .maxHitPoint(HitPoint.valueOf(100))
                                .build()
                )
        );
    }
}