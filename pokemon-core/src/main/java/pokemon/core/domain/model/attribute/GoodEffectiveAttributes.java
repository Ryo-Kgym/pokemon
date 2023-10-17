package pokemon.core.domain.model.attribute;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class GoodEffectiveAttributes {

    public static List<Attribute> getGoodEffectiveAttributes(Attribute attribute) {
        return GOOD_EFFECTIVE_ATTRIBUTES_MAP.getOrDefault(attribute, List.of());
    }

    private static final Map<Attribute, List<Attribute>> GOOD_EFFECTIVE_ATTRIBUTES_MAP =
            Collections.unmodifiableMap(new EnumMap(Attribute.class) {{
                put(Attribute.NORMAL, List.of());
                put(Attribute.FIRE, List.of(Attribute.GRASS, Attribute.ICE, Attribute.BUG, Attribute.STEEL));
                put(Attribute.WATER, List.of(Attribute.FIRE, Attribute.GROUND, Attribute.ROCK));
                put(Attribute.GRASS, List.of(Attribute.WATER, Attribute.GROUND, Attribute.ROCK));
                put(Attribute.ELECTRIC, List.of(Attribute.WATER, Attribute.FLYING));
                put(Attribute.ICE, List.of(Attribute.GRASS, Attribute.GROUND, Attribute.FLYING, Attribute.DRAGON));
                put(Attribute.FIGHTING, List.of(Attribute.NORMAL, Attribute.ICE, Attribute.ROCK, Attribute.DARK, Attribute.STEEL));
                put(Attribute.POISON, List.of(Attribute.GRASS, Attribute.FAIRY));
                put(Attribute.GROUND, List.of(Attribute.FIRE, Attribute.ELECTRIC, Attribute.POISON, Attribute.ROCK, Attribute.STEEL));
                put(Attribute.FLYING, List.of(Attribute.GRASS, Attribute.FIGHTING, Attribute.BUG));
                put(Attribute.PSYCHIC, List.of(Attribute.FIGHTING, Attribute.POISON));
                put(Attribute.BUG, List.of(Attribute.GRASS, Attribute.PSYCHIC, Attribute.DARK));
                put(Attribute.ROCK, List.of(Attribute.FIRE, Attribute.ICE, Attribute.FLYING, Attribute.BUG));
                put(Attribute.GHOST, List.of(Attribute.PSYCHIC, Attribute.GHOST));
                put(Attribute.DRAGON, List.of(Attribute.DRAGON));
                put(Attribute.DARK, List.of(Attribute.PSYCHIC, Attribute.GHOST));
                put(Attribute.STEEL, List.of(Attribute.ICE, Attribute.ROCK, Attribute.FAIRY));
                put(Attribute.FAIRY, List.of(Attribute.FIGHTING, Attribute.DRAGON, Attribute.DARK));
            }});

}
