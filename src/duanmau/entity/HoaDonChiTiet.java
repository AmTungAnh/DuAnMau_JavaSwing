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
public class HoaDonChiTiet {
    
    private Integer id;
    
    private Integer soLuong;
    
    private BigDecimal donGia;
    
    private BigDecimal giaBan;
    
    private String trangThai;
    
    private LocalDate ngayTao;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Integer id, Integer soLuong, BigDecimal donGia, BigDecimal giaBan, String trangThai, LocalDate ngayTao) {
        this.id = id;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
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
