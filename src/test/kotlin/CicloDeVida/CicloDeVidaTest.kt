package CicloDeVida

import Numeros
import org.junit.jupiter.api.*
import org.junit.jupiter.api.MethodOrderer.*
import kotlin.test.assertTrue

@TestMethodOrder(OrderAnnotation::class)
class CicloDeVidaTest {
    val numeros = Numeros(5,5)

    @BeforeEach
    internal fun setUp() {
        println("Var por BeforeEach")
    }

    @AfterEach
    internal fun tearDown() {
        println("Va por AfterEach")
    }

    @Test
    @Order(1)
    @Disabled("Hasta que la tarea esté terminada")
    internal fun test1() {
        println("Va por Test1")
        val numero = Numeros(5, 5)

        assertTrue(numero.suma() > 20, "No es mayor que 20")
    }

    @Test
    @Order(2)
    internal fun test2() {
        println("Va por Test2")
        val numero = Numeros(5, 5)

        assertTrue(numero.suma() > 20, "No es mayor que 20")
    }

    @Test
    @Order(3)
    internal fun test3() {
        println("Va por Test3")
        val numero = Numeros(5, 5)

        assertTrue(numero.suma() > 20, "No es mayor que 20")
    }

    @Test
    @Order(4)
    internal fun test4() {
        println("Va por Test4")
        val numero = Numeros(5, 5)

        assertTrue(numero.suma() > 20, "No es mayor que 20")
    }
}