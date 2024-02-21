/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.entity;

import java.time.LocalDate;

/**
 *
 * @author tunga
 */
public class ChiTietSanPham {
    
    private Integer id;
    
    private Integer soLuong;
    
    private String trangThai;
    
    private LocalDate ngayTao;
    
    private LocalDate ngaySua;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(Integer id, Integer soLuong, String trangThai, LocalDate ngayTao, LocalDate ngaySua) {
        this.id = id;
        this.soLuong = soLuong;
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

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
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
