
package Vistas;

import controlador.Controlador_multa;
import javax.swing.JOptionPane;
import modelo.Modelo_multa;

/**
 *
 * @author Franklin Aguirre
 */
public class Vista_multa extends javax.swing.JFrame {
    Controlador_multa controlador_multa;
    /**
     * Creates new form Vista_editorial
     */
    public Vista_multa() {
        initComponents();
        controlador_multa = new Controlador_multa();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_1 = new javax.swing.JTextArea();
        txt_3 = new javax.swing.JTextField();
        lbl_4 = new javax.swing.JLabel();
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
        txt_4 = new javax.swing.JTextField();

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

        txtA_1.setColumns(20);
        txtA_1.setRows(5);
        jScrollPane1.setViewportView(txtA_1);

        txt_3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        lbl_4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_4.setText("Descripcion:");

        lbl_3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_3.setText("Valor:                          ");

        lbl_2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_2.setText("Fecha:");

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
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

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
        lbl_5.setText("Codigo de usuario:");

        txt_4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_3)
                            .addComponent(lbl_2)
                            .addComponent(lbl_1)
                            .addComponent(lbl_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_2)
                                .addComponent(txt_1)
                                .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(lbl_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_5)
                                .addGap(3, 3, 3)))
                        .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String codigo_multa = txt_1.getText();
                        
        try {
            Modelo_multa modelo_multa = controlador_multa.consultar_multa(codigo_multa);

            txt_2.setText(modelo_multa.getFecha_multa());
            txt_3.setText(modelo_multa.getValor_multa());
            txt_4.setText(modelo_multa.getCodigo_usuario_multa());
            txtA_1.setText(modelo_multa.getDescripcion_multa());

//            System.out.println("Consulta exitosa");

        }
        catch (Exception e){
//            System.out.println("Font");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo_multa, fecha_multa, valor_multa, descripcion_multa, codigo_usuario_multa; 
       
        codigo_multa = txt_1.getText();
        fecha_multa = txt_2.getText();
        valor_multa = txt_3.getText();
        codigo_usuario_multa = txt_4.getText();
        descripcion_multa = txtA_1.getText();
       
        try{
            controlador_multa.agregar_multa(codigo_multa, fecha_multa, valor_multa, descripcion_multa, codigo_usuario_multa);
            limpiarGUI();
//           txtA_descripcion.append("Guardado exitoso");
        }
        catch(Exception e){
//           txtA_descripcion.append("Guardado fallido");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo_multa = txt_1.getText();
    
    try {

        controlador_multa.eliminar_multa(codigo_multa);

        limpiarGUI();
    } catch (Exception e) {

    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         

        String codigo_multa, fecha_multa, valor_multa, codigo_usuario_multa, descripcion_multa; 
       
        codigo_multa = txt_1.getText();
        fecha_multa = txt_2.getText();
        valor_multa = txt_3.getText();
        codigo_usuario_multa = txt_4.getText();
        descripcion_multa = txtA_1.getText();
        
        
        Modelo_multa modelo_multa = new Modelo_multa(); 
        
        modelo_multa.setCodigo_multa(codigo_multa);
        modelo_multa.setFecha_multa(fecha_multa);
        modelo_multa.setValor_multa(valor_multa);
        modelo_multa.setCodigo_usuario_multa(codigo_usuario_multa);
        modelo_multa.setDescripcion_multa(descripcion_multa);

        try{

            if (!"".equals(fecha_multa)){
                controlador_multa.modificar_multa(modelo_multa, "fecha_multa", fecha_multa);
            }

            if (!"".equals(valor_multa)){
                controlador_multa.modificar_multa(modelo_multa, "valor_multa", valor_multa);
            }

            if (!"".equals(codigo_usuario_multa)){
                controlador_multa.modificar_multa(modelo_multa, "codigo_usuario_multa", codigo_usuario_multa);
            }
            
            if (!"".equals(descripcion_multa)){
                controlador_multa.modificar_multa(modelo_multa, "descripcion_multa", descripcion_multa);
            }
                
        }catch(Exception e){
        }   
        
        limpiarGUI();
        
    }//GEN-LAST:event_btnActualizarActionPerformed
   private void limpiarGUI(){
        txt_1.setText("");
        txt_2.setText("");
        txt_3.setText("");
        txt_4.setText("");
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
    public javax.swing.JButton btnFinalizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    public javax.swing.JTextArea txtA_1;
    public javax.swing.JTextField txt_1;
    public javax.swing.JTextField txt_2;
    public javax.swing.JTextField txt_3;
    public javax.swing.JTextField txt_4;
    // End of variables declaration//GEN-END:variables
}
