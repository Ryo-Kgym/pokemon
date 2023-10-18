package pokemon.core.domain.model.attribute;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.function.Function;

@AllArgsConstructor
public enum Effectiveness {
    GOOD(AttributeEffective::getGoodList), // 効果はばつぐん
    NORMAL(AttributeEffective::getNormalList), // 効果は普通
    NOT_GOOD(AttributeEffective::getNotGoodList), // 効果はいまひとつ
    NONE(AttributeEffective::getNoneList), // 効果がない
    ;

    @Getter
    private Function<AttributeEffective, List<Attribute>> getAttributeFunction;
}
