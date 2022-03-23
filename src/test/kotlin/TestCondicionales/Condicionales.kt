package TestCondicionales

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.EnabledForJreRange
import org.junit.jupiter.api.condition.EnabledOnJre
import org.junit.jupiter.api.condition.EnabledOnOs
import org.junit.jupiter.api.condition.JRE
import org.junit.jupiter.api.condition.OS

class Condicionales {

    @Test
    @EnabledOnOs (OS.LINUX, OS.WINDOWS)
    internal fun test1() {
        println("Estamos en un SO Windows")
    }

    @Test
    @EnabledOnJre (JRE.JAVA_8)
    internal fun test2() {
        println("Java version 8")
    }

    @Test
    @EnabledForJreRange (min = JRE.JAVA_8, max = JRE.JAVA_15)
    internal fun test3() {
        println("Java version entre 8 y 15")
    }
}