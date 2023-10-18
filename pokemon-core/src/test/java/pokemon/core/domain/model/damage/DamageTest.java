package pokemon.core.domain.model.damage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DamageTest {

    @Test
    void valueOfError() {
        assertThrows(AssertionError.class, () -> Damage.valueOf(-1));
    }
}