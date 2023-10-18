package pokemon.core.domain.model.attribute;

import java.util.List;

class WaterAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.GROUND,
                Attribute.ROCK
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.WATER,
                Attribute.GRASS,
                Attribute.DRAGON
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
