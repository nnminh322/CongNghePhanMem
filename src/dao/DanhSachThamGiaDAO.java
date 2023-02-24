/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DanhSachThamGia;

/**
 *
 * @author nnminh322
 */
public class DanhSachThamGiaDAO implements DAOInterface<DanhSachThamGia> {

    public static DanhSachThamGiaDAO getInstance() {
        return new DanhSachThamGiaDAO();
    }

    @Override
    public int insert(DanhSachThamGia t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `ThamGiaCuocHop` (`MaCuocHop`, `MaHoKhau`, `TenChuHo`) VALUES ('" + t.getMaCuocHop() + "', '" + t.getMaHoKhau() + "', '" + t.getChuHo() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(DanhSachThamGia t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(DanhSachThamGia t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<DanhSachThamGia> selectAll() {

        ArrayList<DanhSachThamGia> listDanhSachThamGIa = new ArrayList<DanhSachThamGia>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM ThamGiaCuocHop";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maCuocHop = rs.getString("maCuocHop");
                String maHoKhau = rs.getString("maHoKhau");
                String chuHo = rs.getString("tenChuHo");

                DanhSachThamGia danhSachThamGia = new DanhSachThamGia(maCuocHop, maHoKhau, chuHo);
                listDanhSachThamGIa.add(danhSachThamGia);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(HoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listDanhSachThamGIa;
    }

    @Override
    public ArrayList<DanhSachThamGia> find(String Condition) {

        ArrayList<DanhSachThamGia> listDanhSachThamGIa = new ArrayList<DanhSachThamGia>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = Condition;

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maHoKhau = rs.getString("maHoKhau");
                String chuHo = rs.getString("tenChuHo");
                int soLanThamGia = Integer.parseInt(rs.getString("soLanThamGiaCuocHop"));

                DanhSachThamGia danhSachThamGia = new DanhSachThamGia(maHoKhau, chuHo, soLanThamGia);
                listDanhSachThamGIa.add(danhSachThamGia);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(HoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listDanhSachThamGIa;
    }

    public ArrayList<DanhSachThamGia> findListJoin(String maCuocHop) {

        ArrayList<DanhSachThamGia> listDanhSachThamGIa = new ArrayList<DanhSachThamGia>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM `ThamGiaCuocHop` WHERE `MaCuocHop` LIKE '" + maCuocHop + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maHoKhau = rs.getString("maHoKhau");
                String chuHo = rs.getString("tenChuHo");

                DanhSachThamGia danhSachThamGia = new DanhSachThamGia(maCuocHop, maHoKhau, chuHo);
                listDanhSachThamGIa.add(danhSachThamGia);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(HoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listDanhSachThamGIa;
    }
}
