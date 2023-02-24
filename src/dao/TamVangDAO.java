/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TamVang;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author nnminh322
 */
public class TamVangDAO implements DAOInterface<TamVang> {

    public static TamVangDAO getInstance() {
        return new TamVangDAO();
    }

    @Override
    public int insert(TamVang t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `TamVang` (`maGiay`, `CCCD`, `SDT`, `lyDo`, `tuNgay`, `denNgay`) VALUES ('" + t.getMaGiay() + "', '" + t.getCCCD() + "', '" + t.getSDT()+ "', '" + t.getLyDo() + "', '" + t.getTuNgay() + "', '" + t.getDenNgay() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TamVangDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(TamVang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TamVang t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TamVang> selectAll() {
        ArrayList<TamVang> listTamVang = new ArrayList<TamVang>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM TamVang";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maGiay = rs.getString("maGiay");
                String CCCD = rs.getString("CCCD");
                String SDT = rs.getString("SDT");
                String lyDo = rs.getString("lyDo");

                Date tuNgay = rs.getDate("tuNgay");
                Date denNgay = rs.getDate("denNgay");

                TamVang tamVang = new TamVang(maGiay, CCCD, SDT, lyDo, tuNgay, denNgay);
                listTamVang.add(tamVang);
            }
            ConnectionToDB.close(conn);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TamVangDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listTamVang;
    }

    @Override
    public ArrayList<TamVang> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
