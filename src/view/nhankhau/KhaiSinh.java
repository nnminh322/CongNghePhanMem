/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.nhankhau;

import com.toedter.calendar.JDateChooser;
import controller.NhanKhauController.KhaiSinhController;
import controller.NhanKhauController.ThemNhanKhauController;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import model.HoKhau;
import model.NhanKhau;
import view.QuanLy;

/**
 *
 * @author nnminh322
 */
public class KhaiSinh extends javax.swing.JFrame {

    /**
     * Creates new form CitizenView
     */
    public KhaiSinh() {
        initComponents();
        khoa();
    }

    public KhaiSinh(QuanLy quanLy) {
        this.quanLy = quanLy;
        initComponents();
        khoa();
        this.khaiSinhController = new KhaiSinhController(this);
        ActionListener action = new KhaiSinhController(this);
        this.jButton_huy.addActionListener(action);
        this.jButton_kiemTra.addActionListener(action);
        this.jButton_luu.addActionListener(action);
    }

    public void khoa() {
        this.jTextField_quanHeVoiChuHo.setEditable(false);
        this.jTextField_hoVaTen.setEditable(false);
        this.jTextField_biDanh.setEditable(false);
        this.jDateChooser_ngaySinh.setEnabled(false);
        this.jTextField_gioiTinh.setEditable(false);
        this.jTextField_noiSinh.setEditable(false);
        this.jTextField_nguyenQuan.setEditable(false);
        this.jTextField_danToc.setEditable(false);
        this.jButton_luu.setEnabled(false);
    }

    public void mo() {
        this.jTextField_maHoKhau.setEditable(false);
        this.jTextField_quanHeVoiChuHo.setEditable(true);
        this.jTextField_hoVaTen.setEditable(true);
        this.jTextField_biDanh.setEditable(true);
        this.jDateChooser_ngaySinh.setEnabled(true);
        this.jTextField_gioiTinh.setEditable(true);
        this.jTextField_noiSinh.setEditable(true);
        this.jTextField_nguyenQuan.setEditable(true);
        this.jTextField_danToc.setEditable(true);
        this.jButton_luu.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_hoVaTen = new javax.swing.JTextField();
        jTextField_biDanh = new javax.swing.JTextField();
        jTextField_gioiTinh = new javax.swing.JTextField();
        jTextField_noiSinh = new javax.swing.JTextField();
        jTextField_nguyenQuan = new javax.swing.JTextField();
        jTextField_danToc = new javax.swing.JTextField();
        jTextField_quanHeVoiChuHo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField_maHoKhau = new javax.swing.JTextField();
        jButton_kiemTra = new javax.swing.JButton();
        jDateChooser_ngaySinh = new com.toedter.calendar.JDateChooser();
        jButton_luu = new javax.swing.JButton();
        jButton_huy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Quan hệ với chủ hộ:");

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Bí danh");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Nơi sinh");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Nguyên quán");

        jLabel8.setText("Dân tộc");

        jTextField_hoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hoVaTenActionPerformed(evt);
            }
        });

        jTextField_gioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_gioiTinhActionPerformed(evt);
            }
        });

        jTextField_quanHeVoiChuHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_quanHeVoiChuHoActionPerformed(evt);
            }
        });

        jLabel15.setText("Mã hộ khẩu");

        jButton_kiemTra.setText("Kiểm tra");

        jButton_luu.setText("Lưu");
        jButton_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_luuActionPerformed(evt);
            }
        });

        jButton_huy.setText("Huỷ");
        jButton_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_huyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGap(112, 112, 112)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateChooser_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_noiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_biDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_hoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_quanHeVoiChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_maHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addGap(93, 93, 93)
                                    .addComponent(jTextField_nguyenQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_luu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_kiemTra)
                    .addComponent(jTextField_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_huy))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_maHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_kiemTra))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_quanHeVoiChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_hoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_biDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jTextField_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_noiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_nguyenQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_danToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_luu)
                    .addComponent(jButton_huy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_quanHeVoiChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_quanHeVoiChuHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_quanHeVoiChuHoActionPerformed

    private void jTextField_hoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hoVaTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hoVaTenActionPerformed

    private void jTextField_gioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_gioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_gioiTinhActionPerformed

    private void jButton_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_huyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_huyActionPerformed

    private void jButton_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_luuActionPerformed
        // TODO add your handling code here:
        this.quanLy.hienthi();
    }//GEN-LAST:event_jButton_luuActionPerformed

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
            java.util.logging.Logger.getLogger(KhaiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhaiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhaiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhaiSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhaiSinh().setVisible(true);
            }
        });
    }
    public QuanLy quanLy;
    private NhanKhau nhanKhau;
    private KhaiSinhController khaiSinhController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_huy;
    private javax.swing.JButton jButton_kiemTra;
    private javax.swing.JButton jButton_luu;
    private com.toedter.calendar.JDateChooser jDateChooser_ngaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField_biDanh;
    private javax.swing.JTextField jTextField_danToc;
    private javax.swing.JTextField jTextField_gioiTinh;
    private javax.swing.JTextField jTextField_hoVaTen;
    private javax.swing.JTextField jTextField_maHoKhau;
    private javax.swing.JTextField jTextField_nguyenQuan;
    private javax.swing.JTextField jTextField_noiSinh;
    private javax.swing.JTextField jTextField_quanHeVoiChuHo;
    // End of variables declaration//GEN-END:variables

    public NhanKhau getNhanKhau() {
        return nhanKhau;
    }

    public void setNhanKhau(NhanKhau nhanKhau) {
        this.nhanKhau = nhanKhau;
    }

    public JDateChooser getjDateChooser_ngaySinh() {
        return jDateChooser_ngaySinh;
    }

    public void setjDateChooser_ngaySinh(JDateChooser jDateChooser_ngaySinh) {
        this.jDateChooser_ngaySinh = jDateChooser_ngaySinh;
    }

    public JTextField getjTextField_biDanh() {
        return jTextField_biDanh;
    }

    public void setjTextField_biDanh(JTextField jTextField_biDanh) {
        this.jTextField_biDanh = jTextField_biDanh;
    }

    public JTextField getjTextField_danToc() {
        return jTextField_danToc;
    }

    public void setjTextField_danToc(JTextField jTextField_danToc) {
        this.jTextField_danToc = jTextField_danToc;
    }

    public JTextField getjTextField_gioiTinh() {
        return jTextField_gioiTinh;
    }

    public void setjTextField_gioiTinh(JTextField jTextField_gioiTinh) {
        this.jTextField_gioiTinh = jTextField_gioiTinh;
    }

    public JTextField getjTextField_hoVaTen() {
        return jTextField_hoVaTen;
    }

    public void setjTextField_hoVaTen(JTextField jTextField_hoVaTen) {
        this.jTextField_hoVaTen = jTextField_hoVaTen;
    }

    public JTextField getjTextField_maHoKhau() {
        return jTextField_maHoKhau;
    }

    public void setjTextField_maHoKhau(JTextField jTextField_maHoKhau) {
        this.jTextField_maHoKhau = jTextField_maHoKhau;
    }

    public JTextField getjTextField_nguyenQuan() {
        return jTextField_nguyenQuan;
    }

    public void setjTextField_nguyenQuan(JTextField jTextField_nguyenQuan) {
        this.jTextField_nguyenQuan = jTextField_nguyenQuan;
    }

    public JTextField getjTextField_noiSinh() {
        return jTextField_noiSinh;
    }

    public void setjTextField_noiSinh(JTextField jTextField_noiSinh) {
        this.jTextField_noiSinh = jTextField_noiSinh;
    }

    public JTextField getjTextField_quanHeVoiChuHo() {
        return jTextField_quanHeVoiChuHo;
    }

    public void setjTextField_quanHeVoiChuHo(JTextField jTextField_quanHeVoiChuHo) {
        this.jTextField_quanHeVoiChuHo = jTextField_quanHeVoiChuHo;
    }

}
