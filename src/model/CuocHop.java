/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class CuocHop {

    private String maCuocHop;
    private String chuDe;
    private String thoiGian;
    private String diaDiem;

    public CuocHop(String maCuocHop, String chuDe, String thoiGian, String diaDiem) {
        this.maCuocHop = maCuocHop;
        this.chuDe = chuDe;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
    }

    public String getMaCuocHop() {
        return maCuocHop;
    }

    public void setMaCuocHop(String maCuocHop) {
        this.maCuocHop = maCuocHop;
    }

    public String getChuDe() {
        return chuDe;
    }

    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

}
