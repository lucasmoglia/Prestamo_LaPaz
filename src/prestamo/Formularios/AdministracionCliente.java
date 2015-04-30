/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prestamo.Formularios;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import prestamo.Colaboradores.AdministracionClienteColaborador;
/**
 *
 * @author L0395118
 */
public class AdministracionCliente extends javax.swing.JFrame {
    private AdministracionClienteColaborador colaborador;
    private int idCliente;

    public int getIdCliente() {
        return idCliente;
    }
    
    /**
     * Creates new form Principal
     */
    public AdministracionCliente() {
        initComponents();
        setDatosIniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdministracionClienteForm = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        lblCliente = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlTituloAdministracionCliente = new javax.swing.JPanel();
        lblTituloAdminCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAdministracionClienteForm.setBackground(new java.awt.Color(255, 255, 255));

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtClientes);

        lblCliente.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblCliente.setText("Clientes");

        pnlTituloAdministracionCliente.setBackground(java.awt.Color.black);

        lblTituloAdminCliente.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblTituloAdminCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAdminCliente.setText("Administración de clientes");

        javax.swing.GroupLayout pnlTituloAdministracionClienteLayout = new javax.swing.GroupLayout(pnlTituloAdministracionCliente);
        pnlTituloAdministracionCliente.setLayout(pnlTituloAdministracionClienteLayout);
        pnlTituloAdministracionClienteLayout.setHorizontalGroup(
            pnlTituloAdministracionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloAdministracionClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdminCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloAdministracionClienteLayout.setVerticalGroup(
            pnlTituloAdministracionClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloAdministracionClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdminCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlAdministracionClienteFormLayout = new javax.swing.GroupLayout(pnlAdministracionClienteForm);
        pnlAdministracionClienteForm.setLayout(pnlAdministracionClienteFormLayout);
        pnlAdministracionClienteFormLayout.setHorizontalGroup(
            pnlAdministracionClienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministracionClienteFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdministracionClienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                    .addGroup(pnlAdministracionClienteFormLayout.createSequentialGroup()
                        .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addComponent(pnlTituloAdministracionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAdministracionClienteFormLayout.setVerticalGroup(
            pnlAdministracionClienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministracionClienteFormLayout.createSequentialGroup()
                .addComponent(pnlTituloAdministracionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdministracionClienteForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlAdministracionClienteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        Integer selectedRow = jtClientes.getSelectedRow();
        if (selectedRow !=null){
           idCliente = Integer.parseInt(jtClientes.getValueAt(selectedRow, 0).toString());        
        }
    }//GEN-LAST:event_jtClientesMouseClicked

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
            java.util.logging.Logger.getLogger(AdministracionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdministracionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtClientes;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblTituloAdminCliente;
    public javax.swing.JPanel pnlAdministracionClienteForm;
    private javax.swing.JPanel pnlTituloAdministracionCliente;
    // End of variables declaration//GEN-END:variables

    private void setDatosIniciales() {
        colaborador = new AdministracionClienteColaborador();
        jtClientes.setModel(colaborador.getModel());
        hideFirstColumnTable();
    }
    
    private void hideFirstColumnTable(){
        jtClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        jtClientes.getColumnModel().getColumn(0).setMinWidth(0);
        jtClientes.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
            
    
    
    /*public Component getTableCellEditorComponent(
    JTable table, Object value, boolean isSelected, int row, int column) {
      editButton.setText( value.toString() );
      editButton.setIcon( null );
    }*/
}
