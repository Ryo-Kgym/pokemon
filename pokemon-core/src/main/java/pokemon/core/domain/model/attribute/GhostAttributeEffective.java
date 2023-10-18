package pokemon.core.domain.model.attribute;

import java.util.List;

class GhostAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.PSYCHIC,
                Attribute.GHOST
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.DARK
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.NORMAL
        );
    }
}
