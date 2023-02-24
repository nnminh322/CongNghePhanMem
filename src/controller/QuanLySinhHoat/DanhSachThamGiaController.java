/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.QuanLySinhHoat;

import dao.DanhSachThamGiaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.DanhSachThamGia;
import view.sinhhoat.HienThiDanhSachThamGia;

/**
 *
 * @author nnminh322
 */
public class DanhSachThamGiaController implements ActionListener {

    private HienThiDanhSachThamGia hienThiDanhSachThamGia;

    public DanhSachThamGiaController(HienThiDanhSachThamGia hienThiDanhSachThamGia) {
        this.hienThiDanhSachThamGia = hienThiDanhSachThamGia;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<DanhSachThamGia> hienthiDanhSachThamGia(String maCuocHop) {
        return DanhSachThamGiaDAO.getInstance().findListJoin(maCuocHop);
    }
}
