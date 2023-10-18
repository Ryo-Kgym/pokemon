package pokemon.core.domain.model.attribute;

import java.util.List;

class PsychicAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.FIGHTING,
                Attribute.POISON
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.PSYCHIC,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.DARK
        );
    }
}
