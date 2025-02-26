package boles.binarios.y.números.primos.umg;

import Modelos.ModeloPrimos;
import arbol.SimuladorArbolBinario;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {
    private SimuladorArbolBinario simulador; // Instancia del simulador
    ModeloPrimos modelo = new ModeloPrimos();;
    GeneradorNumeros generadorprimoss;


    public Principal() {
        initComponents();
        simulador = new SimuladorArbolBinario();
        btnstart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGuardarImagen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        brtnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnInsertar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnpreorden.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnpostorden.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnstop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btninorder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
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
        btnstart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtBusqueda = new javax.swing.JTextField();
        brtnBuscar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarImagen = new javax.swing.JButton();
        btnpreorden = new javax.swing.JButton();
        btnpostorden = new javax.swing.JButton();
        btninorder = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        btnstop = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de Números Primos");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Numeros Evaluados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setText("Árbol Binario de Búsqueda");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

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

        txtNumeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumerosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, -1));

        btnstart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnstart.setText("Start!");
        btnstart.setEnabled(false);
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });
        jPanel1.add(btnstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 220, 50));

        jTextArea1.setEditable(false);
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
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 110, 30));

        brtnBuscar.setText("Busqueda");
        brtnBuscar.setEnabled(false);
        brtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(brtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 140, 40));

        btnInsertar.setText("Insertar");
        btnInsertar.setEnabled(false);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 140, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
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
        btnGuardarImagen.setEnabled(false);
        btnGuardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 220, 60));

        btnpreorden.setText("PreOrden");
        btnpreorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreordenActionPerformed(evt);
            }
        });
        jPanel1.add(btnpreorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 110, -1));

        btnpostorden.setText("PostOrden");
        btnpostorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostordenActionPerformed(evt);
            }
        });
        jPanel1.add(btnpostorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 110, -1));

        btninorder.setText("InOrder");
        btninorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninorderActionPerformed(evt);
            }
        });
        jPanel1.add(btninorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 110, -1));

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

        btnstop.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnstop.setText("Stop!");
        btnstop.setEnabled(false);
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });
        jPanel1.add(btnstop, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 220, 50));

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
      if(modelo.getnoexistelista()){
           JOptionPane.showMessageDialog(null, "No existe un árbol para evaluar.", "ERROR", JOptionPane.ERROR_MESSAGE);
       }else{
           
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        
        if(generadorprimoss != null){
        if(!generadorprimoss.isAlive()){
        int numerosolicitado = Integer.parseInt(txtNumeros.getText());
       modelo = new ModeloPrimos();
       modelo.setnumerolimite(numerosolicitado);
       modelo.setnumeroevaluando(1);
       generadorprimoss = new GeneradorNumeros(modelo, lblnumeroevaluando, jScrollPane3, this.jPanel2);
        generadorprimoss.start();
        }else{
            JOptionPane.showMessageDialog(null, "Tienes que esperar hasta que la solicitud anterior haya concluido.", "Espera", JOptionPane.ERROR_MESSAGE);
        }
        }else{
          int numerosolicitado = Integer.parseInt(txtNumeros.getText());
       modelo = new ModeloPrimos();
       modelo.setnumerolimite(numerosolicitado);
       modelo.setnumeroevaluando(1);
       generadorprimoss = new GeneradorNumeros(modelo, lblnumeroevaluando, jScrollPane3, this.jPanel2);
        generadorprimoss.start();  
        } 
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnGuardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarImagenActionPerformed
        if(lblnumeroevaluando.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Ningún número ha sido evaluado o esta siendo evaluado.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        // Verificar si el campo de texto está vacío
    if (txtBusqueda.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número en el campo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Obtener el número desde el campo de texto
        int numero = Integer.parseInt(txtBusqueda.getText().trim());

        // Verificar si el hilo está activo
        if (generadorprimoss != null && generadorprimoss.isAlive()) {
            // Si el hilo está activo, insertar el número primero
            generadorprimoss.insertarPrimero(numero);
        } else {
            // Si el hilo no está activo, insertar el número normalmente
            generadorprimoss.insertar(numero);
        }

        // Limpiar el campo de texto después de la inserción
        txtBusqueda.setText("");
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido en el campo.", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void brtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brtnBuscarActionPerformed
    if(modelo.getnoexistelista()){
           JOptionPane.showMessageDialog(null, "No existe un árbol para evaluar.", "ERROR", JOptionPane.ERROR_MESSAGE);
       }else{
           simulador.buscar(Integer.parseInt(txtBusqueda.getText()));
       }
        
    }//GEN-LAST:event_brtnBuscarActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        
        if(generadorprimoss != null){
        if(generadorprimoss.isAlive()){
        generadorprimoss.interrupt();
        }else{
           JOptionPane.showMessageDialog(null, "No existe nada que detener actualmente.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }else{
          JOptionPane.showMessageDialog(null, "No existe nada que detener actualmente.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnstopActionPerformed

    private void txtNumerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerosKeyTyped
       char c = evt.getKeyChar();
      
      if(!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE){
          evt.consume();
      }
    }//GEN-LAST:event_txtNumerosKeyTyped

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
       char c = evt.getKeyChar();
      
      if(!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE){
          evt.consume();
      }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtNumerosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerosKeyReleased
       if(txtNumeros.getText().isEmpty()){
          btnstart.setEnabled(false);
          btnstop.setEnabled(false);
          btnGuardarImagen.setEnabled(false);
      }else{
          btnstart.setEnabled(true);
          btnstop.setEnabled(true);
          btnGuardarImagen.setEnabled(true);
      }
    }//GEN-LAST:event_txtNumerosKeyReleased

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
      if(txtBusqueda.getText().isEmpty()){
          brtnBuscar.setEnabled(false);
          btnEliminar.setEnabled(false);
          btnInsertar.setEnabled(false);
      }else{
          brtnBuscar.setEnabled(true);
          btnEliminar.setEnabled(true);
          btnInsertar.setEnabled(true);
      }
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void btnpreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreordenActionPerformed
       if(modelo.getnoexistelista()){
           JOptionPane.showMessageDialog(null, "No existe un árbol para evaluar.", "ERROR", JOptionPane.ERROR_MESSAGE);
       }else{
           
       }
    }//GEN-LAST:event_btnpreordenActionPerformed

    private void btnpostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostordenActionPerformed
      if(modelo.getnoexistelista()){
           JOptionPane.showMessageDialog(null, "No existe un árbol para evaluar.", "ERROR", JOptionPane.ERROR_MESSAGE);
       }else{
           
       }
    }//GEN-LAST:event_btnpostordenActionPerformed

    private void btninorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninorderActionPerformed
      if(modelo.getnoexistelista()){
           JOptionPane.showMessageDialog(null, "No existe un árbol para evaluar.", "ERROR", JOptionPane.ERROR_MESSAGE);
       }else{
           
       }
    }//GEN-LAST:event_btninorderActionPerformed

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
    private javax.swing.JButton btninorder;
    private javax.swing.JButton btnpostorden;
    private javax.swing.JButton btnpreorden;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnstop;
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
