/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import model.CuocHop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nnminh322
 */
public class CuocHopDAO implements DAOInterface<CuocHop> {

    public static CuocHopDAO getInstance() {
        return new CuocHopDAO();
    }

    @Override
    public int insert(CuocHop t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `CuocHop` (`MaCuocHop`, `ChuDe`, `ThoiGian`, `DiaDiem`) VALUES ('" + t.getMaCuocHop() + "', '" + t.getChuDe() + "', '" + t.getThoiGian() + "', '" + t.getDiaDiem() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(CuocHop t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `CuocHop` SET `ChuDe` = '" + t.getChuDe() + "', `ThoiGian` = '" + t.getThoiGian() + "', `DiaDiem` = '" + t.getDiaDiem() + "' WHERE `CuocHop`.`MaCuocHop` = '" + t.getMaCuocHop() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(HoKhauDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(CuocHop t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CuocHop> selectAll() {
        ArrayList<CuocHop> listCuocHop = new ArrayList<CuocHop>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM CuocHop";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maCuocHop = rs.getString("maCuocHop");
                String chuDe = rs.getString("chuDe");
                String thoiGian = rs.getString("thoiGian");
                String diaDiem = rs.getString("diaDiem");

                CuocHop cuocHop = new CuocHop(maCuocHop, chuDe, thoiGian, diaDiem);

                listCuocHop.add(cuocHop);
            }

            ConnectionToDB.close(conn);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        } catch (SQLException ex) {
            Logger.getLogger(HoKhauDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return listCuocHop;
    }

    @Override
    public ArrayList<CuocHop> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
