package boles.binarios.y.números.primos.umg;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PanelAImagen {
    private JPanel panel; 

    // Constructor
    public PanelAImagen(JPanel panel) {
        this.panel = panel;
    }

    // Método para convertir el JPanel en una imagen y guardarla
    public void guardarComoImagen(String formato) {
        // Crear un nombre de archivo único usando un timestamp
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date());
        String nombreArchivo = "panel_" + timestamp;

        // Crear una BufferedImage con el tamaño del JPanel
        BufferedImage imagen = new BufferedImage(
            panel.getWidth(),
            panel.getHeight(),
            BufferedImage.TYPE_INT_ARGB
        );

        // Pintar el contenido del JPanel en la BufferedImage
        Graphics2D g2d = imagen.createGraphics();
        panel.paint(g2d);
        g2d.dispose();

        // Guardar la imagen en un archivo
        try {
            File archivo = new File(nombreArchivo + "." + formato);
            ImageIO.write(imagen, formato, archivo);
            System.out.println("Imagen guardada como: " + archivo.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error al guardar la imagen: " + e.getMessage());
        }
    }
}