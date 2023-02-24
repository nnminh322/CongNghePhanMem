/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhhoat;

import controller.QuanLySinhHoat.DanhSachThamGiaController;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.DanhSachThamGia;
import view.QuanLySinhHoat;

/**
 *
 * @author nnminh322
 */
public class HienThiDanhSachThamGia extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachThamGia
     */
    public HienThiDanhSachThamGia() {
        initComponents();
    }

    public HienThiDanhSachThamGia(QuanLySinhHoat quanLySinhHoat, String maCuocHop) {
        this.quanLySinhHoat = quanLySinhHoat;
        this.maCuocHop = maCuocHop;
        initComponents();
        this.danhSachThamGiaController = new DanhSachThamGiaController(this);
        hienthiDanhSachThamGia();
    }

    public void hienthiDanhSachThamGia() {
        ArrayList<DanhSachThamGia> listDanhSachThamGia = this.danhSachThamGiaController.hienthiDanhSachThamGia(maCuocHop);
        DefaultTableModel model = (DefaultTableModel) jTable_danhSachThamGia.getModel();
        model.setRowCount(0);
        for (DanhSachThamGia danhSachThamGia : listDanhSachThamGia) {
            Object[] row = {
                danhSachThamGia.getMaCuocHop(),
                danhSachThamGia.getMaHoKhau(),
                danhSachThamGia.getChuHo(),};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_danhSachThamGia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable_danhSachThamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã cuộc họp", "Mã hộ khẩu tham gia", "Tên chủ hộ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_danhSachThamGia);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel1.setText("Danh sách hộ tham gia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(560, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HienThiDanhSachThamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HienThiDanhSachThamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HienThiDanhSachThamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HienThiDanhSachThamGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HienThiDanhSachThamGia().setVisible(true);
            }
        });
    }
    public QuanLySinhHoat quanLySinhHoat;
    private DanhSachThamGiaController danhSachThamGiaController;
    private String maCuocHop;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_danhSachThamGia;
    // End of variables declaration//GEN-END:variables

    public JTable getjTable_danhSachThamGia() {
        return jTable_danhSachThamGia;
    }

    public void setjTable_danhSachThamGia(JTable jTable_danhSachThamGia) {
        this.jTable_danhSachThamGia = jTable_danhSachThamGia;
    }

}