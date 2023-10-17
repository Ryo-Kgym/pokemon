package pokemon.core.domain.model.attribute;

import java.util.List;

public interface EffectiveAttributes {

    List<Attribute> getTarget(Attribute attribute);
}
