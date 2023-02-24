/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.NhanKhauController;

import dao.NhanKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import model.NhanKhau;
import view.nhankhau.KhaiTu;

/**
 *
 * @author nnminh322
 */
public class KhaiTuController implements ActionListener {

    private NhanKhau nhanKhau;
    private KhaiTu khaiTu;

    public KhaiTuController(KhaiTu khaiTu) {
        this.khaiTu = khaiTu;
        this.nhanKhau = khaiTu.getNhanKhau();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Khai tử")) {
            java.util.Date selectedDate1 = this.khaiTu.getjDateChooser_ngayMat().getDate();
            java.sql.Date ngayMat = java.sql.Date.valueOf(selectedDate1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            String ghiChu = "Mất " + ngayMat.toString() + " vì lý do: " + khaiTu.getjTextField_lyDo().getText();
            nhanKhau.setGhiChu(ghiChu);
            this.update(nhanKhau);

            JOptionPane.showMessageDialog(khaiTu, "Đã khai tử");
            this.khaiTu.dispose();
        }
    }

    public int update(NhanKhau nhanKhau) {
        return NhanKhauDAO.getInstance().update(nhanKhau);
    }
}
