package co.edu.asys.mi_primer_servidor.entidades;

import java.util.ArrayList;

public class MetodosEstaticos {// 1. Suma de números en un rango
    public static int sumarRango(int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // 2. Contar vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // 3. Número mayor en un arreglo
    public static int numeroMayor(ArrayList<Integer> arreglo) {
        int mayor = arreglo.get(0);
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i) > mayor) {
                mayor = arreglo.get(i);
            }
        }
        return mayor;
    }

    // 4. Factorial de un número
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // 5. Contar números pares en un arreglo
    public static int contarPares(ArrayList<Integer> arreglo) {
        int contador = 0;
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i) % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    // 6. Invertir una cadena
    public static String invertirCadena(String cadena) {
        String invertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida = invertida + cadena.charAt(i);
        }
        return invertida;
    }

    // 7. Promedio de un arreglo
    public static double promedioArreglo(ArrayList<Integer> arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.size(); i++) {
            suma = suma + arreglo.get(i);
        }
        double promedio = suma / arreglo.size();
        return promedio;
    }

    // 8. Contar números mayores que un valor
    public static int contarMayoresQue(ArrayList<Integer> arreglo, int limite) {
        int contador = 0;
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i) > limite) {
                contador++;
            }
        }
        return contador;
    }

    // 9. Verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 10. Suma de dígitos de un número
    public static int sumaDigitos(int numero) {
        int suma = 0;
        if (numero < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            suma = suma + ultimoDigito;
            numero = numero / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("--- Pruebas de los métodos ---");
        System.out.println("1. Suma de números en un rango (1, 5): " + sumarRango(1, 5));
        System.out.println("2. Contar vocales en una cadena ('programacion'): " + contarVocales("programacion"));

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(3); arr1.add(8); arr1.add(2); arr1.add(10); arr1.add(5);
        System.out.println("3. Número mayor en un arreglo [3, 8, 2, 10, 5]: " + numeroMayor(arr1));

        System.out.println("4. Factorial de un número (5): " + factorial(5));

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1); arr2.add(2); arr2.add(3); arr2.add(4); arr2.add(6);
        System.out.println("5. Contar números pares en un arreglo [1, 2, 3, 4, 6]: " + contarPares(arr2));

        System.out.println("6. Invertir una cadena ('java'): " + invertirCadena("java"));

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(5); arr3.add(5); arr3.add(10);
        System.out.println("7. Promedio de un arreglo [5, 5, 10]: " + promedioArreglo(arr3));

        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(1); arr4.add(5); arr4.add(8); arr4.add(10);
        System.out.println("8. Contar números mayores que un valor ([1, 5, 8, 10], 6): " + contarMayoresQue(arr4, 6));

        System.out.println("9. Verificar si un número es primo (7): " + esPrimo(7));
        System.out.println("10. Suma de dígitos de un número (509): " + sumaDigitos(509));
    }
}
