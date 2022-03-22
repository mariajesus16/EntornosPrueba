package Aserciones

import Numeros
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DisplayNameTest {
    @Test
    @DisplayName("Ver si la multiplicación de dos números es correcta o no")
    internal fun test1() {
        val numero = Numeros(5, 5)
        assertTrue(numero.multiplicar()==25,"No es el mismo resultado")
    }

    @Test
    @DisplayName("Ver si la multiplicación de dos números es correcta o no")
    internal fun test2() {
        val numero = Numeros(5, 5)
        assertEquals(numero.suma(),10,"La suma no es 10")
    }
}