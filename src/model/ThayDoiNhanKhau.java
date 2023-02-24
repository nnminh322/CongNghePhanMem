/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Date;
/**
 *
 * @author nnminh322
 */
public class ThayDoiNhanKhau {

    private int id;
    private Date ngayThayDoi;
    private String noiChuyenDi;
    private String noiChuyenDen;
    private String lyDo;
    private String ghiChu;
    private NhanKhau nhanKhau;

    public ThayDoiNhanKhau(int id, Date ngayThayDoi, String noiChuyenDi, String noiChuyenDen, String lyDo, String ghiChu, NhanKhau nhanKhau) {
        this.id = id;
        this.ngayThayDoi = ngayThayDoi;
        this.noiChuyenDi = noiChuyenDi;
        this.noiChuyenDen = noiChuyenDen;
        this.lyDo = lyDo;
        this.ghiChu = ghiChu;
        this.nhanKhau = nhanKhau;
    }

    public ThayDoiNhanKhau(int id, Date ngayThayDoi, String noiChuyenDi, String noiChuyenDen, String lyDo, String ghiChu) {
        this.id = id;
        this.ngayThayDoi = ngayThayDoi;
        this.noiChuyenDi = noiChuyenDi;
        this.noiChuyenDen = noiChuyenDen;
        this.lyDo = lyDo;
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(Date ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public String getNoiChuyenDi() {
        return noiChuyenDi;
    }

    public void setNoiChuyenDi(String noiChuyenDi) {
        this.noiChuyenDi = noiChuyenDi;
    }

    public String getNoiChuyenDen() {
        return noiChuyenDen;
    }

    public void setNoiChuyenDen(String noiChuyenDen) {
        this.noiChuyenDen = noiChuyenDen;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NhanKhau getNhanKhau() {
        return nhanKhau;
    }

    public void setNhanKhau(NhanKhau nhanKhau) {
        this.nhanKhau = nhanKhau;
    }
    
    
}
