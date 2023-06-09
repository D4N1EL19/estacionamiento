package igu;

import java.util.Date;
import java.util.GregorianCalendar;
import logica.BaseDeDatos;
import logica.Llegada;

public class Estacionamiento1 extends javax.swing.JFrame {

    BaseDeDatos bd;
    
    public Estacionamiento1(BaseDeDatos bd, int num, char tipo) {
        initComponents();
        this.bd = bd;
        this.nA = num;
        this.tipo = tipo;
        txtEspacios.setText(bd.getContEsta1() + " de 80 espacios disponibles");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAnterior = new javax.swing.JLabel();
        pnlSobrepuesto = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblCapacidad = new javax.swing.JLabel();
        txtEspacios = new javax.swing.JTextField();
        lblEntrar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblEst1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAnterior.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblAnterior.setText("Anterior");
        lblAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAnteriorMousePressed(evt);
            }
        });
        jPanel1.add(lblAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        pnlSobrepuesto.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/346339429_9552708478103337_4631547997174124060_n.gif"))); // NOI18N

        lblCapacidad.setFont(new java.awt.Font("Montserrat", 0, 40)); // NOI18N
        lblCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapacidad.setText("Capacidad");

        txtEspacios.setEditable(false);
        txtEspacios.setBackground(new java.awt.Color(255, 255, 255));
        txtEspacios.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        txtEspacios.setText("xx de xx esapcios disponibles");
        txtEspacios.setBorder(null);

        lblEntrar.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lblEntrar.setText("Entrar");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEntrarMousePressed(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSalirMousePressed(evt);
            }
        });

        lblEst1.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        lblEst1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEst1.setText("Estacionamiento 1");

        javax.swing.GroupLayout pnlSobrepuestoLayout = new javax.swing.GroupLayout(pnlSobrepuesto);
        pnlSobrepuesto.setLayout(pnlSobrepuestoLayout);
        pnlSobrepuestoLayout.setHorizontalGroup(
            pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobrepuestoLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobrepuestoLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobrepuestoLayout.createSequentialGroup()
                        .addGroup(pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobrepuestoLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(163, 163, 163))))
        );
        pnlSobrepuestoLayout.setVerticalGroup(
            pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobrepuestoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblEst1)
                .addGap(64, 64, 64)
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(lblCapacidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalir)
                    .addComponent(lblEntrar))
                .addGap(58, 58, 58))
        );

        jPanel1.add(pnlSobrepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 540, 630));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/fotolindaaa.jpeg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, 1180, 940));

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

    private void lblAnteriorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnteriorMousePressed
        EntrarSalir regreso = new EntrarSalir(nA, tipo, bd);
        regreso.setVisible(true);
        regreso.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblAnteriorMousePressed

    private void lblEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMousePressed
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(new Date());
        
        bd.llegadas.add(new Llegada(calendario,nA,tipo));
        bd.setContEsta1(bd.getContEsta1() + 1);
        
        Guardia pantallGuardia = new Guardia(bd);
        pantallGuardia.setVisible(true);
        pantallGuardia.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblEntrarMousePressed

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
        bd.setContEsta1(bd.getContEsta1() - 1);
        
        Guardia pantallGuardia = new Guardia(bd);
        pantallGuardia.setVisible(true);
        pantallGuardia.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblSalirMousePressed
    
    //variables globales
    int nA = 0;
    char tipo = '\n';
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnterior;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblEst1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JPanel pnlSobrepuesto;
    private javax.swing.JTextField txtEspacios;
    // End of variables declaration//GEN-END:variables
}
