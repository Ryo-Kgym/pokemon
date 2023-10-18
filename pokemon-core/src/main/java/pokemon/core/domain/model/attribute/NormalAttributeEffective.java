package pokemon.core.domain.model.attribute;

import java.util.List;

class NormalAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of();
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.ROCK,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.GHOST
        );
    }
}
