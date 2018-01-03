package UserInterfacesSF;

import EntidadesSF.Cliente;
import ManejadoresSF.ManejadorCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class cliente extends javax.swing.JFrame {
    ManejadorCliente manejadorCliente = new ManejadorCliente();
    DefaultTableModel clientModel = new DefaultTableModel();
    ResultSet rs;   
    
    public cliente() {
        initComponents();
        tb_cliente.setModel(clientModel);
        clientModel.setColumnIdentifiers(new Object[]{"Id","Cédula","Nombre","Teléfono","Dirección"});
        rs = manejadorCliente.listar();
        try {
            while (rs.next()) {
                clientModel.addRow(new Object[]{rs.getInt("id"),rs.getString("cedula"),rs.getString("nombre"),rs.getString("telefono"),rs.getString("direccion")});
                clientModel.fireTableDataChanged();
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        tb_cliente.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tb_cliente.getSelectedRow() != -1){
                    int fila = tb_cliente.getSelectedRow();
                    txt_cedula.setText(tb_cliente.getValueAt(fila, 1).toString());
                    txt_nombre.setText(tb_cliente.getValueAt(fila, 2).toString());
                    txt_telefono.setText(tb_cliente.getValueAt(fila, 3).toString());
                    txt_direccion.setText(tb_cliente.getValueAt(fila, 4).toString());
                    clientModel.fireTableDataChanged();
                }
            }
            
        });
        
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Dirección: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 20));

        jLabel2.setText("Cédula: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        jLabel3.setText("Nombre: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 20));

        jLabel4.setText("Teléfono: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 290, -1));
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, -1));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 290, -1));
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, -1));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, -1));

        btn_eliminar.setText("Eliminar");
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 80, -1));

        btn_actualizar.setText("Actualizar");
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 120));

        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cédula", "Nombre", "Teléfono", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_cliente);
        if (tb_cliente.getColumnModel().getColumnCount() > 0) {
            tb_cliente.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 560, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
        String cedula = txt_cedula.getText();
        String nombre = txt_nombre.getText();
        String telefono = txt_telefono.getText();
        String direccion = txt_direccion.getText();
        
        Cliente cliente = new Cliente(cedula, nombre, telefono, direccion);
        manejadorCliente.crear(cliente);
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_telefono.setText("");
        txt_direccion.setText("");
        
    }//GEN-LAST:event_btn_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new cliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_cliente;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
