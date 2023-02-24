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
import model.NhanKhau;
import model.ThayDoiHoKhau;

/**
 *
 * @author nnminh322
 */
public class ThayDoiHoKhauDAO implements DAOInterface<ThayDoiHoKhau> {

    public static ThayDoiHoKhauDAO getInstance() {
        return new ThayDoiHoKhauDAO();
    }

    @Override
    public int insert(ThayDoiHoKhau t) {
        int ketQua;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "INSERT INTO `ThayDoiHoKhau` (`id`, `ngayThayDoi`, `lyDo`, `soHoKhau`) VALUES (NULL, '" + t.getNgayThayDoi() + "', '" + t.getLyDo() + "', '" + t.getSoHoKhau() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            Logger.getLogger(ThayDoiHoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(ThayDoiHoKhau t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(ThayDoiHoKhau t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ThayDoiHoKhau> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ThayDoiHoKhau> find(String Condition) {
        ArrayList<ThayDoiHoKhau> listThayDoiHoKhau = new ArrayList<ThayDoiHoKhau>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM ThayDoiHoKhau WHERE " + Condition;
//            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Date ngayThayDoi = rs.getDate("ngayThayDoi");
                String lyDoThayDoi = rs.getString("lyDo");

                ThayDoiHoKhau thayDoiHoKhau = new ThayDoiHoKhau(ngayThayDoi, lyDoThayDoi);
                listThayDoiHoKhau.add(thayDoiHoKhau);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ThayDoiHoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listThayDoiHoKhau;
    }

}
