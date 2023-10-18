package pokemon.core.domain.model.attribute;

import java.util.List;

class DragonAttributeEffective implements AttributeEffective {

    @Override
    public List<Attribute> getGoodList() {
        return List.of(
                Attribute.DRAGON
        );
    }

    @Override
    public List<Attribute> getNotGoodList() {
        return List.of(
                Attribute.STEEL
        );
    }

    @Override
    public List<Attribute> getNoneList() {
        return List.of(
                Attribute.FAIRY
        );
    }
}
