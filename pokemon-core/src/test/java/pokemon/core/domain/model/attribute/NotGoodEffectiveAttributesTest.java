package pokemon.core.domain.model.attribute;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NotGoodEffectiveAttributesTest {

    @ParameterizedTest(name = "case {index}: {0} is not good effective to {1}")
    @MethodSource("provider")
    void getTarget(Attribute attribute, List<Attribute> expected) {
        var actual = new NotGoodEffectiveAttributes().getTarget(attribute);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(
                        Attribute.NORMAL,
                        List.of(Attribute.ROCK, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.FIRE,
                        List.of(Attribute.FIRE, Attribute.WATER, Attribute.ROCK, Attribute.DRAGON)
                ),
                Arguments.of(
                        Attribute.WATER,
                        List.of(Attribute.WATER, Attribute.GRASS, Attribute.DRAGON)
                ),
                Arguments.of(
                        Attribute.GRASS,
                        List.of(Attribute.FIRE, Attribute.GRASS, Attribute.POISON, Attribute.FLYING, Attribute.BUG, Attribute.DRAGON, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.ELECTRIC,
                        List.of(Attribute.GRASS, Attribute.ELECTRIC, Attribute.DRAGON)
                ),
                Arguments.of(
                        Attribute.ICE,
                        List.of(Attribute.FIRE, Attribute.WATER, Attribute.ICE, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.FIGHTING,
                        List.of(Attribute.POISON, Attribute.FLYING, Attribute.PSYCHIC, Attribute.BUG, Attribute.FAIRY)
                ),
                Arguments.of(
                        Attribute.POISON,
                        List.of(Attribute.POISON, Attribute.GROUND, Attribute.ROCK, Attribute.GHOST)
                ),
                Arguments.of(
                        Attribute.GROUND,
                        List.of(Attribute.GRASS, Attribute.BUG)
                ),
                Arguments.of(
                        Attribute.FLYING,
                        List.of(Attribute.ELECTRIC, Attribute.ROCK, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.PSYCHIC,
                        List.of(Attribute.PSYCHIC, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.BUG,
                        List.of(Attribute.FIRE, Attribute.FIGHTING, Attribute.POISON, Attribute.FLYING, Attribute.GHOST, Attribute.STEEL, Attribute.FAIRY)
                ),
                Arguments.of(
                        Attribute.ROCK,
                        List.of(Attribute.FIGHTING, Attribute.GROUND, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.GHOST,
                        List.of(Attribute.DARK)
                ),
                Arguments.of(
                        Attribute.DRAGON,
                        List.of(Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.DARK,
                        List.of(Attribute.FIGHTING, Attribute.DARK, Attribute.FAIRY)
                ),
                Arguments.of(
                        Attribute.STEEL,
                        List.of(Attribute.FIRE, Attribute.WATER, Attribute.ELECTRIC, Attribute.STEEL)
                ),
                Arguments.of(
                        Attribute.FAIRY,
                        List.of(Attribute.FIRE, Attribute.POISON, Attribute.STEEL)
                )
        );
    }
}