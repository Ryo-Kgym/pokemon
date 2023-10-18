package pokemon.core.domain.model.attribute;

import java.util.List;

class GrassAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.WATER,
                Attribute.GROUND,
                Attribute.ROCK
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.GRASS,
                Attribute.POISON,
                Attribute.FLYING,
                Attribute.BUG,
                Attribute.DRAGON,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
