package TestNested

import Numeros
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class TestNested {

    @Nested
    @DisplayName("")
    class grupo1{
        @Test
        @DisplayName ("Grupo 1 - test 1")
        internal fun test1() {
            val numero = Numeros (5,5)
            assertTrue(numero.suma()>8,"No es mayor que 20")
            println("Grupo 1 - test 1")
        }

        @Test
        @DisplayName ("Grupo 1 - test 2")
        internal fun test2() {
            val numero = Numeros (5,5)
            assertTrue(numero.suma()>8,"No es mayor que 20")
            println("Grupo 1 - test 2")
        }
    }
    @Nested
    @DisplayName("")
    class grupo2{
        @Test
        @DisplayName ("Grupo 2 - test 1")
        internal fun test1() {
            val numero = Numeros (5,5)
            assertTrue(numero.suma()>8,"No es mayor que 20")
            println("Grupo 2 - test 1")
        }

        @Test
        @DisplayName ("Grupo 2 - test 2")
        internal fun test2() {
            val numero = Numeros (5,5)
            assertTrue(numero.suma()>8,"No es mayor que 20")
            println("Grupo 2 - test 2")
        }
    }
}