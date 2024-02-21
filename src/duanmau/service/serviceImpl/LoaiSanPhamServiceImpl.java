/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.LoaiSanPham;
import duanmau.repository.LoaiSanPhamRepository;
import duanmau.service.LoaiSanPhamService;
import java.util.List;

/**
 *
 * @author tunga
 */
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService{

    private final LoaiSanPhamRepository loaiSanPhamRepository;
    
    public LoaiSanPhamServiceImpl() {
        this.loaiSanPhamRepository = new LoaiSanPhamRepository();
    }

    @Override
    public List<LoaiSanPham> getAll() {
        return this.loaiSanPhamRepository.getAll();
    }
    
}
