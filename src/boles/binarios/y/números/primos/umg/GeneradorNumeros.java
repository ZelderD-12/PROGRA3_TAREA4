package boles.binarios.y.números.primos.umg;

import Modelos.ModeloPrimos;
import arbol.SimuladorArbolBinario;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GeneradorNumeros extends Thread {

    final ModeloPrimos modelo;
    private int cantidadaciertos = 0;
    final JLabel texto;
    final SimuladorArbolBinario simulador;
    final Random r = new Random();
    final JScrollPane spane;
    final JPanel pane;
    private Integer numeroEspecifico = null; // Número específico a insertar primero

    public GeneradorNumeros(ModeloPrimos modelo, JLabel texto, JScrollPane spane, JPanel pane) {
        simulador = new SimuladorArbolBinario();
        this.modelo = modelo;
        this.texto = texto;
        this.pane = pane;
        this.spane = spane;
    }

    // Método para insertar un número específico primero
    public void insertarPrimero(int numero) {
        this.numeroEspecifico = numero;
    }

    // Método para insertar un número en el árbol
    public void insertar(int numero) {
        if (numeroEspecifico != null) {
            // Si hay un número específico, insertarlo primero
            simulador.insertarPrimero(numeroEspecifico, numero);
            numeroEspecifico = null; // Reiniciar la variable después de usarla
        } else {
            // Si no hay un número específico, insertar el número normal
            simulador.insertar(numero);
        }

        // Actualizar la vista del árbol
        simulador.getDibujo(this.spane, this.pane);
    }

    // Método para eliminar un número del árbol
    public void eliminar(int numero) {
        simulador.eliminar(numero);

        // Actualizar la vista del árbol
        simulador.getDibujo(this.spane, this.pane);
    }

    // Método para buscar un número en el árbol
    public boolean buscar(int numero) {
        return simulador.buscarNumero(numero);
    }

    // Método para realizar el recorrido PreOrden
    public String obtenerRecorridoPreorden() {
        // PreOrden
        long startTime = System.currentTimeMillis(); // Marca el tiempo de inicio

        // Ejecutamos el recorrido preorden y lo mostramos
        String recorridoPreorden = simulador.preOrden(); // Llamamos al método preOrden
        System.out.println(recorridoPreorden); // Muestra el recorrido en consola

        long endTime = System.currentTimeMillis(); // Marca el tiempo de finalización

        // Calculamos el tiempo transcurrido
        long duration = endTime - startTime;

        // Convertimos el tiempo en minutos, segundos y milisegundos
        long minutes = (duration / 1000) / 60;
        long seconds = (duration / 1000) % 60;
        long milliseconds = duration % 1000;

        // Mostramos el tiempo transcurrido
        System.out.println("Tiempo de ejecución del preorden: " + minutes + " minutos " + seconds + " segundos " + milliseconds + " milisegundos.\t");

        return recorridoPreorden + "\n\nTiempo de ejecución: " + minutes + " minutos " + seconds + " segundos " + milliseconds + " milisegundos.";
    }
    
    // Método para realizar el recorrido InOrden
    public String obtenerRecorridoInorden() {
        // InOrden
        long startTime = System.currentTimeMillis(); // Marca el tiempo de inicio

        // Ejecutamos el recorrido inorden y lo mostramos
        String recorridoInorden = simulador.inOrden(); // Llamamos al método inOrden
        System.out.println(recorridoInorden); // Muestra el recorrido en consola

        long endTime = System.currentTimeMillis(); // Marca el tiempo de finalización

        // Calculamos el tiempo transcurrido
        long duration = endTime - startTime;

        // Convertimos el tiempo en minutos, segundos y milisegundos
        long minutes = (duration / 1000) / 60;
        long seconds = (duration / 1000) % 60;
        long milliseconds = duration % 1000;

        // Mostramos el tiempo transcurrido
        System.out.println("Tiempo de ejecución del inorden: " + minutes + " minutos " + seconds + " segundos " + milliseconds + " milisegundos.\t");

        return recorridoInorden + "\n\nTiempo de ejecución: " + minutes + " minutos " + seconds + " segundos " + milliseconds + " milisegundos.";
    }
    
    // Método para realizar el recorrido PostOrden
    public String obtenerRecorridoPostorden() {
        // PostOrden
        long startTime = System.currentTimeMillis(); // Marca el tiempo de inicio

        // Ejecutamos el recorrido postorden y lo mostramos
        String recorridoPostorden = simulador.postOrden(); // Llamamos al método postOrden
        System.out.println(recorridoPostorden); // Muestra el recorrido en consola

        long endTime = System.currentTimeMillis(); // Marca el tiempo de finalización

        // Calculamos el tiempo transcurrido
        long duration = endTime - startTime;

        // Convertimos el tiempo en minutos, segundos y milisegundos
        long minutes = (duration / 1000) / 60;
        long seconds = (duration / 1000) % 60;
        long milliseconds = duration % 1000;

        // Mostramos el tiempo transcurrido
        System.out.println("Tiempo de ejecución del preorden: " + minutes + " minutos " + seconds + " segundos " + milliseconds + " milisegundos.\t");

        return recorridoPostorden + "\n\nTiempo de ejecución: " + minutes + " minutos " + seconds + " segundos " + milliseconds + " milisegundos.";
    }

    @Override
    public void run() {
        try {
            // Variables para cambiar fuentes
            Font[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
            int indiceFuente;
            int tamanioFuente;

            // Bucle principal para generar números primos
            while (!Thread.interrupted() && (modelo.gettamaniolistaprimos() < modelo.getnumerolimite())) {
                Thread.sleep(400); // Pausa para simular la generación

                // Cambiar la fuente del texto de forma aleatoria
                indiceFuente = r.nextInt(fuentes.length);
                tamanioFuente = (int) Math.round(Math.random() * (90 - 20 + 1) + 20);
                Font fuente = new Font(fuentes[indiceFuente].getFontName(), Font.PLAIN, tamanioFuente);
                this.texto.setFont(fuente);

                // Mostrar el número evaluado
                this.texto.setText("" + modelo.getnumeroevaluando());

                // Cambiar el color del texto de forma aleatoria
                Color c = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256), r.nextInt(256));
                this.texto.setForeground(c);

                // Verificar si el hilo ha sido interrumpido
                if (Thread.interrupted()) {
                    break;
                }

                // Verificar si el número actual es primo
                for (int contadorsecundario = 1; contadorsecundario <= modelo.getnumeroevaluando(); contadorsecundario++) {
                    int residuo = modelo.getnumeroevaluando() % contadorsecundario;
                    if (residuo == 0) {
                        cantidadaciertos++;
                    }

                    // Si tiene más de 2 divisores, no es primo
                    if (cantidadaciertos >= 3) {
                        break;
                    }
                }

                // Si el número es primo
                if (cantidadaciertos == 2) {
                    modelo.setnumeroprimo(modelo.getnumeroevaluando());

                    // Insertar el número primo usando el método insertar
                    insertar(modelo.getnumeroevaluando());
                }

                cantidadaciertos = 0; // Reiniciar el contador de divisores
                modelo.setnumeroevaluando(modelo.getnumeroevaluando() + 1); // Pasar al siguiente número
            }

            cantidadaciertos = 0; // Reiniciar el contador al finalizar

        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo: " + ex); // Manejar excepciones
        }
    }
}
