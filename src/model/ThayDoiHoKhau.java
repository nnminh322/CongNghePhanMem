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
public class ThayDoiHoKhau {

    private int id;
    private Date ngayThayDoi;
    private String lyDo;
    private int idHoKhau;
    private String soHoKhau;

    public ThayDoiHoKhau(Date ngayThayDoi, String lyDo, String soHoKhau) {
        this.ngayThayDoi = ngayThayDoi;
        this.lyDo = lyDo;
        this.soHoKhau = soHoKhau;
    }

    public ThayDoiHoKhau(Date ngayThayDoi, String lyDo) {
        this.ngayThayDoi = ngayThayDoi;
        this.lyDo = lyDo;
    }

    public Date getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(Date ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

}
