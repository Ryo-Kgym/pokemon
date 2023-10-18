package pokemon.core.domain.model.attribute;

import java.util.List;

class SteelAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.ICE,
                Attribute.ROCK,
                Attribute.FAIRY
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.WATER,
                Attribute.ELECTRIC,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
