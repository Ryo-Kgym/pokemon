package pokemon.core.domain.model.recovery;

import lombok.Value;

@Value
public class Recovery {
    private long value;

    public static Recovery valueOf(long value) {
        assert value >= 0;
        return new Recovery(value);
    }
}
