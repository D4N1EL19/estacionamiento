/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

/**
 *
 * @author danie
 */
public class Estacionamiento1 extends javax.swing.JFrame {

    /**
     * Creates new form Estacionamiento1
     */
    public Estacionamiento1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlSobrepuesto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblEntrar = new javax.swing.JLabel();
        lblEntrar1 = new javax.swing.JLabel();
        lblEst1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat Thin", 0, 18)); // NOI18N
        jLabel4.setText("Anterior");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        pnlSobrepuesto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/346339429_9552708478103337_4631547997174124060_n.gif"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Montserrat Thin", 0, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Capacidad");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Montserrat Thin", 0, 24)); // NOI18N
        jTextField1.setText("xx de xx esapcios disponibles");
        jTextField1.setBorder(null);

        lblEntrar.setFont(new java.awt.Font("Montserrat Thin", 0, 48)); // NOI18N
        lblEntrar.setText("Entrar");

        lblEntrar1.setFont(new java.awt.Font("Montserrat Thin", 0, 48)); // NOI18N
        lblEntrar1.setText("Salir");

        lblEst1.setFont(new java.awt.Font("Montserrat Thin", 0, 24)); // NOI18N
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
                .addComponent(lblEntrar1)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobrepuestoLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobrepuestoLayout.createSequentialGroup()
                        .addGroup(pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEst1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSobrepuestoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(163, 163, 163))))
        );
        pnlSobrepuestoLayout.setVerticalGroup(
            pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobrepuestoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblEst1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(pnlSobrepuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntrar1)
                    .addComponent(lblEntrar))
                .addGap(58, 58, 58))
        );

        jPanel1.add(pnlSobrepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 540, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/persistencia/fotolindaaa.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, 1180, 940));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblEntrar1;
    private javax.swing.JLabel lblEst1;
    private javax.swing.JPanel pnlSobrepuesto;
    // End of variables declaration//GEN-END:variables
}