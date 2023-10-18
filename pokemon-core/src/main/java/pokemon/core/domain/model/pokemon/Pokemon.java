package pokemon.core.domain.model.pokemon;

import lombok.Builder;
import lombok.Value;
import pokemon.core.domain.model.damage.Damage;
import pokemon.core.domain.model.hit_point.HitPoint;
import pokemon.core.domain.model.recovery.Recovery;

@Builder
@Value
public class Pokemon {
    private long serializedId;
    private String name;
    private HitPoint hitPoint;
    private HitPoint maxHitPoint;

    public boolean isDying() {
        return this.hitPoint.isDying();
    }

    public Pokemon damagedBy(Damage damage) {
        var removedHitPoint = this.hitPoint.removedBy(damage);
        return Pokemon.builder()
                .serializedId(this.serializedId)
                .name(this.name)
                .hitPoint(removedHitPoint)
                .maxHitPoint(this.maxHitPoint)
                .build();
    }

    public Pokemon recoveredBy(Recovery recovery) {
        var recoveredHitPoint = this.maxHitPoint.compareWithGetMin(this.hitPoint.recoveredBy(recovery));

        return Pokemon.builder()
                .serializedId(this.serializedId)
                .name(this.name)
                .hitPoint(recoveredHitPoint)
                .maxHitPoint(this.maxHitPoint)
                .build();
    }
}
