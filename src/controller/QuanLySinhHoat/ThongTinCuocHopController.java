/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.QuanLySinhHoat;

import dao.CuocHopDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.CuocHop;
import view.sinhhoat.ThongTinCuocHop;

/**
 *
 * @author nnminh322
 */
public class ThongTinCuocHopController implements ActionListener {

    private ThongTinCuocHop thongTinCuocHop;

    public ThongTinCuocHopController(ThongTinCuocHop thongTinCuocHop) {
        this.thongTinCuocHop = thongTinCuocHop;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        String tittle = thongTinCuocHop.getTitle();
        if (actionCommand.equals("Xác nhận")) {
            String maCuocHop = thongTinCuocHop.getjTextField_maCuocHop().getText();
            String chuDe = thongTinCuocHop.getjTextField_chuDe().getText();
            String thoiGian = thongTinCuocHop.getjTextField_thoiGian().getText();
            String diaDiem = thongTinCuocHop.getjTextField_diaDiem().getText();

            CuocHop cuocHop = new CuocHop(maCuocHop, chuDe, thoiGian, diaDiem);
            if (tittle.equals("Lên lịch cuộc họp")) {
                this.insert(cuocHop);
            }

            if (tittle.equals("Sửa thông tin")) {
                this.update(cuocHop);
            }
            JOptionPane.showMessageDialog(thongTinCuocHop, "Đã lưu");
            this.thongTinCuocHop.dispose();
        }
    }

    public int insert(CuocHop cuocHop) {
        return CuocHopDAO.getInstance().insert(cuocHop);
    }

    public int update(CuocHop cuocHop) {
        return CuocHopDAO.getInstance().update(cuocHop);
    }
}
