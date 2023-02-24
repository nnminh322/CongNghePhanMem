/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NhanKhauController;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.NhanKhau;
import view.hokhau.ThemChuHo;
import view.nhankhau.ThemNhanKhau;

/**
 *
 * @author nnminh322
 */
public class ThemNhanKhauController implements ActionListener {

    private ThemNhanKhau themNhanKhau;

    public ThemNhanKhauController(ThemNhanKhau themNhanKhau) {
        this.themNhanKhau = themNhanKhau;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {
            if (!this.kiemTra(this.themNhanKhau.getjTextField_maHoKhau().getText()).isEmpty()) {
                this.themNhanKhau.mo();
            } else {
                JOptionPane.showMessageDialog(themNhanKhau, "Mã hộ khẩu không tồn tại!");
            }
        }
        if (actionCommand.equals("Lưu")) {
            String soHoKhau = this.themNhanKhau.getjTextField_maHoKhau().getText();
            String hoTen = this.themNhanKhau.getjTextField_hoVaTen().getText();
            String biDanh = this.themNhanKhau.getjTextField_biDanh().getText();
            java.util.Date selectedDate1 = this.themNhanKhau.getjDateChooser_ngaySinh().getDate();
            java.sql.Date ngaySinh = java.sql.Date.valueOf(selectedDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            String noiSinh = this.themNhanKhau.getjTextField_noiSinh().getText();
            String gioiTinh = this.themNhanKhau.getjTextField_gioiTinh().getText();
            String nguyenQuan = this.themNhanKhau.getjTextField_nguyenQuan().getText();
            String danToc = this.themNhanKhau.getjTextField_danToc().getText();
            String ngheNghiep = this.themNhanKhau.getjTextField_ngheNghiep().getText();
            String noiLamViec = this.themNhanKhau.getjTextField_noiLamViec().getText();
            String CCCD = this.themNhanKhau.getjTextField_CCCD().getText();
            java.util.Date selectedDate2 = this.themNhanKhau.getjDateChooser_ngayCap().getDate();
            java.sql.Date ngayCap = java.sql.Date.valueOf(selectedDate2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            String noiCap = this.themNhanKhau.getjTextField_noiCap().getText();
            String quanHeVoiChuHo = this.themNhanKhau.getjTextField_quanHeVoiChuHo().getText();

            NhanKhau nhanKhau = new NhanKhau(soHoKhau, hoTen, biDanh, ngaySinh, noiSinh, gioiTinh, nguyenQuan, danToc, ngheNghiep, noiLamViec, CCCD, ngayCap, noiCap, quanHeVoiChuHo);
            this.insert(nhanKhau);

            JOptionPane.showMessageDialog(themNhanKhau, "Đã lưu");
            this.themNhanKhau.dispose();
        }
    }

    public ArrayList<HoKhau> kiemTra(String soHoKhau) {
        String Condition = "soHoKhau LIKE '" + soHoKhau + "'";
        return HoKhauDAO.getInstance().find(Condition);
    }

    public int insert(NhanKhau nhanKhau) {
        return NhanKhauDAO.getInstance().insert(nhanKhau);
    }
}
