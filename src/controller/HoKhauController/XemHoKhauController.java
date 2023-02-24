/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.HoKhauController;

import dao.HoKhauDAO;
import dao.NhanKhauDAO;
import dao.ThayDoiHoKhauDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.HoKhau;
import model.NhanKhau;
import model.ThayDoiHoKhau;
import view.hokhau.XemHoKhau;

/**
 *
 * @author nnminh322
 */
public class XemHoKhauController implements ActionListener {

    private XemHoKhau xemHoKhau;

    public XemHoKhauController(XemHoKhau xemHoKhau) {
        this.xemHoKhau = xemHoKhau;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<NhanKhau> hienthiThanhVien(HoKhau hoKhau) {
        String Condition = "NhanKhau.soHoKhau = '" + hoKhau.getSoHoKhau() + "'";
        return NhanKhauDAO.getInstance().find(Condition);
    }

    public ArrayList<ThayDoiHoKhau> hienthiThayDoi(HoKhau hoKhau) {
        String Condition = "ThayDoiHoKhau.soHoKhau ='" + hoKhau.getSoHoKhau() + "'";
        return ThayDoiHoKhauDAO.getInstance().find(Condition);
    }
}
