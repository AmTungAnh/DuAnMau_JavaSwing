/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.KichThuoc;
import duanmau.repository.KichThuocRepository;
import duanmau.service.KichThuocService;
import java.util.List;

/**
 *
 * @author tunga
 */
public class KichThuocServiceImpl implements KichThuocService{

    private final KichThuocRepository kichThuocRepository;

    public KichThuocServiceImpl() {
        this.kichThuocRepository = new KichThuocRepository();
    }
    
    @Override
    public List<KichThuoc> getAll() {
        return this.kichThuocRepository.getAll();
    }
    
}
