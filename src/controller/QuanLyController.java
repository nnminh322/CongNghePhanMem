/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import dao.TamTruDAO;
import dao.TamVangDAO;
import dao.ThongKeDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.NhanKhau;
import model.TamTru;
import model.TamVang;
import model.ThongKe;
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
        if (actionCommand.equals("Tìm kiếm hộ khẩu")) {
            if (quanlyView.getjComboBox_timKiemHoKhau().getSelectedItem().equals("Chủ hộ")) {
                String Condition = "`hoTenChuHo` LIKE '%" + quanlyView.getjTextField_TuKhoaHoKhau().getText() + "%'";
                quanlyView.timkiemHoKhau(this.timkiemHoKhau(Condition));

            } else {
                String Condition = "`soHoKhau` LIKE '%" + quanlyView.getjTextField_TuKhoaHoKhau().getText() + "%'";
                quanlyView.timkiemHoKhau(this.timkiemHoKhau(Condition));
            }
        }
        if (actionCommand.equals("Tìm kiếm nhân khẩu")) {
            if (quanlyView.getjComboBox_timKiemNhanKhau().getSelectedItem().equals("CCCD")) {
                String Condition = "`CCCD` LIKE '%" + quanlyView.getjTextField_TuKhoaNhanKhau().getText() + "%'";
                quanlyView.timkiemNhanKhau(this.timkiemNhanKhau(Condition));

            } else {
                String Condition = "`hoTen` LIKE '%" + quanlyView.getjTextField_TuKhoaNhanKhau().getText() + "%'";
                quanlyView.timkiemNhanKhau(this.timkiemNhanKhau(Condition));

            }
        }
        if (actionCommand.equals("Thống kê theo độ tuổi và giới tính")) {
            if (!quanlyView.getjComboBox_GioiTinh().getSelectedItem().equals("")) {
                if (quanlyView.getjTextField_TuDoTuoi().getText().equals("") || quanlyView.getjTextField_DenDoTuoi().getText().equals("")) {
                    JOptionPane.showMessageDialog(quanlyView, "Bạn chưa điền thông tin về tuổi cần thống kê");
                } else {
                    quanlyView.thongkeDoTuoiGioiTinh(this.thongkeNgaySinh(quanlyView.getjTextField_TuDoTuoi().getText(), quanlyView.getjTextField_DenDoTuoi().getText(), quanlyView.getjComboBox_GioiTinh().getSelectedItem().toString()));
                }
            } else {
                if (!(quanlyView.getjTextField_TuDoTuoi().getText().equals("") && quanlyView.getjTextField_DenDoTuoi().getText().equals(""))) {
                    JOptionPane.showMessageDialog(quanlyView, "Bạn chưa điền thông tin về giới tính cần thống kê");

                }
            }
        }
        if (actionCommand.equals("Thống kê theo tình trạng cư trú")) {

            if ((quanlyView.getjDateChooser_tuNgay().getDate() == null) || (quanlyView.getjDateChooser_denNgay().getDate() == null) || quanlyView.getjComboBox_TinhTrang().getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(quanlyView, "Bạn chưa điền đầy đủ thông tin");
            } else {
                java.util.Date selectedDate1 = this.quanlyView.getjDateChooser_tuNgay().getDate();
                java.sql.Date tuNgay = java.sql.Date.valueOf(selectedDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

                java.util.Date selectedDate2 = this.quanlyView.getjDateChooser_denNgay().getDate();
                java.sql.Date denNgay = java.sql.Date.valueOf(selectedDate2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

                quanlyView.thongkeCuTru(this.thongkeTamTruTamVang(tuNgay, denNgay, quanlyView.getjComboBox_TinhTrang().getSelectedItem().toString()));
            }

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

    public ArrayList<HoKhau> timkiemHoKhau(String Condition) {
        return HoKhauDAO.getInstance().find(Condition);
    }

    public ArrayList<NhanKhau> timkiemNhanKhau(String Condition) {
        return NhanKhauDAO.getInstance().find(Condition);
    }

    public ArrayList<ThongKe> thongkeTamTruTamVang(java.sql.Date tuNgay, java.sql.Date denNgay, String tinhTrang) {
        String sql = "SELECT NhanKhau.hoTen, NhanKhau.GioiTinh, NhanKhau.soHoKhau, NhanKhau.ngaySinh, \n"
                + "    CASE \n"
                + "        WHEN TamTru.CCCD IS NOT NULL THEN 'tạm trú' \n"
                + "        WHEN TamVang.CCCD IS NOT NULL THEN 'tạm vắng' \n"
                + "        ELSE '' \n"
                + "    END AS 'TinhTrang' \n"
                + "FROM NhanKhau \n"
                + "INNER JOIN (\n"
                + "    SELECT CCCD, TuNgay, DenNgay \n"
                + "    FROM TamTru \n"
                + "    WHERE (TuNgay >= '" + tuNgay + "' AND TuNgay <= '" + denNgay + "') \n"
                + "    UNION \n"
                + "    SELECT CCCD, TuNgay, DenNgay \n"
                + "    FROM TamVang \n"
                + "    WHERE (TuNgay >= '" + tuNgay + "' AND TuNgay <= '" + denNgay + "') \n"
                + ") AS Temp ON NhanKhau.CCCD = Temp.CCCD \n"
                + "LEFT JOIN TamTru ON NhanKhau.CCCD = TamTru.CCCD AND Temp.TuNgay = TamTru.TuNgay AND Temp.DenNgay = TamTru.DenNgay \n"
                + "LEFT JOIN TamVang ON NhanKhau.CCCD = TamVang.CCCD AND Temp.TuNgay = TamVang.TuNgay AND Temp.DenNgay = TamVang.DenNgay \n";
        if (!tinhTrang.equals("Toàn bộ")) {
            String condition = "WHERE \n"
                    + "    (CASE \n"
                    + "        WHEN TamTru.CCCD IS NOT NULL THEN 'tạm trú' \n"
                    + "        WHEN TamVang.CCCD IS NOT NULL THEN 'tạm vắng' \n"
                    + "        ELSE '' \n"
                    + "    END) = '" + tinhTrang + "';";
            sql += condition;

        }
        return ThongKeDAO.getInstance().find(sql);
    }

    public ArrayList<ThongKe> thongkeNgaySinh(String tuTuoi, String denTuoi, String gioiTinh) {
        String sql = "SELECT hoTen, ngaySinh, gioiTinh, soHoKhau, ghiChu AS tinhTrang FROM NhanKhau WHERE YEAR(CURDATE()) - YEAR(ngaySinh) BETWEEN " + tuTuoi + " AND " + denTuoi + "";
        if (!gioiTinh.equals("Toàn bộ")) {
            String condition = " AND gioiTinh = '" + gioiTinh + "'";
            sql += condition;
        }
        return ThongKeDAO.getInstance().find(sql);
    }
}
