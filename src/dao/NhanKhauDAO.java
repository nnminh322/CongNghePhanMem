/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.NhanKhau;

/**
 *
 * @author nnminh322
 */
public class NhanKhauDAO implements DAOInterface<NhanKhau> {

    public static NhanKhauDAO getInstance() {
        return new NhanKhauDAO();
    }

    @Override
    public int insert(NhanKhau t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql2 = "INSERT INTO `NhanKhau` (`idNhanKhau`, `hoTen`, `biDanh`, `ngaySinh`, `noiSinh`, `gioiTinh`, `nguyenQuan`, `danToc`, `ngheNghiep`, `noiLamViec`, `CCCD`, `ngayCap`, `noiCap`, `quanHeVoiChuHo`, `soHoKhau`, `ghiChu`) VALUES " + "(NULL, '" + t.getHoTen() + "', '" + t.getBiDanh() + "', '" + t.getNgaySinh() + "', '" + t.getNoiSinh() + "', '" + t.getGioiTinh() + "', '" + t.getNguyenQuan() + "', '" + t.getDanToc() + "', NULL, NULL, NULL, NULL, NULL, '" + t.getQuanHeVoiChuHo() + "', '" + t.getSoHoKhau() + "', '" + t.getGhiChu() + "')";

            String sql = "INSERT INTO `NhanKhau` (`idNhanKhau`, `hoTen`, `biDanh`, `ngaySinh`, `noiSinh`, `gioiTinh`, `nguyenQuan`, `danToc`, `ngheNghiep`, `noiLamViec`, `CCCD`, `ngayCap`, `noiCap`, `quanHeVoiChuHo`, `soHoKhau`) VALUES "
                    + "(NULL, '" + t.getHoTen() + "', '" + t.getBiDanh() + "', '" + t.getNgaySinh() + "', '" + t.getNoiSinh() + "', '" + t.getGioiTinh() + "', '" + t.getNguyenQuan() + "', '" + t.getDanToc() + "', '" + t.getNgheNghiep() + "', '" + t.getNoiLamViec() + "', '" + t.getCCCD() + "', '" + t.getNgayCap() + "', '" + t.getNoiCap() + "', '" + t.getQuanHeVoiChuHo() + "', '" + t.getSoHoKhau() + "')";
//            System.out.println(sql2);

            if (t.getCCCD().equals("Mới sinh")) {
                ketQua = st.executeUpdate(sql2);

            } else {
                ketQua = st.executeUpdate(sql);

            }

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NhanKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(NhanKhau t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "UPDATE `NhanKhau` SET `hoTen` = '" + t.getHoTen() + "', `biDanh` = '" + t.getBiDanh() + "', `ngaySinh` = '" + t.getNgaySinh() + "', `noiSinh` = '" + t.getNoiSinh() + "', `gioiTinh` = '" + t.getGioiTinh() + "', `nguyenQuan` = '" + t.getNguyenQuan() + "', `danToc` = '" + t.getDanToc() + "', `ngheNghiep` = '" + t.getNgheNghiep() + "', `noiLamViec` = '" + t.getNoiLamViec() + "', `CCCD` = '" + t.getCCCD() + "', `ngayCap` = '" + t.getNgayCap() + "', `noiCap` = '" + t.getNoiCap() + "', `quanHeVoiChuHo` = '" + t.getQuanHeVoiChuHo() + "', `soHoKhau` = '" + t.getSoHoKhau() + "', `ghiChu` = '" + t.getGhiChu() + "' WHERE `NhanKhau`.`idNhanKhau` = " + t.getIdNhanKhau() + "";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NhanKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(NhanKhau t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<NhanKhau> selectAll() {
        ArrayList<NhanKhau> listNhanKhau = new ArrayList<NhanKhau>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM NhanKhau";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idNhanKhau = Integer.parseInt(rs.getString("idNhanKhau"));

                String hoTen = rs.getString("hoTen");
                String biDanh = rs.getString("biDanh");
                Date ngaySinh = rs.getDate("ngaySinh");
                String noiSinh = rs.getString("noiSinh");
                String gioiTinh = rs.getString("gioiTinh");
                String nguyenQuan = rs.getString("nguyenQuan");
                String danToc = rs.getString("danToc");
                String ngheNghiep = rs.getString("ngheNghiep");
                String noiLamViec = rs.getString("noiLamViec");
                String CCCD = rs.getString("CCCD");
                Date ngayCap = rs.getDate("ngayCap");
                String noiCap = rs.getString("noiCap");
                String quanHeVoiChuHo = rs.getString("quanHeVoiChuHo");
                String soHoKhau = rs.getString("soHoKhau");
                String ghiChu = rs.getString("ghiChu");
//                String noiOHienTai = rs.getString("noiOHienTai");
//                int idHoKhau = Integer.parseInt(rs.getString("idHoKhau"));

                NhanKhau nhanKhau = new NhanKhau(idNhanKhau, soHoKhau, hoTen, biDanh, ngaySinh, noiSinh, gioiTinh, nguyenQuan, danToc, ngheNghiep, noiLamViec, CCCD, ngayCap, noiCap, quanHeVoiChuHo, ghiChu);
                listNhanKhau.add(nhanKhau);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NhanKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listNhanKhau;
    }

    @Override
    public ArrayList<NhanKhau> find(String Condition) {
        ArrayList<NhanKhau> listNhanKhau = new ArrayList<NhanKhau>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM NhanKhau WHERE " + Condition;
//            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String hoTen = rs.getString("hoTen");
                String biDanh = rs.getString("biDanh");
                Date ngaySinh = rs.getDate("ngaySinh");
                String noiSinh = rs.getString("noiSinh");
                String gioiTinh = rs.getString("gioiTinh");
                String nguyenQuan = rs.getString("nguyenQuan");
                String danToc = rs.getString("danToc");
                String ngheNghiep = rs.getString("ngheNghiep");
                String noiLamViec = rs.getString("noiLamViec");
                String CCCD = rs.getString("CCCD");
                Date ngayCap = rs.getDate("ngayCap");
                String noiCap = rs.getString("noiCap");
                String quanHeVoiChuHo = rs.getString("quanHeVoiChuHo");
                String soHoKhau = rs.getString("soHoKhau");
                String ghiChu = rs.getString("ghiChu");
//                String noiOHienTai = rs.getString("noiOHienTai");
                int idNhanKhau = Integer.parseInt(rs.getString("idNhanKhau"));

                NhanKhau nhanKhau = new NhanKhau(idNhanKhau, soHoKhau, hoTen, biDanh, ngaySinh, noiSinh, gioiTinh, nguyenQuan, danToc, ngheNghiep, noiLamViec, CCCD, ngayCap, noiCap, quanHeVoiChuHo, ghiChu);
                listNhanKhau.add(nhanKhau);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NhanKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listNhanKhau;
    }

}
