package pokemon.core.domain.model.attribute;

import java.util.List;

class IceAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.GRASS,
                Attribute.GROUND,
                Attribute.FLYING,
                Attribute.DRAGON
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.WATER,
                Attribute.ICE,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
