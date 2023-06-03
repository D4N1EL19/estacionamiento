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
        lblX = new javax.swing.JLabel();
        pnlInicioSesion = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContrase = new javax.swing.JLabel();
        jpdContrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblIngresar = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(500, 500));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblX.setForeground(new java.awt.Color(255, 255, 255));
        lblX.setText("X");
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXMousePressed(evt);
            }
        });
        pnlPrincipal.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 730, 20, 20));

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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setToolTipText("");

        lblIngresar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblIngresar.setText("Ingresar");
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblIngresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlInicioSesionLayout = new javax.swing.GroupLayout(pnlInicioSesion);
        pnlInicioSesion.setLayout(pnlInicioSesionLayout);
        pnlInicioSesionLayout.setHorizontalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioSesionLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(62, 62, 62)
                        .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContrase)
                            .addComponent(jpdContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(txtUsuario)
                            .addComponent(lblUsuario)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInicioSesionLayout.createSequentialGroup()
                        .addComponent(lblIngresar)
                        .addGap(53, 53, 53))))
        );
        pnlInicioSesionLayout.setVerticalGroup(
            pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(lblUsuario)
                .addGap(10, 10, 10)
                .addGroup(pnlInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInicioSesionLayout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblContrase)
                        .addGap(18, 18, 18)
                        .addComponent(jpdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(lblIngresar)
                .addGap(33, 33, 33))
        );

        pnlPrincipal.add(pnlInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 720, 520));

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/20230601_122857.jpg"))); // NOI18N
        pnlPrincipal.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -70, 1320, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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

    private void lblIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMousePressed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_lblIngresarMousePressed

    private void lblXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblXMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpdContrasenia;
    private javax.swing.JLabel lblContrase;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel pnlInicioSesion;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
