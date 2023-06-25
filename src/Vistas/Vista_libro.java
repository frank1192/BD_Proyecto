
package Vistas;

import controlador.Controlador_libro;
import javax.swing.JOptionPane;
import modelo.Modelo_libro;
import controlador.Controlador_libros_y_autores;

/**
 *
 * @author Franklin Aguirre
 */
public class Vista_libro extends javax.swing.JFrame {
    Controlador_libro controlador_libro;
    Controlador_libros_y_autores controlador_libros_y_autores;
    /**
     * Creates new form Vista_editorial
     */
    public Vista_libro() {
        initComponents();
        controlador_libro = new Controlador_libro();
        controlador_libros_y_autores = new Controlador_libros_y_autores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinalizar = new javax.swing.JButton();
        txt_3 = new javax.swing.JTextField();
        lbl_3 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        txt_2 = new javax.swing.JTextField();
        lbl_1 = new javax.swing.JLabel();
        txt_1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbl_6 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_8 = new javax.swing.JLabel();
        txt_5 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_6 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        lbl_9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_1 = new javax.swing.JTextArea();
        btnEliminar1 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFinalizar.setBackground(new java.awt.Color(255, 0, 51));
        btnFinalizar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setFocusable(false);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        txt_3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        lbl_3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_3.setText("Año de publicacion:");

        lbl_2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_2.setText("Titulo:");

        txt_2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        lbl_1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_1.setText("ISBN:");

        txt_1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(255, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(255, 0, 51));
        btnActualizar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setFocusable(false);

        btnAgregar.setBackground(new java.awt.Color(255, 0, 51));
        btnAgregar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lbl_6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_6.setText("Codigo de area de");

        lbl_5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_5.setText("Numero de paginas:");

        lbl_4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_4.setText("Idioma:");

        lbl_7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_7.setText("conocimiento:");

        lbl_8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_8.setText("Codigo de editorial:");

        txt_5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_5ActionPerformed(evt);
            }
        });

        txt_4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txt_6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txt_7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_7ActionPerformed(evt);
            }
        });

        lbl_9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_9.setText("Codigos de autores:");

        txtA_1.setColumns(20);
        txtA_1.setRows(5);
        jScrollPane1.setViewportView(txtA_1);

        btnEliminar1.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar1.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Administrar libros fisicos");
        btnEliminar1.setBorderPainted(false);
        btnEliminar1.setFocusable(false);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnEliminar2.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnEliminar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar2.setText("Administrar libros digitales");
        btnEliminar2.setBorderPainted(false);
        btnEliminar2.setFocusable(false);
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_3)
                            .addComponent(lbl_2)
                            .addComponent(lbl_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_2)
                            .addComponent(txt_1)
                            .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_6)
                            .addComponent(lbl_5)
                            .addComponent(lbl_4)
                            .addComponent(lbl_7)
                            .addComponent(lbl_8)
                            .addComponent(lbl_9))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_7, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txt_5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txt_4, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txt_6, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lbl_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_5)
                                    .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_7)
                            .addComponent(txt_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_8)
                            .addComponent(txt_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(128, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String isbn_libro = txt_1.getText();
                        
        try {
            Modelo_libro modelo_libro = controlador_libro.consultar_libro(isbn_libro);
            String lista_de_autores = controlador_libros_y_autores.consultar_autores_de_libro(isbn_libro);

            txt_2.setText(modelo_libro.getTitulo_libro());
            txt_3.setText(modelo_libro.getAnyo_de_publicacion_libro());
            txt_4.setText(modelo_libro.getIdioma_libro());
            txt_5.setText(modelo_libro.getNumero_de_paginas_libro());
            txt_6.setText(modelo_libro.getCodigo_area_de_conocimiento_libro());
            txt_7.setText(modelo_libro.getCodigo_editorial_libro());
            
            txtA_1.setText(lista_de_autores);

//            System.out.println("Consulta exitosa");

        }
        catch (Exception e){
//            System.out.println("F");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String isbn_libro, titulo_libro, anyo_de_publicacion_libro, idioma_libro, numero_de_paginas_libro, codigo_area_de_conocimiento_libro, codigo_editorial_libro, lista_de_autores; 
       
        isbn_libro = txt_1.getText();
        titulo_libro = txt_2.getText();
        anyo_de_publicacion_libro = txt_3.getText();
        idioma_libro = txt_4.getText();
        numero_de_paginas_libro = txt_5.getText();
        codigo_area_de_conocimiento_libro = txt_6.getText();
        codigo_editorial_libro = txt_7.getText();
        
        lista_de_autores = txtA_1.getText();
                
//        descripcion = txtA_descripcion.getText();getText
       
        try{
            controlador_libro.agregar_libro(isbn_libro, titulo_libro, anyo_de_publicacion_libro, idioma_libro, numero_de_paginas_libro, codigo_area_de_conocimiento_libro, codigo_editorial_libro);
           
            if (!"".equals(lista_de_autores)){
                controlador_libros_y_autores.agregar_autores_a_libro(isbn_libro, lista_de_autores);
            }
            limpiarGUI();
//            txtA_descripcion.append("Guardado exitoso");
        }
        catch(Exception e){
//            System.out.println("F");
//            txtA_descripcion.append("Guardado fallido");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_5ActionPerformed

    private void txt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_7ActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        Vista_libro_fisico vista_libro_fisico = new Vista_libro_fisico();
        vista_libro_fisico.setVisible(true);
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
    Vista_libro_digital vista_libro_digital= new Vista_libro_digital();
    vista_libro_digital.setVisible(true);
    }//GEN-LAST:event_btnEliminar2ActionPerformed
   private void limpiarGUI(){
        txt_1.setText("");
        txt_2.setText("");
        txt_3.setText("");
        txt_4.setText("");
        txt_5.setText("");
        txt_6.setText("");
        txt_7.setText("");        
        txtA_1.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminar1;
    public javax.swing.JButton btnEliminar2;
    public javax.swing.JButton btnFinalizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_7;
    private javax.swing.JLabel lbl_8;
    private javax.swing.JLabel lbl_9;
    private javax.swing.JTextArea txtA_1;
    public javax.swing.JTextField txt_1;
    public javax.swing.JTextField txt_2;
    public javax.swing.JTextField txt_3;
    public javax.swing.JTextField txt_4;
    public javax.swing.JTextField txt_5;
    public javax.swing.JTextField txt_6;
    public javax.swing.JTextField txt_7;
    // End of variables declaration//GEN-END:variables
}
