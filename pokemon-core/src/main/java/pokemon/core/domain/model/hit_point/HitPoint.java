package pokemon.core.domain.model.hit_point;

import lombok.Value;
import pokemon.core.domain.model.damage.Damage;
import pokemon.core.domain.model.recovery.Recovery;

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


    public HitPoint removedBy(Damage damage) {
        var removedValue = this.value - damage.getValue();
        if (removedValue < 0) {
            return HitPoint.valueOf(0);
        }
        return HitPoint.valueOf(removedValue);
    }

    public HitPoint recoveredBy(Recovery recovery) {
        var recoveredValue = this.value + recovery.getValue();
        return HitPoint.valueOf(recoveredValue);
    }

    public HitPoint compareWithGetMin(HitPoint hitPoint) {
        return HitPoint.valueOf(Math.min(this.value, hitPoint.getValue()));
    }
}
