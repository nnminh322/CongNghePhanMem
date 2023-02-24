/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author nnminh322
 */
public class HoKhau {

    private int idHoKhau;
    private String soHoKhau;
    private String hoTenChuHo;
    private int soNha;
    private String duongPho;
    private String phuongXa;
    private String quanHuyen;
    private List<NhanKhau> danhSachNhanKhau;

    public HoKhau(String soHoKhau, String hoTenChuHo, int soNha, String duongPho, String phuongXa, String quanHuyen) {
        this.soHoKhau = soHoKhau;
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.duongPho = duongPho;
        this.phuongXa = phuongXa;
        this.quanHuyen = quanHuyen;
    }



    public HoKhau(int idHoKhau, String soHoKhau, String hoTenChuHo, int soNha, String duongPho, String phuongXa, String quanHuyen) {
        this.idHoKhau = idHoKhau;
        this.soHoKhau = soHoKhau;
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.duongPho = duongPho;
        this.phuongXa = phuongXa;
        this.quanHuyen = quanHuyen;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getDuongPho() {
        return duongPho;
    }

    public void setDuongPho(String duongPho) {
        this.duongPho = duongPho;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public List<NhanKhau> getDanhSachNhanKhau() {
        return danhSachNhanKhau;
    }

    public void setDanhSachNhanKhau(List<NhanKhau> danhSachNhanKhau) {
        this.danhSachNhanKhau = danhSachNhanKhau;
    }
}
