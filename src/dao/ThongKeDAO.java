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
import model.ThayDoiHoKhau;
import model.ThongKe;

/**
 *
 * @author nnminh322
 */
public class ThongKeDAO implements DAOInterface<ThongKe> {

    public static ThongKeDAO getInstance() {
        return new ThongKeDAO();
    }

    @Override
    public int insert(ThongKe t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(ThongKe t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(ThongKe t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ThongKe> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ThongKe> find(String sql) {
        ArrayList<ThongKe> listThongKe = new ArrayList<ThongKe>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

//            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String hoTen = rs.getString("hoTen");
                String gioiTinh = rs.getString("gioiTinh");
                String ngaySinh = rs.getString("ngaySinh");
                String maHoKhau = rs.getString("soHoKhau");
                String tinhTrang = rs.getString("tinhTrang");

                ThongKe thongKe = new ThongKe(hoTen, gioiTinh, ngaySinh, maHoKhau, tinhTrang);
                listThongKe.add(thongKe);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ThayDoiHoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listThongKe;
    }

}
