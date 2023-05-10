package igu;

import java.util.ArrayList;
import logica.Administrativo;
import logica.Guardia;

/**
 *
 * @author daniel
 */

public class InicioSesion extends javax.swing.JFrame {

    ///////////////////////////////////////////////////////////////////////////
    //////////////////////////// OBEJTOS //////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    
    ArrayList<Guardia> guardias = new ArrayList<>();
    ArrayList<Administrativo> administrativos = new ArrayList<>();
    
    
    public InicioSesion() {
        initComponents();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    //////////////////////////// METODOS //////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    
    //Verifica si la contraseña y asuario que ingresaron es un guardia
    public boolean encontrarGurdia(String usuario, String contrasenia){
        boolean guardia = false, usua = false, contra = false;
        
        for(int i=0; i<guardias.size(); i++){
            
            if(contrasenia.compareTo(guardias.get(i).getContrasenia()) == 0){
                contra = true;
            }
            
            if(usuario.compareTo(guardias.get(i).getUsuario()) == 0){
                usua = true;
            }
            
            if(contra && usua){
                guardia = true;
                break;
            }
        }
        
        return guardia;
    }
    
    //Verifica si la contraseña y asuario que ingresaron es un administrativo
    public boolean encontrarAdministrativo(String usuario, String contrasenia){
        boolean admi = false, usua = false, contra = false;
        
        for(int i=0; i<administrativos.size(); i++){
            
            if(contrasenia.compareTo(administrativos.get(i).getContrasenia()) == 0){
                contra = true;
            }
            
            if(usuario.compareTo(administrativos.get(i).getUsuario()) == 0){
                usua = true;
            }
            
            if(contra && usua){
                admi = true;
                break;
            }
        }
        
        return admi;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrase = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jpdContrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContrase)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(lblUsuario)
                            .addComponent(jpdContrasenia)))
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
                .addComponent(jpdContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnEntrar)
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        guardias.add(new Guardia("Daniel","Gutierrez","Ramirez",19,8,20004,"DaniSa19","190804","al22760562@ite.edu.mx",0));
        guardias.add(new Guardia("Saul","Martinez","Monge",19,2,20004,"saulikeapro","190204","al22760566@ite.edu.mx",1));
        
        String usuario = txtUsuario.getText(), contra = null;
        char contrasenia[] = jpdContrasenia.getPassword();
        boolean guardia = false, administrativo = false;
        
        contra = contra.valueOf(contrasenia);
        
        guardia = encontrarGurdia(usuario, contra);
        administrativo = encontrarAdministrativo(usuario, contra);
        
        if(guardia){
            //mandamos a llamar la interfaz de guardia
            System.out.println("Es guardia");
        }
        
        if(administrativo){
            //mandamos a llamar la interfaz de administrativo
            System.out.println("Es administrativo");
        }
        
        jpdContrasenia.setText("");
        txtUsuario.setText("");
    }//GEN-LAST:event_btnEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPasswordField jpdContrasenia;
    private javax.swing.JLabel lblContrase;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
