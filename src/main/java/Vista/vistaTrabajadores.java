/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Frank
 */
public class vistaTrabajadores extends javax.swing.JInternalFrame {

    /**
     * Creates new form vistaVenta
     */
    public vistaTrabajadores() {
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

        redondear1 = new Modelo.Redondear();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();
        btnEliminar_Tra = new javax.swing.JButton();
        btnActualizar_Tra = new javax.swing.JButton();
        btnAgregar_Tra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre_trabajadores = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtApellidos_trabajadores = new javax.swing.JTextField();
        txtTelefono_trabajadores = new javax.swing.JTextField();
        txtEmail_trabajadores = new javax.swing.JTextField();
        txtDni_trabajadores = new javax.swing.JTextField();
        txtUsername_trabajadores = new javax.swing.JTextField();
        txtSueldo_trabajadores = new javax.swing.JTextField();
        txtId_trabajadores = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(870, 580));

        redondear1.setBackground(new java.awt.Color(180, 205, 237));
        redondear1.setRoundBottomLeft(60);
        redondear1.setRoundBottomRight(60);
        redondear1.setRoundTopLeft(60);
        redondear1.setRoundTopRight(60);
        redondear1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TRABAJADORES");
        redondear1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        tblTrabajadores.setBackground(new java.awt.Color(240, 244, 239));
        tblTrabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL", "DNI", "USERNAME", "SUELDO"
            }
        ));
        jScrollPane1.setViewportView(tblTrabajadores);

        redondear1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 650, 370));

        btnEliminar_Tra.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar_Tra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminar_Tra.setText("ELIMINAR ");
        btnEliminar_Tra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnEliminar_Tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_TraActionPerformed(evt);
            }
        });
        redondear1.add(btnEliminar_Tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 160, 50));

        btnActualizar_Tra.setBackground(new java.awt.Color(51, 153, 255));
        btnActualizar_Tra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnActualizar_Tra.setText("Actualizar");
        btnActualizar_Tra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnActualizar_Tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar_TraActionPerformed(evt);
            }
        });
        redondear1.add(btnActualizar_Tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 160, 50));

        btnAgregar_Tra.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregar_Tra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAgregar_Tra.setText("AGREGAR");
        btnAgregar_Tra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnAgregar_Tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_TraActionPerformed(evt);
            }
        });
        redondear1.add(btnAgregar_Tra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 160, 50));

        jLabel2.setBackground(new java.awt.Color(180, 205, 237));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registro de Trabajador");
        redondear1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText(" Username:");
        redondear1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 80, 30));

        txtNombre_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtNombre_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtNombre_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre_trabajadores.setBorder(null);
        redondear1.add(txtNombre_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellidos:");
        redondear1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefono:");
        redondear1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Email:");
        redondear1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("DNI:");
        redondear1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID:");
        redondear1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Sueldo:");
        redondear1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombres:");
        redondear1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtApellidos_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtApellidos_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtApellidos_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos_trabajadores.setBorder(null);
        redondear1.add(txtApellidos_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, 30));

        txtTelefono_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtTelefono_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtTelefono_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono_trabajadores.setBorder(null);
        redondear1.add(txtTelefono_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 30));

        txtEmail_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtEmail_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtEmail_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail_trabajadores.setBorder(null);
        redondear1.add(txtEmail_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, 30));

        txtDni_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtDni_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtDni_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtDni_trabajadores.setBorder(null);
        redondear1.add(txtDni_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 110, 30));

        txtUsername_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtUsername_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtUsername_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername_trabajadores.setBorder(null);
        redondear1.add(txtUsername_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 110, 30));

        txtSueldo_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtSueldo_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtSueldo_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtSueldo_trabajadores.setBorder(null);
        redondear1.add(txtSueldo_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 110, 30));

        txtId_trabajadores.setBackground(new java.awt.Color(180, 205, 237));
        txtId_trabajadores.setFont(new java.awt.Font("Nirmala UI", 0, 13)); // NOI18N
        txtId_trabajadores.setForeground(new java.awt.Color(0, 0, 0));
        txtId_trabajadores.setBorder(null);
        redondear1.add(txtId_trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 110, 20));

        jSeparator2.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 110, 20));

        jSeparator3.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 110, 20));

        jSeparator4.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 110, 20));

        jSeparator5.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 110, 20));

        jSeparator6.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 110, 20));

        jSeparator7.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, 20));

        jSeparator8.setBackground(new java.awt.Color(180, 205, 237));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, 20));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redondear1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redondear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminar_TraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_TraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar_TraActionPerformed

    private void btnActualizar_TraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar_TraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar_TraActionPerformed

    private void btnAgregar_TraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_TraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar_TraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar_Tra;
    public javax.swing.JButton btnAgregar_Tra;
    public javax.swing.JButton btnEliminar_Tra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private Modelo.Redondear redondear1;
    public javax.swing.JTable tblTrabajadores;
    public javax.swing.JTextField txtApellidos_trabajadores;
    public javax.swing.JTextField txtDni_trabajadores;
    public javax.swing.JTextField txtEmail_trabajadores;
    public javax.swing.JTextField txtId_trabajadores;
    public javax.swing.JTextField txtNombre_trabajadores;
    public javax.swing.JTextField txtSueldo_trabajadores;
    public javax.swing.JTextField txtTelefono_trabajadores;
    public javax.swing.JTextField txtUsername_trabajadores;
    // End of variables declaration//GEN-END:variables
}
