package igu;
import logica.BaseDeDatos;

public class EntrarSalir extends javax.swing.JFrame {
    public char tipo;
    BaseDeDatos bd = new BaseDeDatos();
    
    public EntrarSalir(Integer nA, char tipo,BaseDeDatos bd) {
        initComponents();
        this.numeroA = nA;
        this.bd = bd;
        this.tipo = tipo;
        txtCapacida1.setText("Capacidad: " + ((bd.getContEsta1() * 100)/80) + "%");
        txtCapacidad2.setText("Capacidad: " + ((bd.getContEsta2() * 100)/80) + "%");
        txtCapacidad3.setText("Capacidad: " + bd.getContEsta3() + "%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlEstacionamiento1 = new javax.swing.JPanel();
        btnEstacionamiento1 = new javax.swing.JLabel();
        txtCapacida1 = new javax.swing.JTextField();
        pnlEstacionamiento2 = new javax.swing.JPanel();
        txtCapacidad2 = new javax.swing.JTextField();
        btnEstacionamiento2 = new javax.swing.JLabel();
        pnlEstacionamiento3 = new javax.swing.JPanel();
        btnEstacionamiento3 = new javax.swing.JLabel();
        txtCapacidad3 = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(180, 210, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1180, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEstacionamiento1.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstacionamiento1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnEstacionamiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstacionamiento1.setText("Estacionamiento 1");
        btnEstacionamiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstacionamiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstacionamiento1MousePressed(evt);
            }
        });
        pnlEstacionamiento1.add(btnEstacionamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 150));

        txtCapacida1.setEditable(false);
        txtCapacida1.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacida1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCapacida1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCapacida1.setBorder(null);
        txtCapacida1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento1.add(txtCapacida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 50));

        jPanel1.add(pnlEstacionamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 250, 150));

        pnlEstacionamiento2.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCapacidad2.setEditable(false);
        txtCapacidad2.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacidad2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCapacidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCapacidad2.setBorder(null);
        pnlEstacionamiento2.add(txtCapacidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 40));

        btnEstacionamiento2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnEstacionamiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstacionamiento2.setText("Estacionamiento 2");
        btnEstacionamiento2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstacionamiento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstacionamiento2MousePressed(evt);
            }
        });
        pnlEstacionamiento2.add(btnEstacionamiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 240));

        jPanel1.add(pnlEstacionamiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 240, 240));

        pnlEstacionamiento3.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstacionamiento3.setBackground(new java.awt.Color(255, 255, 255));
        btnEstacionamiento3.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        btnEstacionamiento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstacionamiento3.setText("Estacionamiento 3");
        btnEstacionamiento3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstacionamiento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstacionamiento3MousePressed(evt);
            }
        });
        pnlEstacionamiento3.add(btnEstacionamiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 140));

        txtCapacidad3.setEditable(false);
        txtCapacidad3.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacidad3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCapacidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCapacidad3.setBorder(null);
        txtCapacidad3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento3.add(txtCapacidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 84, 250, 40));

        jPanel1.add(pnlEstacionamiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 320, 140));

        btnRegresar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 70, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/346339429_9552708478103337_4631547997174124060_n.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 750));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/diseño estac blanco peq.PNG"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstacionamiento3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstacionamiento3MousePressed
        Estacionamiento3 est = new Estacionamiento3(bd,numeroA,tipo);
        est.setVisible(true);
        est.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstacionamiento3MousePressed

    private void btnEstacionamiento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstacionamiento1MousePressed
        Estacionamiento1 est = new Estacionamiento1(bd,numeroA,tipo);
        est.setVisible(true);
        est.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstacionamiento1MousePressed

    private void btnEstacionamiento2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstacionamiento2MousePressed
        Estacionamiento2 est = new Estacionamiento2(bd,numeroA,tipo);
        est.setVisible(true);
        est.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstacionamiento2MousePressed

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        Guardia regreso = new Guardia(bd);
        regreso.setVisible(true);
        regreso.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMousePressed
    
    //variables globales
    Integer numeroA = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEstacionamiento1;
    private javax.swing.JLabel btnEstacionamiento2;
    private javax.swing.JLabel btnEstacionamiento3;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnlEstacionamiento1;
    private javax.swing.JPanel pnlEstacionamiento2;
    private javax.swing.JPanel pnlEstacionamiento3;
    private javax.swing.JTextField txtCapacida1;
    private javax.swing.JTextField txtCapacidad2;
    private javax.swing.JTextField txtCapacidad3;
    // End of variables declaration//GEN-END:variables

}
