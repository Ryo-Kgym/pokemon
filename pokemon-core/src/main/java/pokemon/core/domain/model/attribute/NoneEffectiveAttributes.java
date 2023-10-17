package pokemon.core.domain.model.attribute;

import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class NoneEffectiveAttributes implements EffectiveAttributes {

    @Override
    public List<Attribute> getTarget(Attribute attribute) {
        return NONE_EFFECTIVE_ATTRIBUTES_MAP.getOrDefault(attribute, List.of());
    }

    private static final Map<Attribute, List<Attribute>> NONE_EFFECTIVE_ATTRIBUTES_MAP =
            Collections.unmodifiableMap(new EnumMap(Attribute.class) {{
                put(Attribute.NORMAL, List.of(Attribute.GHOST));
                put(Attribute.FIRE, List.of(Attribute.FIRE, Attribute.WATER, Attribute.ROCK, Attribute.DRAGON));
                put(Attribute.WATER, List.of(Attribute.WATER, Attribute.GRASS, Attribute.DRAGON));
                put(Attribute.GRASS, List.of(Attribute.FIRE, Attribute.GRASS, Attribute.POISON, Attribute.FLYING, Attribute.BUG, Attribute.DRAGON, Attribute.STEEL));
                put(Attribute.ELECTRIC, List.of(Attribute.GROUND));
                put(Attribute.ICE, List.of(Attribute.FIRE, Attribute.WATER, Attribute.ICE, Attribute.STEEL));
                put(Attribute.FIGHTING, List.of(Attribute.GHOST));
                put(Attribute.POISON, List.of(Attribute.STEEL));
                put(Attribute.GROUND, List.of(Attribute.FLYING));
                put(Attribute.FLYING, List.of(Attribute.ELECTRIC, Attribute.ROCK, Attribute.STEEL));
                put(Attribute.PSYCHIC, List.of(Attribute.DARK));
                put(Attribute.BUG, List.of(Attribute.FIRE, Attribute.FIGHTING, Attribute.POISON, Attribute.FLYING, Attribute.GHOST, Attribute.STEEL));
                put(Attribute.ROCK, List.of(Attribute.FIGHTING, Attribute.GROUND, Attribute.STEEL));
                put(Attribute.GHOST, List.of(Attribute.NORMAL));
                put(Attribute.DRAGON, List.of(Attribute.FAIRY));
                put(Attribute.DARK, List.of(Attribute.PSYCHIC, Attribute.DARK));
                put(Attribute.STEEL, List.of(Attribute.FIRE, Attribute.WATER, Attribute.ELECTRIC, Attribute.STEEL));
                put(Attribute.FAIRY, List.of(Attribute.FIRE, Attribute.POISON, Attribute.STEEL));
            }});

}
