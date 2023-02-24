/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.QuanLySinhHoat;

import dao.DanhSachThamGiaDAO;
import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DanhSachThamGia;
import model.HoKhau;
import model.NhanKhau;
import view.sinhhoat.GhiNhanThamGia;

/**
 *
 * @author nnminh322
 */
public class GhiNhanThamGiaController implements ActionListener {

    private GhiNhanThamGia ghiNhanThamGia;

    public GhiNhanThamGiaController(GhiNhanThamGia ghiNhanThamGia) {
        this.ghiNhanThamGia = ghiNhanThamGia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {
            if (this.kiemTra(this.ghiNhanThamGia.getjTextField_maHoKhau().getText()).isEmpty()) {
                JOptionPane.showMessageDialog(ghiNhanThamGia, "số hộ khẩu không tồn tại!");
            } else {
                String chuHo = this.kiemTra(this.ghiNhanThamGia.getjTextField_maHoKhau().getText()).get(0).getHoTenChuHo();
                this.ghiNhanThamGia.getjTextField_chuHo().setText(chuHo);
                this.ghiNhanThamGia.getjTextField_chuHo().setEditable(false);
            }
        }
        if (actionCommand.equals("Ghi nhân tham gia")) {
            String maCuocHop = this.ghiNhanThamGia.getjTextField_maCuocHop().getText();
            String maHoKhau = this.ghiNhanThamGia.getjTextField_maHoKhau().getText();
            String chuHo = this.ghiNhanThamGia.getjTextField_chuHo().getText();

            DanhSachThamGia danhSachThamGia = new DanhSachThamGia(maCuocHop, maHoKhau, chuHo);

            this.insert(danhSachThamGia);
            JOptionPane.showMessageDialog(ghiNhanThamGia, "Đã ghi nhân tham gia!");
            this.ghiNhanThamGia.dispose();
        }
    }

    public int insert(DanhSachThamGia danhSachThamGia) {
        return new DanhSachThamGiaDAO().getInstance().insert(danhSachThamGia);
    }

    public ArrayList<HoKhau> kiemTra(String soHoKhau) {
        String Condition = "soHoKhau LIKE '" + soHoKhau + "'";
        return HoKhauDAO.getInstance().find(Condition);
    }
}
