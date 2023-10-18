package pokemon.core.domain.model.attribute;

import java.util.Arrays;
import java.util.List;

interface AttributeEffective {

    List<Attribute> getGoodList();

    default List<Attribute> getNormalList() {
        // 他の余事象とする。
        return Arrays.stream(Attribute.values())
                .filter(a -> !getGoodList().contains(a))
                .filter(a -> !getNotGoodList().contains(a))
                .filter(a -> !getNoneList().contains(a))
                .toList();
    }

    List<Attribute> getNotGoodList();

    List<Attribute> getNoneList();
}
