package pokemon.core.domain.model.attribute;

import java.util.List;

class FightingAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.NORMAL,
                Attribute.ICE,
                Attribute.ROCK,
                Attribute.DARK,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.POISON,
                Attribute.FLYING,
                Attribute.PSYCHIC,
                Attribute.BUG,
                Attribute.FAIRY
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.GHOST
        );
    }
}
