package boles.binarios.y.números.primos.umg;

import java.util.HashSet;
import java.util.Set;

public class GeneradorPrimos {
    private int cantidad; // Cantidad de números primos a generar
    private int rango;    // Rango máximo para los números aleatorios
    private int[] primos; // Array de números primos generados

    // Constructor
    public GeneradorPrimos(int cantidad, int rango) {
        this.cantidad = cantidad;
        this.rango = rango;
    }

    // Método para generar números primos sin repeticiones
    public int[] generarPrimos() {
        Set<Integer> primosSet = new HashSet<>(); 
        int numero = 2; 

        while (primosSet.size() < cantidad && numero <= rango) {
            if (esPrimo(numero)) {
                primosSet.add(numero); // El Set no permite duplicados
            }
            numero++;
        }

        // Convertir el Set a un array
        primos = new int[primosSet.size()];
        int index = 0;
        for (int primo : primosSet) {
            primos[index++] = primo;
        }

        // Mensaje de finalización
        System.out.println("Ya terminé de crear los números primos.");

        return primos;
    }

    // Método para verificar si un número es primo
    private boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para imprimir en consola cuántos números primos se generaron
    public void imprimirCantidadPrimos() {
        if (primos == null) {
            System.out.println("No se han generado números primos aún.");
        } else {
            System.out.println("Se generaron " + primos.length + " números primos.");
        }
    }

    // Método para obtener el arreglo de números primos
    public int[] obtenerPrimos() {
        return primos;
    }
}