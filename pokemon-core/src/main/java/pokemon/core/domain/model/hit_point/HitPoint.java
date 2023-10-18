package pokemon.core.domain.model.hit_point;

import lombok.Value;

@Value
public class HitPoint {
    private long value;

    public static HitPoint valueOf(long value) {
        assert value >= 0;
        return new HitPoint(value);
    }

    public boolean isDying() {
        return this.value == 0;
    }
}
