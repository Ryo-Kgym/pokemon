package pokemon.core.domain.model.attribute;

import java.util.List;

class FireAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.GRASS,
                Attribute.ICE,
                Attribute.BUG,
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.FIRE,
                Attribute.WATER,
                Attribute.ROCK,
                Attribute.DRAGON
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of();
    }
}
