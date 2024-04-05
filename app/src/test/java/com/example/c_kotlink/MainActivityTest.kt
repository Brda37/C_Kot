package com.example.c_kotlink

import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityTest {

    @RelaxedMockK
    private lateinit var MainActivity: MainActivity

    @Before
    fun setup() {
        MockKAnnotations.init(this)
        MainActivity = MainActivity()
    }

    @Test
    fun sumar_test(){
        MainActivity.number1 = 20.0
        MainActivity.number2 = 10.0
        val result = MainActivity.sumar()
        assertEquals("Suma correcta", result, 30.0)
    }
    @Test
    fun restar_test(){
        MainActivity.number1 = 50.0
        MainActivity.number2 = 10.0

        val result = MainActivity.restar()

        assertEquals(result, 40.0)
    }
    @Test
    fun multiplicar_test(){
        MainActivity.number1 = 8.0
        MainActivity.number2 = 4.0

        val result = MainActivity.multiplicar()

        assertEquals(result, 32.0)
    }

    @Test
    fun dividir_test(){
        MainActivity.number1 = 100.0
        MainActivity.number2 = 2.0

        val result = MainActivity.dividir()

        assertEquals(result, 50.0)
    }
}
