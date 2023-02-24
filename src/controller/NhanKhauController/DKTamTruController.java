/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NhanKhauController;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import dao.TamTruDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.NhanKhau;
import model.TamTru;
import view.nhankhau.DKTamTru;

/**
 *
 * @author nnminh322
 */
public class DKTamTruController implements ActionListener {

    private DKTamTru dKTamTru;
    private TamTru tamTru;

    public DKTamTruController(DKTamTru dKTamTru) {
        this.dKTamTru = dKTamTru;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {
            if (!this.kiemTra(this.dKTamTru.getjTextField_CCCD().getText()).isEmpty()) {
                this.dKTamTru.mo();
            } else {
                JOptionPane.showMessageDialog(dKTamTru, "CCCD không tồn tại!");
            }
        }
        if (actionCommand.equals("Xác nhận")) {
            String maGiay = this.dKTamTru.getjTextField_maGiayTamTru().getText();
            String CCCD = this.dKTamTru.getjTextField_CCCD().getText();
            String noiTamTru = this.dKTamTru.getjTextField_noiTamTru().getText();
            String lyDo = this.dKTamTru.getjTextField_lyDo().getText();
            java.util.Date tuNgaysql = this.dKTamTru.getjDateChooser_tuNgay().getDate();
            java.sql.Date tuNgay = java.sql.Date.valueOf(tuNgaysql.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            java.util.Date denNgaysql = this.dKTamTru.getjDateChooser_denNgay().getDate();
            java.sql.Date denNgay = java.sql.Date.valueOf(denNgaysql.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            tamTru = new TamTru(maGiay, CCCD, noiTamTru, lyDo, tuNgay, denNgay);

            this.insert(tamTru);
            JOptionPane.showMessageDialog(dKTamTru, "Đã lưu");
            this.dKTamTru.dispose();
        }
    }

    public ArrayList<NhanKhau> kiemTra(String CCCD) {
        String Condition = "CCCD LIKE '" + CCCD + "'";
        return NhanKhauDAO.getInstance().find(Condition);
    }

    public int insert(TamTru tamTru) {
        return TamTruDAO.getInstance().insert(tamTru);
    }
}
