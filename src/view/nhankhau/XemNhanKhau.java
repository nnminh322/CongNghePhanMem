/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.nhankhau;

import javax.swing.JTextField;
import model.NhanKhau;
import view.QuanLy;

/**
 *
 * @author nnminh322
 */
public class XemNhanKhau extends javax.swing.JFrame {

    /**
     * Creates new form CitizenView
     */
    public XemNhanKhau() {
        initComponents();
    }

    public XemNhanKhau(QuanLy quanLy, NhanKhau nhanKhau) {
        this.quanLy = quanLy;
        this.nhanKhau = nhanKhau;
        initComponents();
        hienThi();
        khoa();
    }

    public void hienThi() {
        this.jTextField_maHoKhau.setText(nhanKhau.getSoHoKhau());
        this.jTextField_quanHeVoiChuHo.setText(nhanKhau.getQuanHeVoiChuHo());
        this.jTextField_hoVaTen.setText(nhanKhau.getHoTen());
        this.jTextField_biDanh.setText(nhanKhau.getBiDanh());
        this.jTextField_ngaySinh.setText(nhanKhau.getNgaySinh().toString());
        this.jTextField_gioiTinh.setText(nhanKhau.getGioiTinh());
        this.jTextField_noiSinh.setText(nhanKhau.getNoiSinh());
        this.jTextField_nguyenQuan.setText(nhanKhau.getNguyenQuan());
        this.jTextField_danToc.setText(nhanKhau.getDanToc());
        this.jTextField_ngheNghiep.setText(nhanKhau.getNgheNghiep());
        this.jTextField_noiLamViec.setText(nhanKhau.getNoiLamViec());
        this.jTextField_CCCD.setText(nhanKhau.getCCCD());
        if (nhanKhau.getNgayCap() != null) {
            this.jTextField_ngayCap.setText(nhanKhau.getNgayCap().toString());

        }
        this.jTextField_noiCap.setText(nhanKhau.getNoiCap());
        this.jTextField_ghiChu.setText(nhanKhau.getGhiChu());
    }

    public void khoa() {
        this.jTextField_maHoKhau.setEditable(false);
        this.jTextField_quanHeVoiChuHo.setEditable(false);
        this.jTextField_hoVaTen.setEditable(false);
        this.jTextField_biDanh.setEditable(false);
        this.jTextField_ngaySinh.setEditable(false);
        this.jTextField_gioiTinh.setEditable(false);
        this.jTextField_noiSinh.setEditable(false);
        this.jTextField_nguyenQuan.setEditable(false);
        this.jTextField_danToc.setEditable(false);
        this.jTextField_ngheNghiep.setEditable(false);
        this.jTextField_noiLamViec.setEditable(false);
        this.jTextField_CCCD.setEditable(false);
        this.jTextField_ngayCap.setEditable(false);
        this.jTextField_noiCap.setEditable(false);
        this.jTextField_ghiChu.setEditable(false);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_hoVaTen = new javax.swing.JTextField();
        jTextField_biDanh = new javax.swing.JTextField();
        jTextField_gioiTinh = new javax.swing.JTextField();
        jTextField_noiSinh = new javax.swing.JTextField();
        jTextField_nguyenQuan = new javax.swing.JTextField();
        jTextField_danToc = new javax.swing.JTextField();
        jTextField_ngheNghiep = new javax.swing.JTextField();
        jTextField_noiLamViec = new javax.swing.JTextField();
        jTextField_CCCD = new javax.swing.JTextField();
        jTextField_noiCap = new javax.swing.JTextField();
        jTextField_quanHeVoiChuHo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField_maHoKhau = new javax.swing.JTextField();
        jTextField_ngaySinh = new javax.swing.JTextField();
        jTextField_ngayCap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ghiChu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Quan hệ với chủ hộ:");

        jLabel2.setText("Họ và tên");

        jLabel3.setText("Bí danh");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Nơi sinh");

        jLabel6.setText("Giới tính");

        jLabel7.setText("Nguyên quán");

        jLabel8.setText("Dân tộc");

        jLabel10.setText("Nghề nghiệp");

        jLabel11.setText("Nơi làm việc");

        jLabel12.setText("Số CCCD");

        jLabel13.setText("Nơi cấp");

        jLabel14.setText("Ngày cấp");

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

        jLabel9.setText("Ghi chú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_quanHeVoiChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_maHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_hoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_biDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(107, 107, 107)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_noiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_ngaySinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_danToc)
                                            .addComponent(jTextField_nguyenQuan)
                                            .addComponent(jTextField_ngheNghiep)
                                            .addComponent(jTextField_noiLamViec)
                                            .addComponent(jTextField_CCCD)
                                            .addComponent(jTextField_ngayCap, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(jTextField_ghiChu))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jLabel13)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_gioiTinh)
                    .addComponent(jTextField_noiCap, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField_maHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_ngheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_noiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jTextField_noiCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ngayCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(XemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemNhanKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemNhanKhau().setVisible(true);
            }
        });
    }
    public QuanLy quanLy;
    private NhanKhau nhanKhau;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_CCCD;
    private javax.swing.JTextField jTextField_biDanh;
    private javax.swing.JTextField jTextField_danToc;
    private javax.swing.JTextField jTextField_ghiChu;
    private javax.swing.JTextField jTextField_gioiTinh;
    private javax.swing.JTextField jTextField_hoVaTen;
    private javax.swing.JTextField jTextField_maHoKhau;
    private javax.swing.JTextField jTextField_ngayCap;
    private javax.swing.JTextField jTextField_ngaySinh;
    private javax.swing.JTextField jTextField_ngheNghiep;
    private javax.swing.JTextField jTextField_nguyenQuan;
    private javax.swing.JTextField jTextField_noiCap;
    private javax.swing.JTextField jTextField_noiLamViec;
    private javax.swing.JTextField jTextField_noiSinh;
    private javax.swing.JTextField jTextField_quanHeVoiChuHo;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextField_birthplace() {
        return jTextField_noiSinh;
    }

    public void setjTextField_birthplace(JTextField jTextField_birthplace) {
        this.jTextField_noiSinh = jTextField_birthplace;
    }

    public JTextField getjTextField_citizenid() {
        return jTextField_CCCD;
    }

    public void setjTextField_citizenid(JTextField jTextField_citizenid) {
        this.jTextField_CCCD = jTextField_citizenid;
    }

    public JTextField getjTextField_domicile() {
        return jTextField_nguyenQuan;
    }

    public void setjTextField_domicile(JTextField jTextField_domicile) {
        this.jTextField_nguyenQuan = jTextField_domicile;
    }

    public JTextField getjTextField_ethnic() {
        return jTextField_danToc;
    }

    public void setjTextField_ethnic(JTextField jTextField_ethnic) {
        this.jTextField_danToc = jTextField_ethnic;
    }

    public JTextField getjTextField_fullname() {
        return jTextField_hoVaTen;
    }

    public void setjTextField_fullname(JTextField jTextField_fullname) {
        this.jTextField_hoVaTen = jTextField_fullname;
    }

    public JTextField getjTextField_gender() {
        return jTextField_gioiTinh;
    }

    public void setjTextField_gender(JTextField jTextField_gender) {
        this.jTextField_gioiTinh = jTextField_gender;
    }

    public JTextField getjTextField_issuedby() {
        return jTextField_noiCap;
    }

    public void setjTextField_issuedby(JTextField jTextField_issuedby) {
        this.jTextField_noiCap = jTextField_issuedby;
    }

    public JTextField getjTextField_job() {
        return jTextField_ngheNghiep;
    }

    public void setjTextField_job(JTextField jTextField_job) {
        this.jTextField_ngheNghiep = jTextField_job;
    }

    public JTextField getjTextField_nickname() {
        return jTextField_biDanh;
    }

    public void setjTextField_nickname(JTextField jTextField_nickname) {
        this.jTextField_biDanh = jTextField_nickname;
    }

    public JTextField getjTextField_relationwithhouseholdhead() {
        return jTextField_quanHeVoiChuHo;
    }

    public void setjTextField_relationwithhouseholdhead(JTextField jTextField_relationwithhouseholdhead) {
        this.jTextField_quanHeVoiChuHo = jTextField_relationwithhouseholdhead;
    }

    public JTextField getjTextField_workplace() {
        return jTextField_noiLamViec;
    }

    public void setjTextField_workplace(JTextField jTextField_workplace) {
        this.jTextField_noiLamViec = jTextField_workplace;
    }

}
