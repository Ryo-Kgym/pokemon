package pokemon.core.domain.model.attribute;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GoodEffectiveAttributesTest {

    @ParameterizedTest(name = "case {index}: {0} is advantageous to {1}")
    @MethodSource("provider")
    void getTarget(Attribute attribute, List<Attribute> expected) {
        var actual = new GoodEffectiveAttributes().getTarget(attribute);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(
                        Attribute.NORMAL,
                        List.of()
                ),
                Arguments.of(
                        Attribute.FIRE,
                        List.of(Attribute.GRASS, Attribute.ICE, Attribute.BUG, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.WATER,
                        List.of(Attribute.FIRE, Attribute.GROUND, Attribute.ROCK)
                ),
                Arguments.of(
                        Attribute.GRASS,
                        List.of(Attribute.WATER, Attribute.GROUND, Attribute.ROCK)
                ),
                Arguments.of(
                        Attribute.ELECTRIC,
                        List.of(Attribute.WATER, Attribute.FLYING)
                ),
                Arguments.of(
                        Attribute.ICE,
                        List.of(Attribute.GRASS, Attribute.GROUND, Attribute.FLYING, Attribute.DRAGON)
                ),
                Arguments.of(
                        Attribute.FIGHTING,
                        List.of(Attribute.NORMAL, Attribute.ICE, Attribute.ROCK, Attribute.DARK, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.POISON,
                        List.of(Attribute.GRASS, Attribute.FAIRY)
                ),
                Arguments.of(
                        Attribute.GROUND,
                        List.of(Attribute.FIRE, Attribute.ELECTRIC, Attribute.POISON, Attribute.ROCK, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.FLYING,
                        List.of(Attribute.GRASS, Attribute.FIGHTING, Attribute.BUG)
                ),
                Arguments.of(
                        Attribute.PSYCHIC,
                        List.of(Attribute.FIGHTING, Attribute.POISON)
                ),
                Arguments.of(
                        Attribute.BUG,
                        List.of(Attribute.GRASS, Attribute.PSYCHIC, Attribute.DARK)
                ),
                Arguments.of(
                        Attribute.ROCK,
                        List.of(Attribute.FIRE, Attribute.ICE, Attribute.FLYING, Attribute.BUG)
                ),
                Arguments.of(
                        Attribute.GHOST,
                        List.of(Attribute.PSYCHIC, Attribute.GHOST)
                ),
                Arguments.of(
                        Attribute.DRAGON,
                        List.of(Attribute.DRAGON)
                ),
                Arguments.of(
                        Attribute.DARK,
                        List.of(Attribute.PSYCHIC, Attribute.GHOST)
                ),
                Arguments.of(
                        Attribute.STEEL,
                        List.of(Attribute.ICE, Attribute.ROCK, Attribute.FAIRY)
                ),
                Arguments.of(
                        Attribute.FAIRY,
                        List.of(Attribute.FIGHTING, Attribute.DRAGON, Attribute.DARK)
                )
        );
    }
}