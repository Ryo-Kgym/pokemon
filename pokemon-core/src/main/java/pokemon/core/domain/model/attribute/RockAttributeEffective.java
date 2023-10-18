package pokemon.core.domain.model.attribute;

import java.util.List;

class RockAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.ICE,
                Attribute.FLYING,
                Attribute.BUG
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIGHTING,
                Attribute.GROUND,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
