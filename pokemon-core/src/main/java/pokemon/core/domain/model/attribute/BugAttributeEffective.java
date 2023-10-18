package pokemon.core.domain.model.attribute;

import java.util.List;

class BugAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.GRASS,
                Attribute.PSYCHIC,
                Attribute.DARK
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.FIGHTING,
                Attribute.POISON,
                Attribute.FLYING,
                Attribute.GHOST,
                Attribute.STEEL,
                Attribute.FAIRY
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
