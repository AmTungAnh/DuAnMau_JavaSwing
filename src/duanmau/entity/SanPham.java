/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author tunga
 */
public class SanPham {
    
    private Integer id;
    
    private String ma;
    
    private String ten;
    
    private BigDecimal gia;
    
    private Boolean gioiTinh;
    
    private String moTa;
    
    private String trangThai;
    
    private LocalDate ngayTao;
    
    private LocalDate ngaySua;

    public SanPham() {
    }

    public SanPham(Integer id, String ma, String ten, BigDecimal gia, Boolean gioiTinh, String moTa, String trangThai, LocalDate ngayTao, LocalDate ngaySua) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.gioiTinh = gioiTinh;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public LocalDate getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(LocalDate ngaySua) {
        this.ngaySua = ngaySua;
    }
    
}
