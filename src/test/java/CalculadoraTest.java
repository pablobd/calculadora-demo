import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void suma() {
        assertEquals(calculadora.suma(3, 6), 9);
    }

    @Test
    void resta(){
        assertEquals(calculadora.resta(10, 4), 6);
    }
}
