/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NhanKhauController;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.NhanKhau;
import view.nhankhau.KhaiSinh;

/**
 *
 * @author nnminh322
 */
public class KhaiSinhController implements ActionListener {

    private KhaiSinh khaiSinh;

    public KhaiSinhController(KhaiSinh khaiSinh) {
        this.khaiSinh = khaiSinh;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        NhanKhau nhanKhau = new NhanKhau();
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {
            if (!this.kiemTra(this.khaiSinh.getjTextField_maHoKhau().getText()).isEmpty()) {
                this.khaiSinh.mo();
            } else {
                JOptionPane.showMessageDialog(khaiSinh, "Mã hộ khẩu không tồn tại!");
            }
        }
        if (actionCommand.equals("Lưu")) {
            String soHoKhau = this.khaiSinh.getjTextField_maHoKhau().getText();
            String hoTen = this.khaiSinh.getjTextField_hoVaTen().getText();
            String biDanh = this.khaiSinh.getjTextField_biDanh().getText();
            java.util.Date selectedDate1 = this.khaiSinh.getjDateChooser_ngaySinh().getDate();
            java.sql.Date ngaySinh = java.sql.Date.valueOf(selectedDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            String noiSinh = this.khaiSinh.getjTextField_noiSinh().getText();
            String gioiTinh = this.khaiSinh.getjTextField_gioiTinh().getText();
            String nguyenQuan = this.khaiSinh.getjTextField_nguyenQuan().getText();
            String danToc = this.khaiSinh.getjTextField_danToc().getText();
            String quanHeVoiChuHo = this.khaiSinh.getjTextField_quanHeVoiChuHo().getText();

            nhanKhau = new NhanKhau(soHoKhau, hoTen, biDanh, ngaySinh, noiSinh, gioiTinh, nguyenQuan, danToc, quanHeVoiChuHo);
            this.insert(nhanKhau);

            JOptionPane.showMessageDialog(khaiSinh, "Đã lưu");
            this.khaiSinh.dispose();
        }
    }

    public ArrayList<HoKhau> kiemTra(String soHoKhau) {
        String Condition = "soHoKhau LIKE '" + soHoKhau + "'";
        return HoKhauDAO.getInstance().find(Condition);
    }

    public int insert(NhanKhau nhanKhau) {
        return NhanKhauDAO.getInstance().insert(nhanKhau);
    }

    public int insert(HoKhau hoKhau) {
        return HoKhauDAO.getInstance().insert(hoKhau);
    }
}
