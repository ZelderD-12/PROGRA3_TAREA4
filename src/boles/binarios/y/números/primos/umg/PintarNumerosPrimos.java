package boles.binarios.y.números.primos.umg;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PintarNumerosPrimos implements Runnable {
    private JPanel panel; // JPanel para mostrar los números primos
    private int[] primos; // Array de números primos generados
    private Random random; // Para generar valores aleatorios

    // Constructor
    public PintarNumerosPrimos(JPanel panel, int[] primos) {
        this.panel = panel;
        this.primos = primos;
        this.random = new Random();
    }

    @Override
    public void run() {
        for (int primo : primos) {
            // Limpiar el panel antes de mostrar el siguiente número
            panel.removeAll();
            panel.setLayout(new GridLayout(0, 1)); // Usar un layout vertical

            // Crear una etiqueta con el número primo actual
            JLabel label = new JLabel(String.valueOf(primo), SwingConstants.CENTER);

            // Configurar color de letra aleatorio
            Color colorAleatorio = generarColorAleatorio();
            label.setForeground(colorAleatorio);

            // Configurar tamaño de letra aleatorio
            int tamanoLetra = generarTamanoLetraAleatorio();
            Font fuenteAleatoria = generarFuenteCompatible(tamanoLetra);
            label.setFont(fuenteAleatoria);

            // Agregar la etiqueta al panel
            panel.add(label);

            // Revalidar y repintar el panel
            panel.revalidate();
            panel.repaint();

            // Pausa para mostrar el número durante un tiempo
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para generar un color aleatorio
    private Color generarColorAleatorio() {
        int r = random.nextInt(256); // Componente rojo (0-255)
        int g = random.nextInt(256); // Componente verde (0-255)
        int b = random.nextInt(256); // Componente azul (0-255)
        return new Color(r, g, b);
    }

    // Método para generar un tamaño de letra aleatorio
    private int generarTamanoLetraAleatorio() {
        return random.nextInt(41) + 20; // Tamaño entre 20 y 60
    }

    // Método para generar un tipo de letra compatible
    private Font generarFuenteCompatible(int tamanoLetra) {
        // Lista de fuentes comunes que soportan caracteres numéricos
        String[] fuentesCompatibles = {
            "Arial", "Times New Roman", "Courier New", "Verdana", "Tahoma", "Georgia", "Helvetica"
        };

        // Seleccionar una fuente aleatoria de la lista
        String fuenteAleatoria = fuentesCompatibles[random.nextInt(fuentesCompatibles.length)];
        return new Font(fuenteAleatoria, Font.PLAIN, tamanoLetra);
    }
}