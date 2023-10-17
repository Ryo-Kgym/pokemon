package pokemon.core.domain.model.attribute;

import java.util.Arrays;

public enum Attribute {
    NORMAL, // ノーマル
    FIRE, // ほのお
    WATER, // みず
    GRASS, // くさ
    ELECTRIC, // でんき
    ICE, // こおり
    FIGHTING, // かくとう
    POISON, // どく
    GROUND, // じめん
    FLYING, // ひこう
    PSYCHIC, // エスパー
    BUG, // むし
    ROCK, // いわ
    GHOST, // ゴースト
    DRAGON, // ドラゴン
    DARK, // あく
    STEEL, // はがね
    FAIRY, // フェアリー
    ;

    public Effectiveness getEffectiveness(Attribute opponent) {

        return Arrays.stream(Effectiveness.values())
                .filter(e -> e.getJudger()
                        .map(j -> j.getTarget(this).contains(opponent))
                        .orElse(false))
                .findFirst()
                .orElse(Effectiveness.NORMAL);
    }
}
