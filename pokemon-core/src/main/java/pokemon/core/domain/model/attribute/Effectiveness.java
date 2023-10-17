package pokemon.core.domain.model.attribute;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
public enum Effectiveness {
    GOOD(Optional.of(new GoodEffectiveAttributes())), // 効果はばつぐん
    NORMAL(Optional.empty()), // 効果は普通
    NOT_GOOD(Optional.of(new NotGoodEffectiveAttributes())), // 効果はいまひとつ
    NONE(Optional.of(new NoneEffectiveAttributes())), // 効果がない
    ;

    @Getter
    private Optional<EffectiveAttributes> judger;

}
