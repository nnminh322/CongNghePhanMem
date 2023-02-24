/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.HoKhauController;

import dao.HoKhauDAO;
import dao.ThayDoiHoKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.hokhau.ChuyenKhau;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import model.HoKhau;
import model.ThayDoiHoKhau;

/**
 *
 * @author nnminh322
 */
public class ChuyenKhauController implements ActionListener {

    private ChuyenKhau chuyenKhau;

    public ChuyenKhauController(ChuyenKhau chuyenKhau) {
        this.chuyenKhau = chuyenKhau;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Xác nhận")) {
            String soHoKhau = this.chuyenKhau.getjTextField_SoHoKhau().getText();
            int soNha = Integer.parseInt(this.chuyenKhau.getjTextField_soNha().getText());
            String duongPho = this.chuyenKhau.getjTextField_duongPho().getText();
            String xaPhuong = this.chuyenKhau.getjTextField_xaPhuong().getText();
            String quanHuyen = this.chuyenKhau.getjTextField_quanHuyen().getText();

            String lyDo = "Chuyển đến từ "+chuyenKhau.getDiaChiCu()+" với lý do : " + this.chuyenKhau.getjTextField_lyDo().getText();
            java.util.Date selectedDate = this.chuyenKhau.getjDateChooser_ngayChuyen().getDate();
            java.sql.Date ngayChuyen = java.sql.Date.valueOf(selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            HoKhau hoKhau = new HoKhau(soHoKhau, duongPho, soNha, duongPho, xaPhuong, quanHuyen);
            ThayDoiHoKhau thayDoiHoKhau = new ThayDoiHoKhau(ngayChuyen, lyDo, soHoKhau);

            this.update(hoKhau);
            this.insert(thayDoiHoKhau);

            JOptionPane.showMessageDialog(chuyenKhau, "Đã lưu!");
            this.chuyenKhau.dispose();
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int update(HoKhau hoKhau) {
        return HoKhauDAO.getInstance().update(hoKhau);
    }

    public int insert(ThayDoiHoKhau thayDoiHoKhau) {
        return ThayDoiHoKhauDAO.getInstance().insert(thayDoiHoKhau);
    }
}
