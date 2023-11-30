package Vista;

import java.awt.Color;

public class vistaLogin extends javax.swing.JFrame {

    public vistaLogin() {
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redondear1 = new Modelo.Redondear();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        btnCerr = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        redondear1.setBackground(new java.awt.Color(52, 73, 102));
        redondear1.setRoundBottomLeft(60);
        redondear1.setRoundBottomRight(60);
        redondear1.setRoundTopLeft(60);
        redondear1.setRoundTopRight(60);
        redondear1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar credenciales para poder ingresar:");
        redondear1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 300, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");
        redondear1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 70, -1));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bienvenido!");
        redondear1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 90, -1));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");
        redondear1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        txtUser.setBackground(new java.awt.Color(52, 73, 102));
        txtUser.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        redondear1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 240, 40));

        btnIngresar.setBackground(new java.awt.Color(240, 244, 239));
        btnIngresar.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        btnIngresar.setText("Ingresar");
        redondear1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 140, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/OIP-removebg-preview.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        redondear1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 410, 380));
        redondear1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 240, -1));
        redondear1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 240, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empleado (1).png"))); // NOI18N
        redondear1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asegurado.png"))); // NOI18N
        redondear1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios.png"))); // NOI18N
        redondear1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Comic Crown");
        redondear1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 290, 66));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Iniciar Sesión");
        redondear1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 290, 66));

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar.png"))); // NOI18N
        redondear1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        btnCerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        redondear1.add(btnCerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblError.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        lblError.setForeground(new java.awt.Color(204, 0, 0));
        redondear1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 280, 30));

        txtPass.setBackground(new java.awt.Color(52, 73, 102));
        txtPass.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(null);
        redondear1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 240, 40));

        getContentPane().add(redondear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnCerr;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JLabel btnMin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lblError;
    private Modelo.Redondear redondear1;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
