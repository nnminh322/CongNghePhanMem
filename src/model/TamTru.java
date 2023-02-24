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
public class TamTru {

    private int idNhanKhau;
    private String maGiay;
    private String CCCD;
    private String noiTamTru;
    private String lyDo;

    private Date tuNgay;
    private Date denNgay;

    public TamTru(String maGiay, String CCCD, String noiTamTru, String lyDo, Date tuNgay, Date denNgay) {
        this.maGiay = maGiay;
        this.CCCD = CCCD;
        this.noiTamTru = noiTamTru;
        this.lyDo = lyDo;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
    }

    public TamTru(int idNhanKhau, String maGiay, String CCCD, String noiTamTru, String lyDo, Date tuNgay, Date denNgay) {
        this.idNhanKhau = idNhanKhau;
        this.maGiay = maGiay;
        this.CCCD = CCCD;
        this.noiTamTru = noiTamTru;
        this.lyDo = lyDo;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
    }

    
    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getMaGiay() {
        return maGiay;
    }

    public void setMaGiay(String maGiay) {
        this.maGiay = maGiay;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getNoiTamTru() {
        return noiTamTru;
    }

    public void setNoiTamTru(String noiTamTru) {
        this.noiTamTru = noiTamTru;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public Date getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(Date tuNgay) {
        this.tuNgay = tuNgay;
    }

    public Date getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(Date denNgay) {
        this.denNgay = denNgay;
    }

}
