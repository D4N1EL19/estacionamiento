package igu;

import logica.EstacionaTec;
import logica.Guardia;

/**
 *
 * @author daniel
 */

public class InicioSesion extends javax.swing.JFrame {

    ///////////////////////////////////////////////////////////////////////////
    //////////////////////////// OBEJTOS //////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    
    Guardia guardia1 = new Guardia("Daniel","Gutierrez","Ramirez",19,08,20004,"DaniSa19","190824","al22760562@ite.edu.mx");
    
    public InicioSesion() {
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

        pnlPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrase = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(500, 500));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/logo.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContrase.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblContrase.setText("Contraseña");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        btnEntrar.setText("Iniciar sesion");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblLogo))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContrase)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnEntrar)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addGap(1, 1, 1)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContrase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnEntrar)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        
        EstacionaTec.setUsuario(usuario);
        EstacionaTec.setContrasenia(contrasenia);
        
        txtContrasenia.setText("");
        txtUsuario.setText("");
    }//GEN-LAST:event_btnEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblContrase;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
