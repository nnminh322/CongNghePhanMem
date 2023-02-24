/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NhanKhauController;

import dao.NhanKhauDAO;
import dao.TamVangDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.NhanKhau;
import model.TamVang;
import view.nhankhau.DKTamVang;

/**
 *
 * @author nnminh322
 */
public class DKTamVangController implements ActionListener {

    private DKTamVang dKTamVang;
    private TamVang tamVang;

    public DKTamVangController(DKTamVang dKTamVang) {
        this.dKTamVang = dKTamVang;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Kiểm tra")) {
            if (!this.kiemTra(this.dKTamVang.getjTextField_CCCD().getText()).isEmpty()) {
                this.dKTamVang.mo();
            } else {
                JOptionPane.showMessageDialog(dKTamVang, "CCCD không tồn tại!");

            }

        }
        if (actionCommand.equals("Xác nhận")) {
            String maGiay = this.dKTamVang.getjTextField_maGiayTamVang().getText();
            String CCCD = this.dKTamVang.getjTextField_CCCD().getText();
            String SDT = this.dKTamVang.getjTextField_SDT().getText();
            String lyDo = this.dKTamVang.getjTextField_lyDo().getText();
            java.util.Date selectedDate1 = this.dKTamVang.getjDateChooser_tuNgay().getDate();
            java.sql.Date tuNgay = java.sql.Date.valueOf(selectedDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            java.util.Date selectedDate2 = this.dKTamVang.getjDateChooser_denNgay().getDate();
            java.sql.Date denNgay = java.sql.Date.valueOf(selectedDate2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            tamVang = new TamVang(maGiay, CCCD, SDT, lyDo, tuNgay, denNgay);

            this.insert(tamVang);
            JOptionPane.showMessageDialog(dKTamVang, "Đã lưu");
            this.dKTamVang.dispose();

        }
    }

    public ArrayList<NhanKhau> kiemTra(String CCCD) {
        String Condition = "CCCD LIKE '" + CCCD + "'";
        return NhanKhauDAO.getInstance().find(Condition);
    }

    public int insert(TamVang tamVang) {
        return TamVangDAO.getInstance().insert(tamVang);
    }
}
