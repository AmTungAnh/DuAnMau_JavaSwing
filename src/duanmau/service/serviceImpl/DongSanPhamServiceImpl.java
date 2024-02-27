/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.DongSanPham;
import duanmau.repository.DongSanPhamRepository;
import duanmau.service.DongSanPhamService;
import java.util.List;

/**
 *
 * @author tunga
 */
public class DongSanPhamServiceImpl implements DongSanPhamService{

    private final DongSanPhamRepository dongSanPhamRepository;

    public DongSanPhamServiceImpl() {
        this.dongSanPhamRepository = new DongSanPhamRepository();
    }
    
    @Override
    public List<DongSanPham> getAll() {
        return this.dongSanPhamRepository.getAll();
    }
    
}
