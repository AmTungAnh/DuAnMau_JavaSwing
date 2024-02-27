/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.NhaSanXuat;
import duanmau.repository.NhaSanXuatRepositoty;
import duanmau.service.NhaSanXuatService;
import java.util.List;

/**
 *
 * @author tunga
 */
public class NhaSanXuatServiceImpl implements NhaSanXuatService{

    private final NhaSanXuatRepositoty nhaSanXuatRepositoty;
    public NhaSanXuatServiceImpl() {
        this.nhaSanXuatRepositoty = new NhaSanXuatRepositoty();
    }

    @Override
    public List<NhaSanXuat> getAll() {
        return this.nhaSanXuatRepositoty.getAll();
    }
    
}
