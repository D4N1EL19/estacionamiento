package igu;

import java.awt.Color;
import javax.swing.JOptionPane;
import logica.EstacionaTec;

/**
 *
 * @author daniel
 */

public class InicioSesion extends javax.swing.JFrame {
    
    EstacionaTec metodos = new EstacionaTec();
    Guardia pantallaGuardia = new Guardia();
    public final Color defecto = new Color(204,204,204);
    
    public InicioSesion() {
        initComponents();
    }
    
    //metodo para limpiar campos
    public void limpiar(){
        txtUsuario.setForeground(defecto);
        jpdContrasenia.setForeground(defecto);
        txtUsuario.setText("Nombre de usuario");
        jpdContrasenia.setText("defecto"); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlInicioSesion = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrase = new javax.swing.JLabel();
        jpdContrasenia = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(500, 500));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInicioSesion.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/346339429_9552708478103337_4631547997174124060_n.gif"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblUsuario.setText("Usuario");

        txtUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblContrase.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblContrase.setText("Contraseña");

        jpdContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        jpdContrasenia.setText("defecto");
        jpdContrasenia.setToolTipText("");
        jpdContrasenia.setBorder(null);
        jpdContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpdContraseniaMousePressed(evt);
            }
        });
        jpdContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpdContraseniaActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar.setText("Iniciar sesion");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("");

        javax.swing.GroupLayout pnlInicioSesionLayout = new javax.swing.GroupLayout(pnlInicioSesion);
        pnlInicioSesion.setLayout(pnlInicioSesionLayout);
        pnlInicioSesionLayout.setHorizontalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntrar))
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(lblLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContrase)
                            .addComponent(jpdContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(lblUsuario)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))
                        .addGap(109, 109, 109)))
                .addGap(38, 38, 38))
        );
        pnlInicioSesionLayout.setVerticalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblUsuario)
                .addGap(14, 14, 14)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(57, 57, 57))
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblContrase)
                        .addGap(18, 18, 18)
                        .addComponent(jpdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addComponent(btnEntrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 860, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/20230601_122857.jpg"))); // NOI18N
        pnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 1500, 1190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String usuario = txtUsuario.getText();
        char[] contra = jpdContrasenia.getPassword();
        String contrasenia = String.valueOf(contra);
        boolean guardia = false, administrativo = false;
        boolean vacioU = usuario.compareTo("") != 0 && usuario.compareTo("Nombre de usuario") != 0;
        boolean vacioC = contrasenia.compareTo("") != 0 && contrasenia.compareTo("defecto") != 0;
        
        if(vacioU && vacioC){
            guardia = metodos.encontrarGurdia(usuario, contrasenia);
            administrativo = metodos.encontrarAdministrativo(usuario, contrasenia);
            if(guardia){
                System.out.println("Es guardia");
                pantallaGuardia.setVisible(true);
                pantallaGuardia.setLocationRelativeTo(null);
                this.dispose();
            }
            else if(administrativo){
                System.out.println("Es administrativo");
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuario Invalido");
                limpiar();
            }
        }
        else if(!vacioU && !vacioC){
            JOptionPane.showMessageDialog(null, "Ingresa los campos");
        }
        else if(!vacioC){
            JOptionPane.showMessageDialog(null, "Ingresa una contaseña");
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingresa un usuario");
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jpdContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpdContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpdContraseniaActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        String campoUsuario  = txtUsuario.getText();
        String campoContrasenia = String.valueOf(jpdContrasenia.getPassword());
        
        boolean vacio = campoContrasenia.compareTo("") == 0;
        boolean defectoT = campoUsuario.compareTo("Nombre de usuario") == 0;
        
        if(defectoT){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        
        if(vacio){
            jpdContrasenia.setForeground(this.defecto);
            jpdContrasenia.setText("defecto");
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void jpdContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpdContraseniaMousePressed
        String campoUsuario  = txtUsuario.getText();
        String campoContrasenia = String.valueOf(jpdContrasenia.getPassword());
        
        boolean vacio = campoUsuario.compareTo("") == 0;
        boolean defectoT = campoContrasenia.compareTo("defecto") == 0;
        
        if(defectoT){
            jpdContrasenia.setText("");
            jpdContrasenia.setForeground(Color.black);
        }
        
        if(vacio){
            txtUsuario.setForeground(this.defecto);
            txtUsuario.setText("Nombre de usuario");
        }
    }//GEN-LAST:event_jpdContraseniaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpdContrasenia;
    private javax.swing.JLabel lblContrase;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlInicioSesion;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
