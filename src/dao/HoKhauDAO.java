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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoKhau;

/**
 *
 * @author nnminh322
 */
public class HoKhauDAO implements DAOInterface<HoKhau> {

    public static HoKhauDAO getInstance() {
        return new HoKhauDAO();
    }

    @Override
    public int insert(HoKhau t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `HoKhau` (`idHoKhau`, `soHoKhau`, `hoTenChuHo`, `soNha`, `duongPho`, `phuongXa`, `quanHuyen`) VALUES (NULL, '" + t.getSoHoKhau() + "', '" + t.getHoTenChuHo() + "', '" + t.getSoNha() + "', '" + t.getDuongPho() + "', '" + t.getPhuongXa() + "', '" + t.getQuanHuyen() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(HoKhau t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "UPDATE HoKhau SET soNha = '" + t.getSoNha() + "', duongPho = '" + t.getDuongPho() + "', phuongXa = '" + t.getPhuongXa() + "', quanHuyen = '" + t.getQuanHuyen() + "' WHERE soHoKhau = '" + t.getSoHoKhau() + "';";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(HoKhau t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoKhau> selectAll() {
        ArrayList<HoKhau> listHoKhau = new ArrayList<HoKhau>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM HOKHAU";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idHoKhau = Integer.parseInt(rs.getString("idHoKhau"));
                String soHoKhau = rs.getString("soHoKhau");
                String hoTenChuHo = rs.getString("hoTenChuHo");
                int soNha = Integer.parseInt(rs.getString("soNha"));
                String duongPho = rs.getString("duongPho");
                String phuongXa = rs.getString("phuongXa");
                String quanHuyen = rs.getString("quanHuyen");

                HoKhau hoKhau = new HoKhau(idHoKhau, soHoKhau, hoTenChuHo, soNha, duongPho, phuongXa, quanHuyen);

                listHoKhau.add(hoKhau);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(HoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listHoKhau;
    }

    @Override
    public ArrayList<HoKhau> find(String Condition) {
        ArrayList<HoKhau> listHoKhau = new ArrayList<HoKhau>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM HOKHAU WHERE " + Condition;
//            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idHoKhau = Integer.parseInt(rs.getString("idHoKhau"));
                String soHoKhau = rs.getString("soHoKhau");
                String hoTenChuHo = rs.getString("hoTenChuHo");
                int soNha = Integer.parseInt(rs.getString("soNha"));
                String duongPho = rs.getString("duongPho");
                String phuongXa = rs.getString("phuongXa");
                String quanHuyen = rs.getString("quanHuyen");

                HoKhau hoKhau = new HoKhau(idHoKhau, soHoKhau, hoTenChuHo, soNha, duongPho, phuongXa, quanHuyen);

                listHoKhau.add(hoKhau);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(HoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listHoKhau;
    }

}
