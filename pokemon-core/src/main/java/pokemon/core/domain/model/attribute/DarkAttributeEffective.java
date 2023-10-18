package pokemon.core.domain.model.attribute;

import java.util.List;

class DarkAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.GHOST,
                Attribute.PSYCHIC
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIGHTING,
                Attribute.DARK,
                Attribute.FAIRY
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
