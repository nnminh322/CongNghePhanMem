/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import dao.TamTruDAO;
import dao.TamVangDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.NhanKhau;
import model.TamTru;
import model.TamVang;
import view.hokhau.ChuyenKhau;
import view.nhankhau.KhaiTu;
import view.nhankhau.LichSuThayDoi;
import view.QuanLy;
import view.hokhau.TachKhau;
import view.hokhau.ThemChuHo;
import view.nhankhau.DKTamTru;
import view.nhankhau.DKTamVang;
import view.nhankhau.ThemNhanKhau;
import view.hokhau.XemHoKhau;
import view.nhankhau.KhaiSinh;
import view.nhankhau.XemNhanKhau;

/**
 *
 * @author nnminh322
 */
public class QuanLyController implements ActionListener {

    public QuanLy quanlyView;
    private ChuyenKhau chuyenKhau;
    private ThemNhanKhau themNhanKhau;
    private KhaiTu khaiTu;
    private LichSuThayDoi lichSuThayDoi;
    private TachKhau tachKhau;
    private DKTamTru tamTru;
    private DKTamVang tamVang;
    private XemHoKhau xemHoKhau;
    private XemNhanKhau xemNhanKhau;
    private ThemChuHo themChuHo;
    private KhaiSinh khaiSinh;

    public QuanLyController() {
        super();
    }

    public QuanLyController(QuanLy quanlyView) {
        this.quanlyView = quanlyView;
    }

    public QuanLy getQuanlyView() {
        return quanlyView;
    }

    public void setQuanlyView(QuanLy quanlyView) {
        this.quanlyView = quanlyView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Xem thành viên")) {
            int selected = this.quanlyView.getjTable_HoKhau().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(quanlyView, "Bạn chưa chọn hộ khẩu");
            } else {
                xemHoKhau = new XemHoKhau(quanlyView, quanlyView.getHoKhau(selected));
                xemHoKhau.setTitle(actionCommand);
                xemHoKhau.setVisible(true);
            }

        }
        if (actionCommand.equals("Chuyển đi")) {
            int selected = this.quanlyView.getjTable_HoKhau().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(quanlyView, "Bạn chưa chọn hộ khẩu");
            } else {
                chuyenKhau = new ChuyenKhau(quanlyView, quanlyView.getHoKhau(selected));
                chuyenKhau.setTitle(actionCommand);
                chuyenKhau.setVisible(true);
            }
        }
        if (actionCommand.equals("Tách khẩu")) {
            int selected = this.quanlyView.getjTable_HoKhau().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(quanlyView, "Bạn chưa chọn hộ khẩu");
            } else {
                tachKhau = new TachKhau(quanlyView, quanlyView.getHoKhau(selected));
                tachKhau.setTitle(actionCommand);
                tachKhau.setVisible(true);
            }
        }
        if (actionCommand.equals("Lịch sử thay đổi")) {
            lichSuThayDoi = new LichSuThayDoi(quanlyView);
            lichSuThayDoi.setTitle(actionCommand);
            lichSuThayDoi.setVisible(true);
        }
        if (actionCommand.equals("Thêm nhân khẩu")) {
            themNhanKhau = new ThemNhanKhau(quanlyView);
            themNhanKhau.setTitle(actionCommand);
            themNhanKhau.setVisible(true);
        }

        if (actionCommand.equals("Xem thông tin")) {
            int selected = this.quanlyView.getjTable_NhanKhau().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(tamVang, "Bạn chưa chọn nhân khẩu");
            } else {
                xemNhanKhau = new XemNhanKhau(quanlyView, this.hienthiNhanKhau().get(selected));
                xemNhanKhau.setTitle(actionCommand);
                xemNhanKhau.setVisible(true);
            }
        }
        if (actionCommand.equals("Thêm hộ khẩu")) {
            themChuHo = new ThemChuHo(quanlyView);
            themChuHo.setTitle(actionCommand);
            themChuHo.setVisible(true);
        }
        if (actionCommand.equals("Khai sinh")) {
            khaiSinh = new KhaiSinh(quanlyView);
            khaiSinh.setTitle(actionCommand);
            khaiSinh.setVisible(true);
        }
        if (actionCommand.equals("Khai tử")) {
            int selected = this.quanlyView.getjTable_NhanKhau().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(tamVang, "Bạn chưa chọn nhân khẩu");
            } else {
                khaiTu = new KhaiTu(quanlyView, this.hienthiNhanKhau().get(selected));
                khaiTu.setTitle(actionCommand);
                khaiTu.setVisible(true);

            }
        }
        if (actionCommand.equals("ĐK Tạm trú")) {
            tamTru = new DKTamTru(quanlyView);
            tamTru.setTitle(actionCommand);
            tamTru.setVisible(true);
        }
        if (actionCommand.equals("ĐK Tạm vắng")) {
            tamVang = new DKTamVang(quanlyView);
            tamVang.setTitle(actionCommand);
            tamVang.setVisible(true);
        }
    }

    public ArrayList<NhanKhau> hienthiNhanKhau() {
        return NhanKhauDAO.getInstance().selectAll();
    }

    public ArrayList<HoKhau> hienthiHoKhau() {
        return HoKhauDAO.getInstance().selectAll();
    }

    public ArrayList<TamTru> hienthiTamTru() {
        return TamTruDAO.getInstance().selectAll();
    }

    public ArrayList<TamVang> hienthiTamVang() {
        return TamVangDAO.getInstance().selectAll();
    }
}
