/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class DanhSachThamGia {

    private String maCuocHop;
    private String maHoKhau;
    private String chuHo;
    private int soLanThamGia;

    public DanhSachThamGia(String maCuocHop, String maHoKhau, String chuHo) {
        this.maCuocHop = maCuocHop;
        this.maHoKhau = maHoKhau;
        this.chuHo = chuHo;
    }

    public DanhSachThamGia(String maHoKhau, String chuHo, int soLanThamGia) {
        this.maHoKhau = maHoKhau;
        this.chuHo = chuHo;
        this.soLanThamGia = soLanThamGia;
    }

    public String getMaCuocHop() {
        return maCuocHop;
    }

    public void setMaCuocHop(String maCuocHop) {
        this.maCuocHop = maCuocHop;
    }

    public String getMaHoKhau() {
        return maHoKhau;
    }

    public void setMaHoKhau(String maHoKhau) {
        this.maHoKhau = maHoKhau;
    }

    public String getChuHo() {
        return chuHo;
    }

    public void setChuHo(String chuHo) {
        this.chuHo = chuHo;
    }

    public int getSoLanThamGia() {
        return soLanThamGia;
    }

    public void setSoLanThamGia(int soLanThamGia) {
        this.soLanThamGia = soLanThamGia;
    }

}
