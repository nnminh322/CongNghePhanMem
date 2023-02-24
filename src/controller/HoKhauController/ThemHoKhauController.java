/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.HoKhauController;

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
import view.hokhau.ThemHoKhau;
import view.nhankhau.ThemNhanKhau;

/**
 *
 * @author nnminh322
 */
public class ThemHoKhauController implements ActionListener {

    private ThemChuHo themChuHo;
    private ThemHoKhau themHoKhau;

    public ThemChuHo getThemChuHo() {
        return themChuHo;
    }

    public void setThemChuHo(ThemChuHo themChuHo) {
        this.themChuHo = themChuHo;
    }

    public ThemHoKhauController(ThemChuHo themChuHo) {
        this.themChuHo = themChuHo;
    }

    public ThemHoKhauController(ThemHoKhau themHoKhau) {
        this.themHoKhau = themHoKhau;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        NhanKhau chuHo = new NhanKhau();
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {
            if (this.kiemTra(this.themChuHo.getjTextField_maHoKhau().getText()).isEmpty()) {
                this.themChuHo.mo();
            } else {
                JOptionPane.showMessageDialog(themChuHo, "Mã hộ khẩu đã tồn tại!");
            }
        }
        if (actionCommand.equals("Lưu")) {
            String soHoKhau = this.themChuHo.getjTextField_maHoKhau().getText();
            String hoTen = this.themChuHo.getjTextField_hoVaTen().getText();
            String biDanh = this.themChuHo.getjTextField_biDanh().getText();
            java.util.Date selectedDate1 = this.themChuHo.getjDateChooser_ngaySinh().getDate();
            java.sql.Date ngaySinh = java.sql.Date.valueOf(selectedDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            String noiSinh = this.themChuHo.getjTextField_noiSinh().getText();
            String gioiTinh = this.themChuHo.getjTextField_gioiTinh().getText();
            String nguyenQuan = this.themChuHo.getjTextField_nguyenQuan().getText();
            String danToc = this.themChuHo.getjTextField_danToc().getText();
            String ngheNghiep = this.themChuHo.getjTextField_ngheNghiep().getText();
            String noiLamViec = this.themChuHo.getjTextField_noiLamViec().getText();
            String CCCD = this.themChuHo.getjTextField_CCCD().getText();
            java.util.Date selectedDate2 = this.themChuHo.getjDateChooser_ngayCap().getDate();
            java.sql.Date ngayCap = java.sql.Date.valueOf(selectedDate2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            String noiCap = this.themChuHo.getjTextField_noiCap().getText();
            String quanHeVoiChuHo = this.themChuHo.getjTextField_quanHeVoiChuHo().getText();

            chuHo = new NhanKhau(soHoKhau, hoTen, biDanh, ngaySinh, noiSinh, gioiTinh, nguyenQuan, danToc, ngheNghiep, noiLamViec, CCCD, ngayCap, noiCap, quanHeVoiChuHo);
            this.insert(chuHo);

//            JOptionPane.showMessageDialog(themChuHo, "Đã lưu");
            this.themChuHo.dispose();

            this.themHoKhau = new ThemHoKhau(this.themChuHo.quanLy, chuHo);
            this.themHoKhau.setVisible(true);
        }
        if (actionCommand.equals("Xác nhận")) {
            String soHoKhau = this.themHoKhau.getjTextField_maHoKhau().getText();
            String hoTenChuHo = this.themHoKhau.getjTextField_chuHo().getText();
            int soNha = Integer.parseInt(this.themHoKhau.getjTextField_soNha().getText());
            String duongPho = this.themHoKhau.getjTextField_duongPho().getText();
            String phuongXa = this.themHoKhau.getjTextField_phuongXa().getText();
            String quanHuyen = this.themHoKhau.getjTextField_quanHuyen().getText();

            HoKhau hoKhau = new HoKhau(soHoKhau, hoTenChuHo, soNha, duongPho, phuongXa, quanHuyen);
            this.insert(hoKhau);
            this.themHoKhau.dispose();
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
