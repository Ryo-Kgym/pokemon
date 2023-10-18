package pokemon.core.domain.model.recovery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RecoveryTest {

    @Test
    void valueOfError() {
        assertThrows(AssertionError.class, () -> Recovery.valueOf(-1));
    }
}