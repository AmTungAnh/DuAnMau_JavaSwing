/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.ThuongHieu;
import duanmau.repository.ThuongHieuRepository;
import duanmau.service.ThuongHieuService;
import java.util.List;

/**
 *
 * @author tunga
 */
public class ThuongHieuServiceImpl implements ThuongHieuService{

    private final ThuongHieuRepository thuongHieuRepository;

    public ThuongHieuServiceImpl() {
        this.thuongHieuRepository = new ThuongHieuRepository();
    }
    
    @Override
    public List<ThuongHieu> getAll() {
        return this.thuongHieuRepository.getAll();
    }

    @Override
    public void add(String ten) {
        this.thuongHieuRepository.add(ten);
    }

    @Override
    public void update(Integer id, String ten) {
        this.thuongHieuRepository.update(id, ten);
    }

    @Override
    public void delete(Integer id) {
        this.thuongHieuRepository.delete(id);
    }
    
}
