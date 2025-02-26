package boles.binarios.y.números.primos.umg;

import Modelos.ModeloPrimos;
import arbol.ArbolBB;
import arbol.ArbolExpresionGrafico;
import arbol.Nodo;
import arbol.SimuladorArbolBinario;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.JTextComponent;


public class Principal extends javax.swing.JFrame {
    private SimuladorArbolBinario simulador; // Instancia del simulador
    private GeneradorNumeros generadorprimoss; // Declarar como variable de clase
    private ModeloPrimos modelo;
    private Integer numeroEspecifico = null;
  


    public Principal() {
        initComponents();

        // Inicializar el simulador
        simulador = new SimuladorArbolBinario();
        
       /* // Crear el panel de dibujo del árbol y asignarlo al JScrollPane
        JPanel panelArbol = simulador.getDibujo(jScrollPane3, this.jPanel2);
       simulador.insertar(50);
        simulador.insertar(30);
        simulador.insertar(70);
        simulador.insertar(20);
        simulador.insertar(40);
        simulador.insertar(60);
        simulador.insertar(80);
        simulador.insertar(90);
        simulador.insertar(75);
        simulador.insertar(100);
        simulador.insertar(10);
        simulador.insertar(15);
        simulador.insertar(18);
        simulador.insertar(24);
        simulador.insertar(110);
        simulador.insertar(102);
        simulador.insertar(11);
        simulador.insertar(1);
        simulador.insertar(14);
        simulador.insertar(16);
        simulador.insertar(187);
        simulador.insertar(17);
        simulador.insertar(16);
        simulador.insertar(17);
        simulador.insertar(19);
     */
    }

public boolean haTerminado() {
    return modelo.gettamaniolistaprimos() >= modelo.getnumerolimite();
}
public void insertarNumeroPrimero(int numero) {
    if (haTerminado()) {
        // Si ya terminó la generación de primos, insertar el número de manera normal
        simulador.insertar(numero);
    } else {
        // Si aún está generando primos, insertar el número primero
        this.numeroEspecifico = numero;
    }
}
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelNumeros = new javax.swing.JPanel();
        lblnumeroevaluando = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtBusqueda = new javax.swing.JTextField();
        brtnBuscar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarImagen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Generador de Números Primos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("Generador de arbol binario de busqueda");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        panelNumeros.setBackground(new java.awt.Color(255, 255, 255));
        panelNumeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelNumerosLayout = new javax.swing.GroupLayout(panelNumeros);
        panelNumeros.setLayout(panelNumerosLayout);
        panelNumerosLayout.setHorizontalGroup(
            panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnumeroevaluando, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNumerosLayout.setVerticalGroup(
            panelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnumeroevaluando, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 250));
        jPanel1.add(txtNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, -1));

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 220, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 460, 90));

        txtBusqueda.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 110, 30));

        brtnBuscar.setText("Busqueda");
        brtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(brtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 140, 40));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 140, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 140, 40));

        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 140, 40));

        btnGuardarImagen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardarImagen.setText("Guardar Imagen");
        btnGuardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 220, 60));

        jButton1.setText("PreOrden");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 110, -1));

        jButton2.setText("PostOrden");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 110, -1));

        jButton3.setText("InOrden");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 110, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 380, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
         if (generadorprimoss != null) {
            if (!generadorprimoss.isAlive()) {
                try {
                    int numerosolicitado = Integer.parseInt(txtNumeros.getText().trim());
                    if (numerosolicitado <= 0) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Inicializar el modelo y el generador de números primos
                    modelo = new ModeloPrimos();
                    modelo.setnumerolimite(numerosolicitado);
                    modelo.setnumeroevaluando(1);

                    generadorprimoss = new GeneradorNumeros(modelo, lblnumeroevaluando, jScrollPane3, this.jPanel2, txtNumeros);
                    generadorprimoss.start();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe esperar a que la solicitud anterior haya concluido.", "Espera", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                int numerosolicitado = Integer.parseInt(txtNumeros.getText().trim());
                if (numerosolicitado <= 0) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Inicializar el modelo y el generador de números primos
                modelo = new ModeloPrimos();
                modelo.setnumerolimite(numerosolicitado);
                modelo.setnumeroevaluando(1);

                generadorprimoss = new GeneradorNumeros(modelo, lblnumeroevaluando, jScrollPane3, this.jPanel2, txtNumeros);
                generadorprimoss.start();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnGuardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarImagenActionPerformed
        if(lblnumeroevaluando.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Ningún número ha sido evaluado o esta siendo evaluado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
        // Crear un BufferedImage en el que se dibujará el JLabel
        BufferedImage image = new BufferedImage(panelNumeros.getWidth(), panelNumeros.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.createGraphics();
        
        // Renderizar el JLabel en la imagen
        panelNumeros.paint(g);
        g.dispose();
        
        // Guardar la imagen en un archivo (opcional)
        try {
            ImageIO.write(image, "PNG", new File("./imagen#"+lblnumeroevaluando.getText()+".png"));
            System.out.println("Imagen guardada como imagen#"+lblnumeroevaluando.getText()+".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnGuardarImagenActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
         if (generadorprimoss == null || !generadorprimoss.isAlive()) {
        JOptionPane.showMessageDialog(null, "Primero debe iniciar la generación de números primos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int numeroEspecifico = Integer.parseInt(txtBusqueda.getText().trim());
        generadorprimoss.insertarNumeroPrimero(numeroEspecifico); // Método para insertar el número primero
        txtBusqueda.setText(""); // Limpiar el campo de texto después de la inserción
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void brtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtnBuscarActionPerformed
     
    }//GEN-LAST:event_brtnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brtnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarImagen;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblnumeroevaluando;
    private javax.swing.JPanel panelNumeros;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}
