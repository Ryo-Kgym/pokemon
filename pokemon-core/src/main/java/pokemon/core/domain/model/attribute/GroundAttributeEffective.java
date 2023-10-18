package pokemon.core.domain.model.attribute;

import java.util.List;

class GroundAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.ELECTRIC,
                Attribute.POISON,
                Attribute.ROCK,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.GRASS,
                Attribute.BUG
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.FLYING
        );
    }
}
