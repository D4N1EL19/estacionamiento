package igu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import logica.BaseDeDatos;

public class Guardia extends javax.swing.JFrame {
    
    BaseDeDatos bd;
    
    public Guardia(BaseDeDatos bd) {
        initComponents();
        pnlEscaneo.setVisible(false);
        this.bd = bd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlManual = new javax.swing.JPanel();
        lblManual = new javax.swing.JLabel();
        lblNControl = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JLabel();
        txtNumeroControl = new javax.swing.JTextField();
        SeparadorNumero = new javax.swing.JSeparator();
        pnlInvitado = new javax.swing.JPanel();
        btnVisitante = new javax.swing.JLabel();
        btnAspirante = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        pnlFondoIzq = new javax.swing.JPanel();
        pnlEscaneo = new javax.swing.JPanel();
        pgsEscaneo = new javax.swing.JProgressBar();
        lblLogo = new javax.swing.JLabel();
        lblEscaneo = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        pnlBackground.setBackground(new java.awt.Color(191, 217, 255));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlManual.setBackground(new java.awt.Color(0, 102, 255));

        lblManual.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblManual.setForeground(new java.awt.Color(255, 255, 255));
        lblManual.setText("Ingresar manualmente");

        lblNControl.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        lblNControl.setForeground(new java.awt.Color(255, 255, 255));
        lblNControl.setText("No. control");

        btnEntrar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Ingresar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNumeroControl.setBackground(new java.awt.Color(0, 102, 255));
        txtNumeroControl.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        txtNumeroControl.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroControl.setBorder(null);
        txtNumeroControl.setCaretColor(new java.awt.Color(255, 255, 255));

        SeparadorNumero.setForeground(new java.awt.Color(255, 255, 255));

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
                                .addComponent(lblManual)
                                .addComponent(lblNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManualLayout.createSequentialGroup()
                            .addComponent(btnEntrar)
                            .addGap(239, 239, 239)))
                    .addGroup(pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SeparadorNumero, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumeroControl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))))
        );
        pnlManualLayout.setVerticalGroup(
            pnlManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManualLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblManual)
                .addGap(65, 65, 65)
                .addComponent(lblNControl)
                .addGap(28, 28, 28)
                .addComponent(txtNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(48, 48, 48))
        );

        pnlBackground.add(pnlManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 590, 450));

        pnlInvitado.setBackground(new java.awt.Color(180, 210, 255));

        btnVisitante.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        btnVisitante.setText("Visitante");
        btnVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAspirante.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        btnAspirante.setText("Aspirante");
        btnAspirante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCerrarSesion.setFont(new java.awt.Font("Montserrat Thin", 0, 24)); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlInvitadoLayout = new javax.swing.GroupLayout(pnlInvitado);
        pnlInvitado.setLayout(pnlInvitadoLayout);
        pnlInvitadoLayout.setHorizontalGroup(
            pnlInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvitadoLayout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addGroup(pnlInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvitadoLayout.createSequentialGroup()
                        .addComponent(btnVisitante)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvitadoLayout.createSequentialGroup()
                        .addComponent(btnAspirante)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvitadoLayout.createSequentialGroup()
                        .addComponent(btnCerrarSesion)
                        .addGap(192, 192, 192))))
        );
        pnlInvitadoLayout.setVerticalGroup(
            pnlInvitadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInvitadoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnVisitante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAspirante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(56, 56, 56))
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
                .addComponent(pgsEscaneo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlEscaneoLayout.setVerticalGroup(
            pnlEscaneoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscaneoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pgsEscaneo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnlFondoIzq.add(pnlEscaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 533, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/346339429_9552708478103337_4631547997174124060_n.gif"))); // NOI18N
        pnlFondoIzq.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 171, 237, 225));

        lblEscaneo.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lblEscaneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscaneo.setText("Escanear datos");
        lblEscaneo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEscaneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEscaneoMousePressed(evt);
            }
        });
        pnlFondoIzq.add(lblEscaneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 380, -1));

        lblSalir.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSalirMousePressed(evt);
            }
        });
        pnlFondoIzq.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnlBackground.add(pnlFondoIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 750));

        txtInput.setMinimumSize(new java.awt.Dimension(0, 0));
        txtInput.setPreferredSize(new java.awt.Dimension(0, 0));
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        pnlBackground.add(txtInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 499, -1, -1));

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

    private void lblEscaneoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEscaneoMousePressed
        //Hacemos visible el panel
        pnlEscaneo.setVisible(true);
        //le ponemos un maximo a la barra de progreso
        pgsEscaneo.setMaximum(7);
        
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
                //aumentamos el progreso por cada tecla presionada
                pgsEscaneo.setValue(contN);
                contN++;
                
                //cuando de enter buscamos al alumno
                if(e.getKeyChar() == '\n'){
                    //nos traemos el numero ingresado
                    int codigo = Integer.parseInt(txtInput.getText());
                    
                    System.out.println(codigo);
                    
                    //alumno
                    if(alumno != null){
                        EntrarSalir pGuardia = new EntrarSalir();
                        pGuardia.setVisible(true);
                        pGuardia.setLocationRelativeTo(null);
                        cerar();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Favor de escanear");
                    }
                }
            }
        };
        
        txtInput.requestFocus();
        txtInput.addKeyListener(entradaTeclado);
    }//GEN-LAST:event_lblEscaneoMousePressed

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
       System.exit(0);
    }//GEN-LAST:event_lblSalirMousePressed

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed

    }//GEN-LAST:event_btnCerrarSesionMousePressed
    //metodo para cerrar la pantalla
    public void cerar(){
        this.dispose();
    }
    
    //contadores
    int contN = 0;
    
    //variables globales
    Integer alumno = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator SeparadorNumero;
    private javax.swing.JLabel btnAspirante;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnEntrar;
    private javax.swing.JLabel btnVisitante;
    private javax.swing.JLabel lblEscaneo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblManual;
    private javax.swing.JLabel lblNControl;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JProgressBar pgsEscaneo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlEscaneo;
    private javax.swing.JPanel pnlFondoIzq;
    private javax.swing.JPanel pnlInvitado;
    private javax.swing.JPanel pnlManual;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtNumeroControl;
    // End of variables declaration//GEN-END:variables
}
