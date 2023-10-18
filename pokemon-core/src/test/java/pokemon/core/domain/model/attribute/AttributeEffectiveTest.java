package pokemon.core.domain.model.attribute;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AttributeEffectiveTest {

    @Test
    void getNormalAgainstList() {
        var actual = new TestAttributeEffective().getNormalList();
        assertThat(actual, is(List.of(
                Attribute.NORMAL,
                Attribute.ELECTRIC,
                Attribute.ICE,
                Attribute.FIGHTING,
                Attribute.POISON,
                Attribute.GROUND,
                Attribute.FLYING,
                Attribute.PSYCHIC,
                Attribute.BUG,
                Attribute.ROCK,
                Attribute.GHOST,
                Attribute.DRAGON,
                Attribute.DARK,
                Attribute.STEEL,
                Attribute.FAIRY))
        );
    }

    private static class TestAttributeEffective implements AttributeEffective {

        @Override
        public List<Attribute> getGoodList() {
            return List.of(Attribute.FIRE);
        }

        @Override
        public List<Attribute> getNotGoodList() {
            return List.of(Attribute.WATER);
        }

        @Override
        public List<Attribute> getNoneList() {
            return List.of(Attribute.GRASS);
        }
    }
}