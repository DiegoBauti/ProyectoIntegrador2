package Vista;

public class vistaHistorial_Venta extends javax.swing.JInternalFrame {

    public vistaHistorial_Venta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redondear1 = new Modelo.Redondear();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();
        cbxOrdenar = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        cbxFiltrar = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();
        txfIngresoID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(796, 580));

        redondear1.setBackground(new java.awt.Color(180, 205, 237));
        redondear1.setRoundBottomLeft(60);
        redondear1.setRoundBottomRight(60);
        redondear1.setRoundTopLeft(60);
        redondear1.setRoundTopRight(60);
        redondear1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Historial de Ventas");
        redondear1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        tblHistorial.setBackground(new java.awt.Color(240, 244, 239));
        tblHistorial.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID VENTA", "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "FECHA", "HORA"
            }
        ));
        jScrollPane1.setViewportView(tblHistorial);

        redondear1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 450, 390));

        cbxOrdenar.setBackground(new java.awt.Color(240, 244, 239));
        cbxOrdenar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Monto de Menor a Mayor", "Monto de Mayor a Menor", "Fecha de Menor a Mayor", "Fecha de Mayor a Menor" }));
        cbxOrdenar.setBorder(null);
        redondear1.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 170, 50));

        btnFiltrar.setBackground(new java.awt.Color(240, 244, 239));
        btnFiltrar.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btnFiltrar.setText("FILTRAR");
        redondear1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        cbxFiltrar.setBackground(new java.awt.Color(240, 244, 239));
        cbxFiltrar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Mayor a 150", "De esta semana", "Menos a 100" }));
        cbxFiltrar.setBorder(null);
        redondear1.add(cbxFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 170, 50));

        btnOrdenar.setBackground(new java.awt.Color(240, 244, 239));
        btnOrdenar.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        redondear1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        btnMostrarTodo.setBackground(new java.awt.Color(240, 244, 239));
        btnMostrarTodo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btnMostrarTodo.setText("MOSTRAR");
        redondear1.add(btnMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        txfIngresoID.setBackground(new java.awt.Color(180, 205, 237));
        txfIngresoID.setBorder(null);
        redondear1.add(txfIngresoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 80, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        redondear1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 80, 10));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresa el ID:");
        redondear1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(240, 244, 239));
        btnBuscar.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        redondear1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redondear1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redondear1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnFiltrar;
    public javax.swing.JButton btnMostrarTodo;
    public javax.swing.JButton btnOrdenar;
    public javax.swing.JComboBox<String> cbxFiltrar;
    public javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private Modelo.Redondear redondear1;
    public javax.swing.JTable tblHistorial;
    public javax.swing.JTextField txfIngresoID;
    // End of variables declaration//GEN-END:variables
}
