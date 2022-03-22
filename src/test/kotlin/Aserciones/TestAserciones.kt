package Aserciones

import Numeros
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Test
import kotlin.test.*

class TestAserciones {
    @Test
    internal fun testAserciones1() {
        val numero = Numeros(5, 5)

        assertAll(
            "Test de aserciones generales",
            { assertEquals(numero.suma(), 12, "La suma no es correcta, es 10") },
            { assertNotEquals(numero.suma(), 11, "La suma es correcta") },
            { assertNotNull(numero.suma(), "Es no nulo") },
            { assertNull(numero.suma(), "Es nulo") },
            { assertTrue(numero.suma() > 5, "No es verdad") },
            { assertTrue(numero.suma() > 20, "No es mayor que 20") },
            { assertNotSame(numero.suma(), 11, "Es el mismo número") },
            { assertSame(numero.suma(), 11, "No es el mismo") },
            { assertEquals(numero.suma(), 12, "A ver si es igual en float") }
        )

    }
}