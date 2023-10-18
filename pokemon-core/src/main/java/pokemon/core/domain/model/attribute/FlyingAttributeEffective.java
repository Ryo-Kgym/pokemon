package pokemon.core.domain.model.attribute;

import java.util.List;

class FlyingAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.GRASS,
                Attribute.FIGHTING,
                Attribute.BUG
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.ELECTRIC,
                Attribute.ROCK,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
