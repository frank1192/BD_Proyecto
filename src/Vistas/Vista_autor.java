
package Vistas;

import controlador.Controlador_autor;
import javax.swing.JOptionPane;
import modelo.Modelo_autor;
/**
 *
 * @author Franklin Aguirre
 */
public class Vista_autor extends javax.swing.JFrame {
    Controlador_autor controlador_autor;
    /**
     * Creates new form Vista_editorial
     */
    public Vista_autor() {
        initComponents();
        controlador_autor = new Controlador_autor();
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
        lbl_5 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        txt_5 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFinalizar.setBackground(new java.awt.Color(255, 0, 51));
        btnFinalizar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setFocusable(false);

        txt_3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        lbl_3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_3.setText("Segundo nombre:");

        lbl_2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_2.setText("Primer nombre:");

        txt_2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        lbl_1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_1.setText("Codigo:");

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

        lbl_5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_5.setText("Segundo apellido:");

        lbl_4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_4.setText("Primer apellido:");

        txt_5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_5ActionPerformed(evt);
            }
        });

        txt_4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_3)
                    .addComponent(lbl_2)
                    .addComponent(lbl_1)
                    .addComponent(lbl_5)
                    .addComponent(lbl_4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_2)
                        .addComponent(txt_1)
                        .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                                        .addComponent(lbl_5)))
                                .addGap(27, 27, 27)))
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(108, 108, 108)
                            .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(334, 334, 334))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(307, 307, 307))))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String codigo_autor = txt_1.getText();
        
        try {
            Modelo_autor modelo_autor = controlador_autor.consultar_autor(codigo_autor);

            txt_2.setText(modelo_autor.getPrimer_nombre_autor());
            txt_3.setText(modelo_autor.getSegundo_nombre_autor());
            txt_4.setText(modelo_autor.getPrimer_apellido_autor());
            txt_5.setText(modelo_autor.getSegundo_apellido_autor());

//            System.out.println("Consulta exitosa");

        }
        catch (Exception e){
//            System.out.println("Consulta fallida");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo_autor, primer_nombre_autor, segundo_nombre_autor, primer_apellido_autor, segundo_apellido_autor; 
       
        codigo_autor = txt_1.getText();
        primer_nombre_autor = txt_2.getText();
        segundo_nombre_autor = txt_3.getText();
        primer_apellido_autor = txt_4.getText();
        segundo_apellido_autor = txt_5.getText();
                
//        descripcion = txtA_descripcion.getText();getText
       
        try{
           controlador_autor.agregar_autor(codigo_autor, primer_nombre_autor, segundo_nombre_autor, primer_apellido_autor, segundo_apellido_autor);
           limpiarGUI();
//            txtA_descripcion.append("Guardado exitoso");
        }
        catch(Exception e){
//            txtA_descripcion.append("Guardado fallido");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_5ActionPerformed
   private void limpiarGUI(){
        txt_1.setText("");
        txt_2.setText("");
        txt_3.setText("");
        txt_4.setText("");
        txt_5.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    public javax.swing.JTextField txt_1;
    public javax.swing.JTextField txt_2;
    public javax.swing.JTextField txt_3;
    public javax.swing.JTextField txt_4;
    public javax.swing.JTextField txt_5;
    // End of variables declaration//GEN-END:variables
}