package pokemon.core.domain.model.damage;


import lombok.Value;

@Value
public class Damage {
    private long value;

    public static Damage valueOf(long value) {
        assert value >= 0;
        return new Damage(value);
    }
}
