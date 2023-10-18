package pokemon.core.domain.model.attribute;

import java.util.List;

class PoisonAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.GRASS,
                Attribute.FAIRY
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.POISON,
                Attribute.GROUND,
                Attribute.ROCK,
                Attribute.GHOST
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.STEEL
        );
    }
}
