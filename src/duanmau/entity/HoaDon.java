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
public class HoaDon {
    
    private Integer id;
    
    private String ma;
    
    private BigDecimal soTienChuyenKhoan;
    
    private BigDecimal soTienMat;
    
    private BigDecimal thanhTien;
    
    private String moTa;
    
    private String trangThai;
    
    private LocalDate ngayTao;

    public HoaDon() {
    }

    public HoaDon(Integer id, String ma, BigDecimal soTienChuyenKhoan, BigDecimal soTienMat, BigDecimal thanhTien, String moTa, String trangThai, LocalDate ngayTao) {
        this.id = id;
        this.ma = ma;
        this.soTienChuyenKhoan = soTienChuyenKhoan;
        this.soTienMat = soTienMat;
        this.thanhTien = thanhTien;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
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

    public BigDecimal getSoTienChuyenKhoan() {
        return soTienChuyenKhoan;
    }

    public void setSoTienChuyenKhoan(BigDecimal soTienChuyenKhoan) {
        this.soTienChuyenKhoan = soTienChuyenKhoan;
    }

    public BigDecimal getSoTienMat() {
        return soTienMat;
    }

    public void setSoTienMat(BigDecimal soTienMat) {
        this.soTienMat = soTienMat;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
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
}
