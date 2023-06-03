package igu;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Guardia extends javax.swing.JFrame {

    public Guardia() {
        initComponents();
        pnlEscaneo.setVisible(false);
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlManual = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pnlInvitado = new javax.swing.JPanel();
        lblVisitante = new javax.swing.JLabel();
        lblAspirante = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        pnlFondoIzq = new javax.swing.JPanel();
        pnlEscaneo = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblLogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        lblCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(191, 217, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlManual.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar manualmente");

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. control");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresar");

        jTextField1.setBackground(new java.awt.Color(0, 102, 255));
        jTextField1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlManualLayout = new javax.swing.GroupLayout(pnlManual);
        pnlManual.setLayout(pnlManualLayout);
        pnlManualLayout.setHorizontalGroup(
            pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManualLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManualLayout.createSequentialGroup()
                            .addGroup(pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManualLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(239, 239, 239)))
                    .addGroup(pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))))
        );
        pnlManualLayout.setVerticalGroup(
            pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManualLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(48, 48, 48))
        );

        pnlBackground.add(pnlManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 590, 450));

        pnlInvitado.setBackground(new java.awt.Color(180, 210, 255));

        lblVisitante.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lblVisitante.setText("Visitante");

        lblAspirante.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lblAspirante.setText("Aspirante");

        lblSalir.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlInvitadoLayout = new javax.swing.GroupLayout(pnlInvitado);
        pnlInvitado.setLayout(pnlInvitadoLayout);
        pnlInvitadoLayout.setHorizontalGroup(
            pnlInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvitadoLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(pnlInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvitadoLayout.createSequentialGroup()
                        .addComponent(lblSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvitadoLayout.createSequentialGroup()
                        .addComponent(lblVisitante)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvitadoLayout.createSequentialGroup()
                        .addComponent(lblAspirante)
                        .addGap(159, 159, 159))))
        );
        pnlInvitadoLayout.setVerticalGroup(
            pnlInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvitadoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblAspirante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblSalir)
                .addContainerGap())
        );

        pnlBackground.add(pnlInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 590, 300));

        pnlFondoIzq.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEscaneo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlEscaneoLayout = new javax.swing.GroupLayout(pnlEscaneo);
        pnlEscaneo.setLayout(pnlEscaneoLayout);
        pnlEscaneoLayout.setHorizontalGroup(
            pnlEscaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscaneoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlEscaneoLayout.setVerticalGroup(
            pnlEscaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscaneoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnlFondoIzq.add(pnlEscaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 533, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/346339429_9552708478103337_4631547997174124060_n.gif"))); // NOI18N
        pnlFondoIzq.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 171, 237, 225));

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        jLabel4.setText("Escanear datos");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        pnlFondoIzq.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 380, -1));

        pnlBackground.add(pnlFondoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 750));

        btnCerrarSesion.setBackground(new java.awt.Color(191, 217, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setContentAreaFilled(false);
        pnlBackground.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 680, 152, 59));

        txtInput.setMinimumSize(new java.awt.Dimension(0, 0));
        txtInput.setPreferredSize(new java.awt.Dimension(0, 0));
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        pnlBackground.add(txtInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 499, -1, -1));

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/20230601_122518.jpg"))); // NOI18N
        pnlBackground.add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -580, 1340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
       //ignorar
    }//GEN-LAST:event_txtInputActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        int i=1;

        //reaccion por teclado
        KeyListener entradaTeclado;
        entradaTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //sin codigo
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //sin codigo
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(i);
                
                if(e.getKeyChar() == '\n'){
                    int codigo = Integer.parseInt(txtInput.getText());
                    System.out.println(codigo);
                }
            }
        };
        
        txtInput.requestFocus();
        txtInput.addKeyListener(entradaTeclado);
    }//GEN-LAST:event_jLabel4MousePressed

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblSalirMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAspirante;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblVisitante;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlEscaneo;
    private javax.swing.JPanel pnlFondoIzq;
    private javax.swing.JPanel pnlInvitado;
    private javax.swing.JPanel pnlManual;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
