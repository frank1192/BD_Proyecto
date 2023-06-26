
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Franklin Aguirre
 */
public class Vista_administracion_empleado extends javax.swing.JFrame {

    /**
     * Creates new form VistaIniciarSesion
     */
    private String nombre = "/IMAGENES/FondoIniciarSesion.jpg";
    private Fondo fondo =new Fondo(nombre);
    public Vista_administracion_empleado() {
        this.setContentPane(fondo);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEntrar1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnEntrar.setBackground(new java.awt.Color(255, 0, 51));
        btnEntrar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Regresar");
        btnEntrar.setToolTipText("");
        btnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar.setBorderPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Seleccione, una opcion");

        btnEntrar1.setBackground(new java.awt.Color(255, 0, 51));
        btnEntrar1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar1.setText("Seguir");
        btnEntrar1.setToolTipText("");
        btnEntrar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar1.setBorderPainted(false);
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 0, 51));
        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrar usuarios", "Administrar prestamos", "Consultar descargas", "Administrar solicitudes", "Administrar multas", "Administrar libros", "Administrar autores", "Administrar editoriales", "Administrar areas de interes", "Administrar areas de conocimiento" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(379, Short.MAX_VALUE)
                    .addComponent(btnEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(279, Short.MAX_VALUE)
                    .addComponent(btnEntrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Vista_inicio_sesion_empleado vista_inicio_sesion_empleado = new Vista_inicio_sesion_empleado();
        vista_inicio_sesion_empleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        Object opcion_o = jComboBox1.getSelectedItem();
        String opcion_s = opcion_o.toString();
        
        if ("Administrar usuarios".equals(opcion_s)) {
            Vista_administracion_de_usuario_por_empleado vista_administracion_de_usuario_por_empleado = new Vista_administracion_de_usuario_por_empleado();
            vista_administracion_de_usuario_por_empleado.setVisible(true);
        }

        if ("Administrar prestamos".equals(opcion_s)) {
            Vista_prestamo_de_libro vista_prestamo_de_libro = new Vista_prestamo_de_libro();
            vista_prestamo_de_libro.setVisible(true);
        }
        
        if ("Consultar descargas".equals(opcion_s)) {
            Vista_descarga_de_libro vista_descarga_de_libro = new Vista_descarga_de_libro();
            vista_descarga_de_libro.setVisible(true);
        }

        if ("Administrar solicitudes".equals(opcion_s)) {
            Vista_solicitud_de_libro vista_solicitud_de_libro = new Vista_solicitud_de_libro();
            vista_solicitud_de_libro.setVisible(true);
        }

        if ("Administrar multas".equals(opcion_s)) {
            Vista_multa vista_multa = new Vista_multa();
            vista_multa.setVisible(true);
        }

        if ("Administrar libros".equals(opcion_s)) {
            Vista_libro vista_libro = new Vista_libro();
            vista_libro.setVisible(true);
        }

        if ("Administrar autores".equals(opcion_s)) {
            Vista_autor vista_autor = new Vista_autor();
            vista_autor.setVisible(true);
        }
        
        if ("Administrar editoriales".equals(opcion_s)) {
            Vista_editorial vista_editorial = new Vista_editorial();
            vista_editorial.setVisible(true);
        }
        
        if ("Administrar areas de interes".equals(opcion_s)) {
            Vista_area_de_interes vista_area_de_interes = new Vista_area_de_interes();
            vista_area_de_interes.setVisible(true);
        }
        
        if ("Administrar areas de conocimiento".equals(opcion_s)) {
            Vista_area_de_conocimiento vista_area_de_conocimiento = new Vista_area_de_conocimiento();
            vista_area_de_conocimiento.setVisible(true);
        }
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    public javax.swing.JButton btnEntrar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
