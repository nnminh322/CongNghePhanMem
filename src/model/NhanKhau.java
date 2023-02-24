/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.List;

/**
 *
 * @author nnminh322
 */
public class NhanKhau {

    private int idNhanKhau;
    private String soHoKhau;
    private String hoTen;
    private String biDanh;
    private Date ngaySinh;
    private String noiSinh;
    private String gioiTinh;
    private String nguyenQuan;
    private String danToc;
    private String ngheNghiep;
    private String noiLamViec;
    private String CCCD;
    private Date ngayCap;
    private String noiCap;
    private String quanHeVoiChuHo;
    private String ghiChu;
//    private String noiOHienTai;

    public NhanKhau(int idNhanKhau, String soHoKhau, String hoTen, String biDanh, Date ngaySinh, String noiSinh, String gioiTinh, String nguyenQuan, String danToc, String ngheNghiep, String noiLamViec, String CCCD, Date ngayCap, String noiCap, String quanHeVoiChuHo, String ghiChu) {
        this.idNhanKhau = idNhanKhau;
        this.soHoKhau = soHoKhau;
        this.hoTen = hoTen;
        this.biDanh = biDanh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.gioiTinh = gioiTinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.CCCD = CCCD;
        this.ngayCap = ngayCap;
        this.noiCap = noiCap;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
        this.ghiChu = ghiChu;
    }

    public NhanKhau(String soHoKhau, String hoTen, String biDanh, Date ngaySinh, String noiSinh, String gioiTinh, String nguyenQuan, String danToc, String ngheNghiep, String noiLamViec, String CCCD, Date ngayCap, String noiCap, String quanHeVoiChuHo) {
        this.soHoKhau = soHoKhau;
        this.hoTen = hoTen;
        this.biDanh = biDanh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.gioiTinh = gioiTinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.CCCD = CCCD;
        this.ngayCap = ngayCap;
        this.noiCap = noiCap;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public NhanKhau(int idNhanKhau, String soHoKhau, String hoTen, String biDanh, Date ngaySinh, String noiSinh, String gioiTinh, String nguyenQuan, String danToc, String ngheNghiep, String noiLamViec, String CCCD, Date ngayCap, String noiCap, String quanHeVoiChuHo) {
        this.idNhanKhau = idNhanKhau;
        this.soHoKhau = soHoKhau;
        this.hoTen = hoTen;
        this.biDanh = biDanh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.gioiTinh = gioiTinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.CCCD = CCCD;
        this.ngayCap = ngayCap;
        this.noiCap = noiCap;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public NhanKhau(String soHoKhau, String hoTen, String biDanh, Date ngaySinh, String noiSinh, String gioiTinh, String nguyenQuan, String danToc, String quanHeVoiChuHo) {
        this.soHoKhau = soHoKhau;
        this.hoTen = hoTen;
        this.biDanh = biDanh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.gioiTinh = gioiTinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
        this.CCCD = "Mới sinh";
        this.ghiChu = "Mới sinh";
    }

    public NhanKhau() {
        super();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getBiDanh() {
        return biDanh;
    }

    public void setBiDanh(String biDanh) {
        this.biDanh = biDanh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNguyenQuan() {
        return nguyenQuan;
    }

    public void setNguyenQuan(String nguyenQuan) {
        this.nguyenQuan = nguyenQuan;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

//    public String getNoiOHienTai() {
//        return noiOHienTai;
//    }
//
//    public void setNoiOHienTai(String noiOHienTai) {
//        this.noiOHienTai = noiOHienTai;
//    }
    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    @Override
    public String toString() {
        return "NhanKhau{" + "idNhanKhau=" + idNhanKhau + ", soHoKhau=" + soHoKhau + ", hoTen=" + hoTen + ", biDanh=" + biDanh + ", ngaySinh=" + ngaySinh + ", noiSinh=" + noiSinh + ", gioiTinh=" + gioiTinh + ", nguyenQuan=" + nguyenQuan + ", danToc=" + danToc + ", ngheNghiep=" + ngheNghiep + ", noiLamViec=" + noiLamViec + ", CCCD=" + CCCD + ", ngayCap=" + ngayCap + ", noiCap=" + noiCap + ", quanHeVoiChuHo=" + quanHeVoiChuHo + '}';
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
