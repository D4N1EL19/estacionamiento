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
        txtCapacida1 = new javax.swing.JTextField();
        btnEstacionamiento1 = new javax.swing.JLabel();
        pnlEstacionamiento2 = new javax.swing.JPanel();
        txtCapacidad2 = new javax.swing.JTextField();
        btnEstacionamiento2 = new javax.swing.JLabel();
        pnlEstacionamiento3 = new javax.swing.JPanel();
        btnEstacionamiento3 = new javax.swing.JLabel();
        txtCapacidad3 = new javax.swing.JTextField();
        pnlEstacionamiento3uno = new javax.swing.JPanel();
        pnlE400 = new javax.swing.JPanel();
        lbl400 = new javax.swing.JLabel();
        pnlE300 = new javax.swing.JPanel();
        lbl300 = new javax.swing.JLabel();
        pnlE200 = new javax.swing.JPanel();
        lbl200 = new javax.swing.JLabel();
        pnlE100 = new javax.swing.JPanel();
        lbl100 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(180, 210, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1180, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEstacionamiento1.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCapacida1.setEditable(false);
        txtCapacida1.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacida1.setBorder(null);
        txtCapacida1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento1.add(txtCapacida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, -1));

        btnEstacionamiento1.setFont(new java.awt.Font("Montserrat Thin", 0, 36)); // NOI18N
        btnEstacionamiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstacionamiento1.setText("Estacionamiento 1");
        btnEstacionamiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstacionamiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstacionamiento1MousePressed(evt);
            }
        });
        pnlEstacionamiento1.add(btnEstacionamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 240));

        jPanel1.add(pnlEstacionamiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 370, 240));

        pnlEstacionamiento2.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCapacidad2.setEditable(false);
        txtCapacidad2.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacidad2.setBorder(null);
        pnlEstacionamiento2.add(txtCapacidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, -1));

        btnEstacionamiento2.setFont(new java.awt.Font("Montserrat Thin", 0, 36)); // NOI18N
        btnEstacionamiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstacionamiento2.setText("Estacionamiento 2");
        btnEstacionamiento2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstacionamiento2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstacionamiento2MousePressed(evt);
            }
        });
        pnlEstacionamiento2.add(btnEstacionamiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 230));

        jPanel1.add(pnlEstacionamiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 380, 230));

        pnlEstacionamiento3.setBackground(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEstacionamiento3.setBackground(new java.awt.Color(255, 255, 255));
        btnEstacionamiento3.setFont(new java.awt.Font("Montserrat Thin", 0, 36)); // NOI18N
        btnEstacionamiento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstacionamiento3.setText("Estacionamiento 3");
        btnEstacionamiento3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstacionamiento3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstacionamiento3MousePressed(evt);
            }
        });
        pnlEstacionamiento3.add(btnEstacionamiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, 520, 170));

        txtCapacidad3.setEditable(false);
        txtCapacidad3.setBackground(new java.awt.Color(255, 255, 255));
        txtCapacidad3.setBorder(null);
        txtCapacidad3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pnlEstacionamiento3.add(txtCapacidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 120, -1));

        jPanel1.add(pnlEstacionamiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 530, 170));

        pnlEstacionamiento3uno.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlEstacionamiento3unoLayout = new javax.swing.GroupLayout(pnlEstacionamiento3uno);
        pnlEstacionamiento3uno.setLayout(pnlEstacionamiento3unoLayout);
        pnlEstacionamiento3unoLayout.setHorizontalGroup(
            pnlEstacionamiento3unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        pnlEstacionamiento3unoLayout.setVerticalGroup(
            pnlEstacionamiento3unoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(pnlEstacionamiento3uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 260, 60));

        lbl400.setFont(new java.awt.Font("Montserrat Thin", 0, 14)); // NOI18N
        lbl400.setText("Edifico 400");

        javax.swing.GroupLayout pnlE400Layout = new javax.swing.GroupLayout(pnlE400);
        pnlE400.setLayout(pnlE400Layout);
        pnlE400Layout.setHorizontalGroup(
            pnlE400Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlE400Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl400)
                .addGap(32, 32, 32))
        );
        pnlE400Layout.setVerticalGroup(
            pnlE400Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlE400Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(lbl400)
                .addGap(105, 105, 105))
        );

        jPanel1.add(pnlE400, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 100, 230));

        lbl300.setFont(new java.awt.Font("Montserrat Thin", 0, 14)); // NOI18N
        lbl300.setText("Edifico 300");

        javax.swing.GroupLayout pnlE300Layout = new javax.swing.GroupLayout(pnlE300);
        pnlE300.setLayout(pnlE300Layout);
        pnlE300Layout.setHorizontalGroup(
            pnlE300Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlE300Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl300)
                .addGap(32, 32, 32))
        );
        pnlE300Layout.setVerticalGroup(
            pnlE300Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlE300Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl300)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel1.add(pnlE300, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 100, 120));

        lbl200.setFont(new java.awt.Font("Montserrat Thin", 0, 14)); // NOI18N
        lbl200.setText("Edifico 200");

        javax.swing.GroupLayout pnlE200Layout = new javax.swing.GroupLayout(pnlE200);
        pnlE200.setLayout(pnlE200Layout);
        pnlE200Layout.setHorizontalGroup(
            pnlE200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlE200Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lbl200)
                .addGap(32, 32, 32))
        );
        pnlE200Layout.setVerticalGroup(
            pnlE200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlE200Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl200)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1.add(pnlE200, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, 120));

        lbl100.setFont(new java.awt.Font("Montserrat Thin", 0, 14)); // NOI18N
        lbl100.setText("Edifico 100");

        javax.swing.GroupLayout pnlE100Layout = new javax.swing.GroupLayout(pnlE100);
        pnlE100.setLayout(pnlE100Layout);
        pnlE100Layout.setHorizontalGroup(
            pnlE100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlE100Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl100)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlE100Layout.setVerticalGroup(
            pnlE100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlE100Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lbl100)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel1.add(pnlE100, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 180));

        btnRegresar.setFont(new java.awt.Font("Montserrat Thin", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 60, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstacionamiento3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstacionamiento3MousePressed
        Estacionamiento3 est = new Estacionamiento3();
        est.setVisible(true);
        est.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEstacionamiento3MousePressed

    private void btnEstacionamiento1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstacionamiento1MousePressed
        Estacionamiento1 est = new Estacionamiento1();
        est.setVisible(true);
        est.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEstacionamiento1MousePressed

    private void btnEstacionamiento2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstacionamiento2MousePressed
        Estacionamiento2 est = new Estacionamiento2();
        est.setVisible(true);
        est.setLocationRelativeTo(null);
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
    private javax.swing.JLabel lbl100;
    private javax.swing.JLabel lbl200;
    private javax.swing.JLabel lbl300;
    private javax.swing.JLabel lbl400;
    private javax.swing.JPanel pnlE100;
    private javax.swing.JPanel pnlE200;
    private javax.swing.JPanel pnlE300;
    private javax.swing.JPanel pnlE400;
    private javax.swing.JPanel pnlEstacionamiento1;
    private javax.swing.JPanel pnlEstacionamiento2;
    private javax.swing.JPanel pnlEstacionamiento3;
    private javax.swing.JPanel pnlEstacionamiento3uno;
    private javax.swing.JTextField txtCapacida1;
    private javax.swing.JTextField txtCapacidad2;
    private javax.swing.JTextField txtCapacidad3;
    // End of variables declaration//GEN-END:variables

}
