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
public class TamVang {

    private int idNhanKhau;
    private String maGiay;
    private String CCCD;
    private String SDT;
    private String lyDo;

    private Date tuNgay;
    private Date denNgay;

    public TamVang(int idNhanKhau, String maGiay, String CCCD, String SĐT, String lyDo, Date tuNgay, Date denNgay) {
        this.idNhanKhau = idNhanKhau;
        this.maGiay = maGiay;
        this.CCCD = CCCD;
        this.SDT = SDT;

        this.lyDo = lyDo;
        this.tuNgay = tuNgay;
        this.denNgay = denNgay;
    }

    public TamVang(String maGiay, String CCCD, String SDT, String lyDo, Date tuNgay, Date denNgay) {
        this.maGiay = maGiay;
        this.CCCD = CCCD;
        this.SDT = SDT;
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

    public String getSDT() {
        return SDT;
    }

    public void setSĐT(String SDT) {
        this.SDT = SDT;
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
