/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Formularios;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import prestamo.Colaboradores.PrestamoClienteColaborador;
import prestamo.Modelo.Prestamo;
import prestamo.Modelo.Validadores.ObjectValidator;
import prestamo.Modelo.Validadores.PrestamoValidator;

/**
 *
 * @author R2D2
 */
public class PrestamoCliente extends javax.swing.JFrame {

    private PrestamoClienteColaborador colaborador;
    
    public PrestamoCliente() {
        initComponents();
        setDatosiniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrestamoCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtMontoPrestamo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ddlCuotas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtTasaInteres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCuotas = new javax.swing.JTable();
        btnCalcularCuotas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ddlClientes = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btnCrearPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(897, 558));

        pnlPrestamoCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrestamoCliente.setPreferredSize(new java.awt.Dimension(897, 558));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Calculadora de préstamo - Sistema Francés");

        jLabel3.setText("Monto total");

        jLabel4.setText("Cuotas");

        ddlCuotas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));

        jLabel5.setText("Tasa de interés mensual");

        jLabel6.setText("%");

        jtCuotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtCuotas);

        btnCalcularCuotas.setText("Calcular");
        btnCalcularCuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularCuotasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 60));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo préstamo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("Cliente");

        btnCrearPrestamo.setText("Crear Prestamo");
        btnCrearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrestamoClienteLayout = new javax.swing.GroupLayout(pnlPrestamoCliente);
        pnlPrestamoCliente.setLayout(pnlPrestamoClienteLayout);
        pnlPrestamoClienteLayout.setHorizontalGroup(
            pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrestamoClienteLayout.createSequentialGroup()
                .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPrestamoClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCrearPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrestamoClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrestamoClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPrestamoClienteLayout.createSequentialGroup()
                                .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ddlClientes, 0, 185, Short.MAX_VALUE)
                                    .addComponent(txtMontoPrestamo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrestamoClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ddlCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTasaInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(167, 167, 167))
                                    .addComponent(btnCalcularCuotas, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        pnlPrestamoClienteLayout.setVerticalGroup(
            pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrestamoClienteLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMontoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ddlCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTasaInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrestamoClienteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnCalcularCuotas))
                    .addGroup(pnlPrestamoClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrestamoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrestamoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrestamoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularCuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCuotasActionPerformed
        colaborador.reiniciarCalculo();
        prestamo.Math math = colaborador.getMath();
        math.setInteresTaza(new BigDecimal(this.txtTasaInteres.getText()));
        math.setValorActual(new BigDecimal(this.txtMontoPrestamo.getText()));
        math.setPeriodos(new BigDecimal(ddlCuotas.getSelectedItem().toString()));
        jtCuotas.setVisible(true);
        jtCuotas.setModel(colaborador.getModel());        
    }//GEN-LAST:event_btnCalcularCuotasActionPerformed

    private void btnCrearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPrestamoActionPerformed
        savePrestamo();
    }//GEN-LAST:event_btnCrearPrestamoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrestamoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrestamoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrestamoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrestamoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrestamoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCuotas;
    private javax.swing.JButton btnCrearPrestamo;
    private javax.swing.JComboBox ddlClientes;
    private javax.swing.JComboBox ddlCuotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtCuotas;
    public javax.swing.JPanel pnlPrestamoCliente;
    private javax.swing.JTextField txtMontoPrestamo;
    private javax.swing.JTextField txtTasaInteres;
    // End of variables declaration//GEN-END:variables

    private void setDatosiniciales() {
        colaborador = new PrestamoClienteColaborador();        
        jtCuotas.setVisible(false);
        fillCombo();
    }

    private void fillCombo() {
        Commons.loadCombo(ddlClientes, colaborador.getClientes());
    }

    private void savePrestamo() {
        Prestamo prestamo = getPrestamoFormulario();
        ObjectValidator prestamoValidator = new PrestamoValidator(prestamo);
        String message = "Por favor corrija los siguientes errores: \n";
        if(prestamoValidator.isIsValid())
            colaborador.Save(prestamo);
        else{
            message += prestamoValidator.getMessage();
            JOptionPane.showMessageDialog(rootPane, message, "Mensaje de Error", 1);
        }
            
        colaborador.Save(prestamo);
    }

    private Prestamo getPrestamoFormulario() {
        Prestamo p = new Prestamo();
        p.setMontoTotal(!txtMontoPrestamo.getText().isEmpty() ? new BigDecimal(txtMontoPrestamo.getText()) : BigDecimal.ZERO);
        p.setInteres(!txtTasaInteres.getText().isEmpty() ? new BigDecimal(txtTasaInteres.getText()) : BigDecimal.ZERO);
        p.setCuotas(colaborador.getListaCuotasSet());
        p.setCliente(colaborador.getClienteById(((ComboItem)ddlClientes.getSelectedItem()).getKey()));
        return p;
    }
}