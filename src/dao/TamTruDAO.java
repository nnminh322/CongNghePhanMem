/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TamTru;
import java.sql.ResultSet;

/**
 *
 * @author nnminh322
 */
public class TamTruDAO implements DAOInterface<TamTru> {

    public static TamTruDAO getInstance() {
        return new TamTruDAO();
    }

    @Override
    public int insert(TamTru t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `TamTru` (`maGiay`, `CCCD`, `noiTamTru`, `lyDo`, `tuNgay`, `denNgay`) VALUES ('" + t.getMaGiay() + "', '" + t.getCCCD() + "', '" + t.getNoiTamTru() + "', '" + t.getLyDo() + "', '" + t.getTuNgay() + "', '" + t.getDenNgay() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TamTruDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(TamTru t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(TamTru t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<TamTru> selectAll() {
        ArrayList<TamTru> listTamTru = new ArrayList<TamTru>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM TamTru";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maGiay = rs.getString("maGiay");
                String CCCD = rs.getString("CCCD");
                String noiTamTru = rs.getString("noiTamTru");
                String lyDo = rs.getString("lyDo");

                Date tuNgay = rs.getDate("tuNgay");
                Date denNgay = rs.getDate("denNgay");

                TamTru tamTru = new TamTru(maGiay, CCCD, noiTamTru, lyDo, tuNgay, denNgay);
                listTamTru.add(tamTru);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TamTruDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listTamTru;
    }

    @Override
    public ArrayList<TamTru> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
