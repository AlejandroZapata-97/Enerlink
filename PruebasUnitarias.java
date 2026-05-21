package co.edu.asys.mi_primer_servidor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static co.edu.asys.mi_primer_servidor.entidades.MetodosEstaticos.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;


public class TestMetodosEstatico {
    
    // ===== SUMA RANGO =====
    @Test
    public void testSumaRangoDelUnoAlCinco() {
        // DATOS
        int inicio = 1;
        int fin = 5;
        
        // EJECUTAR
        int resultado = sumarRango(inicio, fin);
        
        // VALIDAR
        assertEquals(15, resultado);
    }
    
    @Test
    public void testSumaRangoFinMayorQueInicio() {
        // DATOS
        int inicio = 10;
        int fin = 5;
        
        // EJECUTAR
        int resultado = sumarRango(inicio, fin);
        
        // VALIDAR
        assertEquals(0, resultado);
    }
    
    @Test
    public void testSumaRangoUnSoloNumero() {
        // DATOS
        int inicio = 5;
        int fin = 5;
        
        // EJECUTAR
        int resultado = sumarRango(inicio, fin);
        
        // VALIDAR
        assertEquals(5, resultado);
    }
    
    // ===== CONTAR VOCALES =====
    @Test
    public void testContarVocalesEnHola() {
        // DATOS
        String cadena = "hola";
        
        // EJECUTAR
        int resultado = contarVocales(cadena);
        
        // VALIDAR
        assertEquals(2, resultado);
    }

    @Test
    public void testContarVocalesSinVocales() {
        // DATOS
        String cadena = "xyz";
        
        // EJECUTAR
        int resultado = contarVocales(cadena);
        
        // VALIDAR
        assertEquals(0, resultado);
    }

    @Test
    public void testContarVocalesVacio() {
        // DATOS
        String cadena = "";

        // EJECUTAR
        int resultado = contarVocales(cadena);

        // VALIDAR
        assertEquals(0, resultado);
    }
    
    // ===== NUMERO MAYOR =====
    @Test
    public void testNumeroMayorEnArreglo() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(8);
        numeros.add(2);
        numeros.add(10);
        numeros.add(5);
        
        // EJECUTAR
        int resultado = numeroMayor(numeros);
        
        // VALIDAR
        assertEquals(10, resultado);
    }

    @Test
    public void testNumeroMayorVacio() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.isEmpty();

        // VALIDAR
        assertThrows(IndexOutOfBoundsException.class, () -> numeroMayor(numeros));
    }
    
    @Test
    public void testNumeroDosIguales() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(5);

        // EJECUTAR
        int resultado = numeroMayor(numeros);
        
        // VALIDAR
        assertEquals(5, resultado);
    }
    
    // ===== FACTORIAL =====
    @Test
    public void testFactorialDeDos() {
        // DATOS
        int numero = 2;
        
        // EJECUTAR
        int resultado = factorial(numero);
        
        // VALIDAR
        assertEquals(2, resultado);
    }
    
    @Test
    public void testFactorialNegativo() {
        // DATOS
        int numero = -5;

        // EJECUTAR Y VALIDAR
        assertThrows(IllegalArgumentException.class, () -> factorial(numero));
    }
    
    @Test
    public void testFactorialDeCero() {
        // DATOS
        int numero = 0;
        
        // EJECUTAR
        int resultado = factorial(numero);
        
        // VALIDAR
        assertEquals(1, resultado);
    }
    
    // ===== CONTAR PARES =====
    @Test
    public void testContarParesMezclados() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        
        // EJECUTAR
        int resultado = contarPares(numeros);
        
        // VALIDAR
        assertEquals(2, resultado);
    }
    
    @Test
    public void testContarParesSinPares() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(7);
        numeros.add(9);
        numeros.add(11);
        
        // EJECUTAR
        int resultado = contarPares(numeros);
        
        // VALIDAR
        assertEquals(0, resultado);
    }

    @Test
    public void testContarParesVacio() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.isEmpty();

        // EJECUTAR
        int resultado = contarPares(numeros);

        // VALIDAR
        assertEquals(0, resultado);
    }


    // ===== INVERTIR CADENA =====
    @Test
    public void testInvertirCadenaJava() {
        // DATOS
        String cadena = "java";

        // EJECUTAR
        String resultado = invertirCadena(cadena);

        // VALIDAR
        assertEquals("avaj", resultado);
    }
    
    @Test
    public void testInvertirCadenaDeUnaLetra() {
        // DATOS
        String cadena = "h";
        
        // EJECUTAR
        String resultado = invertirCadena(cadena);
        
        // VALIDAR
        assertEquals("h", resultado);
    }

    @Test
    public void testInvertirCadenaVacia() {
        // DATOS
        String cadena = "";

        // EJECUTAR
        String resultado = invertirCadena(cadena);

        // VALIDAR
        assertEquals("", resultado);
    }
    
    // ===== PROMEDIO =====
    @Test
    public void testPromedioDeTresNumeros() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        // EJECUTAR
        double resultado = promedioArreglo(numeros);
        
        // VALIDAR
        assertEquals(20, resultado);
    }
    
    @Test
    public void testPromedioDeNumerosIguales() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(5);
        
        // EJECUTAR
        double resultado = promedioArreglo(numeros);
        
        // VALIDAR
        assertEquals(5, resultado);
    }

    @Test
    public void testPromedioDeNumerosNegativos() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(-5);
        numeros.add(-5);

        // EJECUTAR
        double resultado = promedioArreglo(numeros);

        // VALIDAR
        assertEquals(-5, resultado);
    }

    @Test
    public void testPromedioDeNumerosVacios() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.isEmpty();

        // EJECUTAR
        double resultado = promedioArreglo(numeros);

        // VALIDAR
        assertEquals(Double.NaN, resultado); //NaN - Not a Number, no existe numero
    }
    
    // ===== CONTAR MAYORES QUE =====
    @Test
    public void testContarMayoresQue() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(8);
        numeros.add(10);
        int limite = 6;
        
        // EJECUTAR
        int resultado = contarMayoresQue(numeros, limite);
        
        // VALIDAR
        assertEquals(2, resultado);
    }
    
    @Test
    public void testContarMayoresQueSinCoincidencias() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        int limite = 5;
        
        // EJECUTAR
        int resultado = contarMayoresQue(numeros, limite);
        
        // VALIDAR
        assertEquals(0, resultado);
    }

    @Test
    public void testContarMayoresVacios() {
        // DATOS
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.isEmpty();
        int limite = 5;

        // EJECUTAR
        int resultado = contarMayoresQue(numeros , 5);

        // VALIDAR
        assertEquals(0, resultado);
    }
    
    // ===== ES PRIMO =====
    @Test
    public void testEsPrimoDos() {
        // DATOS
        int numero = 2;
        
        // EJECUTAR
        boolean resultado = esPrimo(numero);
        
        // VALIDAR
        assertEquals(true, resultado);
    }
    
    @Test
    public void testEsPrimoMenoresOIgualesAUno() {
        // DATOS
        int numero = 1;
        
        // EJECUTAR
        boolean resultado = esPrimo(numero);
        
        // VALIDAR
        assertEquals(false, resultado);
    }
    
    @Test
    public void testEsPrimoTieneDivisores() {
        // DATOS
        int numero = 6;
        
        // EJECUTAR
        boolean resultado = esPrimo(numero);
        
        // VALIDAR
        assertEquals(false, resultado);
    }
    
    // ===== SUMA DIGITOS =====
    @Test
    public void testSumaDigitos123() {
        // DATOS
        int numero = 123;
        
        // EJECUTAR
        int resultado = sumaDigitos(numero);
        
        // VALIDAR
        assertEquals(6, resultado);
    }

    @Test
    public void testUnSoloNumero() {
        // DATOS
        int numero = 6;

        // EJECUTAR
        int resultado = sumaDigitos(numero);

        // VALIDAR
        assertEquals(6, resultado);
    }

    @Test
    public void testDigitosVacio() {
        // DATOS
        int numero = 0;

        // EJECUTAR
        int resultado = sumaDigitos(numero);

        // VALIDAR
        assertEquals(0, resultado);
    }
    
    @Test
    public void testDigitosNegativos() {
        // DATOS
        int numero = -500;
        
        // EJECUTAR Y VALIDAR
        assertThrows(IllegalArgumentException.class, () -> sumaDigitos(numero));
    }
}
