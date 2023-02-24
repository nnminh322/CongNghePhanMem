/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.HoKhauController;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.NhanKhau;
import view.hokhau.TachKhau;

/**
 *
 * @author nnminh322
 */
public class TachKhauController implements ActionListener {

    private TachKhau tachKhau;
    private HoKhau hoKhauMoi;

    public TachKhauController(TachKhau tachKhau) {
        this.tachKhau = tachKhau;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {

            if (this.kiemTra(this.tachKhau.getjTextField_soHoKhauMoi().getText()).isEmpty()) {
                this.tachKhau.khoaDuLieu();
            } else {
                JOptionPane.showMessageDialog(tachKhau, "số hộ khẩu đã tồn tại!");
            }
        }
        if (actionCommand.equals("Xác nhận")) {
            JOptionPane.showMessageDialog(tachKhau, "ok");
            
            this.hoKhauMoi = this.tachKhau.getHoKhau();
            this.hoKhauMoi.setHoTenChuHo(this.tachKhau.tenChuHoMoi());
            this.hoKhauMoi.setSoHoKhau(this.tachKhau.maHoKhauMoi());
            this.insert(hoKhauMoi);
            
            for (NhanKhau nhanKhau : this.tachKhau.thanhVienDuocChon()) {
                if (nhanKhau.getHoTen().equals(this.tachKhau.tenChuHoMoi())) {
                    nhanKhau.setQuanHeVoiChuHo("Chủ hộ");
                }
                nhanKhau.setSoHoKhau(this.tachKhau.maHoKhauMoi());
//                System.out.println(nhanKhau.toString());
                this.update(nhanKhau);
            }
            
            JOptionPane.showMessageDialog(tachKhau, "Đã lưu!");
            this.tachKhau.dispose();
        }
    }

    public ArrayList<NhanKhau> hienthiThanhVien(HoKhau hoKhau) {
        String Condition = "NhanKhau.soHoKhau = '" + hoKhau.getSoHoKhau() + "'";
        return NhanKhauDAO.getInstance().find(Condition);
    }

    public ArrayList<HoKhau> kiemTra(String soHoKhau) {
        String Condition = "soHoKhau LIKE '" + soHoKhau + "'";
        return HoKhauDAO.getInstance().find(Condition);
    }

    public int insert(HoKhau hoKhau) {
        return HoKhauDAO.getInstance().insert(hoKhau);
    }

    public int update(NhanKhau nhanKhau) {
        return NhanKhauDAO.getInstance().update(nhanKhau);
    }
}
