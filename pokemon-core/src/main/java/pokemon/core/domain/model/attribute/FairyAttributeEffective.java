package pokemon.core.domain.model.attribute;

import java.util.List;

class FairyAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.FIGHTING,
                Attribute.DRAGON,
                Attribute.DARK
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.POISON,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
