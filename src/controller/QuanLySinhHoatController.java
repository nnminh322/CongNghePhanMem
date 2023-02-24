/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CuocHopDAO;
import dao.DanhSachThamGiaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.CuocHop;
import model.DanhSachThamGia;
import view.QuanLySinhHoat;
import view.sinhhoat.GhiNhanThamGia;
import view.sinhhoat.HienThiDanhSachThamGia;
import view.sinhhoat.ThongTinCuocHop;

/**
 *
 * @author nnminh322
 */
public class QuanLySinhHoatController implements ActionListener {

    private QuanLySinhHoat quanLySinhHoat;
    private ThongTinCuocHop thongTinCuocHop;
    private GhiNhanThamGia ghiNhanThamGia;
    private HienThiDanhSachThamGia hienThiDanhSachThamGia;

    public QuanLySinhHoatController(QuanLySinhHoat quanLySinhHoat) {
        this.quanLySinhHoat = quanLySinhHoat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lên lịch cuộc họp")) {
            thongTinCuocHop = new ThongTinCuocHop(this.quanLySinhHoat);
            thongTinCuocHop.setTitle(actionCommand);
            thongTinCuocHop.setVisible(true);
        }

        if (actionCommand.equals("Sửa thông tin")) {
            int selected = this.quanLySinhHoat.getjTable_lichHop().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(quanLySinhHoat, "Bạn chưa chọn cuộc họp");
            } else {
                thongTinCuocHop = new ThongTinCuocHop(this.quanLySinhHoat, this.hienthiCuocHop().get(selected));
                thongTinCuocHop.setTitle(actionCommand);
                thongTinCuocHop.setVisible(true);
            }
        }
        if (actionCommand.equals("Sửa thông tin")) {
            int selected = this.quanLySinhHoat.getjTable_lichHop().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(quanLySinhHoat, "Bạn chưa chọn cuộc họp");
            } else {
                thongTinCuocHop = new ThongTinCuocHop(this.quanLySinhHoat, this.hienthiCuocHop().get(selected));
                thongTinCuocHop.setTitle(actionCommand);
                thongTinCuocHop.setVisible(true);
            }
        }

        if (actionCommand.equals("Ghi nhận tham gia")) {
            int selected = this.quanLySinhHoat.getjTable_lichHop().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(quanLySinhHoat, "Bạn chưa chọn cuộc họp");
            } else {
                ghiNhanThamGia = new GhiNhanThamGia(quanLySinhHoat, this.hienthiCuocHop().get(selected).getMaCuocHop());
                ghiNhanThamGia.setTitle(actionCommand);
                ghiNhanThamGia.setVisible(true);
            }
        }

        if (actionCommand.equals("Danh sách tham gia")) {
            int selected = this.quanLySinhHoat.getjTable_lichHop().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(hienThiDanhSachThamGia, "Bạn chưa chọn cuộc họp");
            } else {
                hienThiDanhSachThamGia = new HienThiDanhSachThamGia(quanLySinhHoat, this.hienthiCuocHop().get(selected).getMaCuocHop());
                hienThiDanhSachThamGia.setTitle(actionCommand);
                hienThiDanhSachThamGia.setVisible(true);
            }
        }

    }

    public ArrayList<CuocHop> hienthiCuocHop() {
        return CuocHopDAO.getInstance().selectAll();
    }

    public ArrayList<DanhSachThamGia> hienthiThongKe() {
        String Condition = "SELECT MaHoKhau, TenChuHo, COUNT(*) as SoLanThamGiaCuocHop FROM ThamGiaCuocHop GROUP BY MaHoKhau, TenChuHo ORDER BY COUNT(*) DESC;";
        return DanhSachThamGiaDAO.getInstance().find(Condition);
    }

}
