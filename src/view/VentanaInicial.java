package view;

/**
 *Clase con una interfaz grafica principalmente autogenerada
 * @author migue
 * @version 2.0 25/02/2024
 */
public class VentanaInicial extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicial
     */
    public VentanaInicial() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jBTNInstructor = new javax.swing.JButton();
        jBTNMonitor = new javax.swing.JButton();
        jLTextoIntro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("METRICAS");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBTNInstructor.setBackground(new java.awt.Color(204, 204, 204));
        jBTNInstructor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBTNInstructor.setForeground(new java.awt.Color(0, 0, 0));
        jBTNInstructor.setText("Instructor");
        jBTNInstructor.setBorder(null);
        jBTNInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNInstructorActionPerformed(evt);
            }
        });
        jPanel1.add(jBTNInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 190, 290, 49));

        jBTNMonitor.setBackground(new java.awt.Color(204, 204, 204));
        jBTNMonitor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBTNMonitor.setForeground(new java.awt.Color(0, 0, 0));
        jBTNMonitor.setText("Monitor");
        jBTNMonitor.setBorder(null);
        jBTNMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNMonitorActionPerformed(evt);
            }
        });
        jPanel1.add(jBTNMonitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 290, 49));

        jLTextoIntro.setForeground(new java.awt.Color(0, 0, 0));
        jLTextoIntro.setText("Miguel Angel Naranjo Joya cod. 20201020037 Laura Andrea Riobueno Rincon cod. 20201020040 Cristian Camilo Tuso Mozo cod. 20201020053");
        jPanel1.add(jLTextoIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 63, 690, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Taller Métricas de Software");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 230, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTNInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNInstructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNInstructorActionPerformed

    private void jBTNMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNMonitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNMonitorActionPerformed

    /**
     * @param args the command line arguments
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    // Variables declaration - do not modify                     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBTNInstructor;
    public javax.swing.JButton jBTNMonitor;
    public javax.swing.JLabel jLTextoIntro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
