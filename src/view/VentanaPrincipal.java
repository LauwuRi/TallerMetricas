package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Clase con una interfaz grafica principalmente autogenerada
 * @author * Miguel Angel Naranjo Joya * Laura Andrea Riobueno Rincon * Cristian
 * Camilo Tuso Mozo
 *
 * @version 2.0 25/02/2024
 *
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();

    }
    DefaultTableModel tabla;

    /**
     * Creates new form Interfaz
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jBtnCrear = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jTFFechaNacimiento = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInstructores = new javax.swing.JTable();
        jBTNBack = new javax.swing.JButton();
        jBTNMostrar = new javax.swing.JButton();
        jTFCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATENEA");

        jPBackground.setBackground(new java.awt.Color(255, 255, 153));
        jPBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLTitulo.setText("Manejo datos de instructores");
        jPBackground.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 6, -1, 49));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 119, 27));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Direccion");
        jPBackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, 119, 32));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefono");
        jPBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 119, 27));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de nacimiento");
        jPBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 119, 27));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cedula");
        jPBackground.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 119, 32));
        jPBackground.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 160, -1));

        jBtnCrear.setBackground(new java.awt.Color(51, 255, 51));
        jBtnCrear.setText("Crear");
        jBtnCrear.setBorder(null);
        jPBackground.add(jBtnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 90, 30));

        jbtnBuscar.setBackground(new java.awt.Color(0, 0, 102));
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.setBorder(null);
        jPBackground.add(jbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 90, 30));

        jbtnModificar.setBackground(new java.awt.Color(255, 255, 0));
        jbtnModificar.setText("Modificar");
        jbtnModificar.setBorder(null);
        jPBackground.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 90, 30));

        jbtnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorder(null);
        jPBackground.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 90, 30));
        jPBackground.add(jTFFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 160, -1));
        jPBackground.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 160, -1));
        jPBackground.add(jTFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 690, 160, -1));
        jPBackground.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 160, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTInstructores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "F. Nacimiento", "Direccion", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTInstructores);

        jPBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 580, 330));

        jBTNBack.setBackground(new java.awt.Color(0, 0, 204));
        jBTNBack.setForeground(new java.awt.Color(255, 255, 255));
        jBTNBack.setText("Volver");
        jBTNBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNBackActionPerformed(evt);
            }
        });
        jPBackground.add(jBTNBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 90, 40));

        jBTNMostrar.setBackground(new java.awt.Color(102, 0, 204));
        jBTNMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jBTNMostrar.setText("Mostrar");
        jPBackground.add(jBTNMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 90, 30));

        jTFCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCedulaActionPerformed(evt);
            }
        });
        jPBackground.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 160, 20));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Correo");
        jPBackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 690, 119, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTNBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTNBackActionPerformed

    private void jTFCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCedulaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showMsg(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBTNBack;
    public javax.swing.JButton jBTNMostrar;
    public javax.swing.JButton jBtnCrear;
    public javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPBackground;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTFCedula;
    public javax.swing.JTextField jTFCorreo;
    public javax.swing.JTextField jTFDireccion;
    public javax.swing.JTextField jTFFechaNacimiento;
    public javax.swing.JTextField jTFNombre;
    public javax.swing.JTextField jTFTelefono;
    public javax.swing.JTable jTInstructores;
    public javax.swing.JButton jbtnBuscar;
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnModificar;
    // End of variables declaration//GEN-END:variables

    //Metodo que permite actualizar la tabla
    public void actualizarTabla(Object[] instructor) {
        tabla = (DefaultTableModel) jTInstructores.getModel();
        tabla.addRow(instructor);
        jTInstructores.setModel(tabla);
    }

}
