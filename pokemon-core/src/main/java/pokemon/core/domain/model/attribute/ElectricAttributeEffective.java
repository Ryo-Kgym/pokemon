package pokemon.core.domain.model.attribute;

import java.util.List;

class ElectricAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.WATER,
                Attribute.FLYING
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.ELECTRIC,
                Attribute.GRASS,
                Attribute.DRAGON
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.GROUND
        );
    }
}
