/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteModeloTest {

    @Test
    public void testGetGrado() {
        EstudianteModelo estudiante = new EstudianteModelo(
                "Samuel", "Cali", "3053547114", "03/06/2006", "once"
        );

        assertEquals("once", estudiante.getGrado());
    }

    @Test
    public void testSetGrado() {
        EstudianteModelo estudiante = new EstudianteModelo();
        estudiante.setGrado("decimo");

        assertEquals("decimo", estudiante.getGrado());
    }

    @Test
    public void testToString() {
        EstudianteModelo estudiante = new EstudianteModelo(
                "Nelson", "Cali", "3053547114", "03/07/2006", "octavo"
        );

        String resultado = estudiante.toString();
        System.out.println(resultado);
        assertTrue(resultado.contains("Nelson"));
        assertTrue(resultado.contains("Cali"));
        assertTrue(resultado.contains("3053547114"));
        assertTrue(resultado.contains("03/07/2006"));
        assertTrue(resultado.contains("octavo"));
    }
}