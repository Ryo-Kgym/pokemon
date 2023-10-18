package pokemon.core.domain.model.attribute;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum Attribute {
    NORMAL(new NormalAttributeEffective()), // ノーマル
    FIRE(new FireAttributeEffective()), // ほのお
    WATER(new WaterAttributeEffective()), // みず
    GRASS(new GrassAttributeEffective()), // くさ
    ELECTRIC(new ElectricAttributeEffective()), // でんき
    ICE(new IceAttributeEffective()), // こおり
    FIGHTING(new FightingAttributeEffective()), // かくとう
    POISON(new PoisonAttributeEffective()), // どく
    GROUND(new GroundAttributeEffective()), // じめん
    FLYING(new FlyingAttributeEffective()), // ひこう
    PSYCHIC(new PsychicAttributeEffective()), // エスパー
    BUG(new BugAttributeEffective()), // むし
    ROCK(new RockAttributeEffective()), // いわ
    GHOST(new GhostAttributeEffective()), // ゴースト
    DRAGON(new DragonAttributeEffective()), // ドラゴン
    DARK(new DarkAttributeEffective()), // あく
    STEEL(new SteelAttributeEffective()), // はがね
    FAIRY(new FairyAttributeEffective()), // フェアリー
    ;

    private AttributeEffective attributeEffective;

    /**
     * 相性を取得する
     *
     * @param opponent 相手の属性
     * @return 相性
     */
    public Effectiveness getEffectiveness(Attribute opponent) {
        return Arrays.stream(Effectiveness.values())
                .filter(e -> e.getGetAttributeFunction()
                        .apply(attributeEffective).contains(opponent))
                .findFirst()
                .orElseThrow();
    }
}
