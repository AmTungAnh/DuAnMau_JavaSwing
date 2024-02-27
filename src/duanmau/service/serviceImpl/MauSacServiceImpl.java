/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.MauSac;
import duanmau.repository.MauSacRepository;
import duanmau.service.MauSacService;
import java.util.List;

/**
 *
 * @author tunga
 */
public class MauSacServiceImpl implements MauSacService{

    private final MauSacRepository mauSacRepository;
    public MauSacServiceImpl() {
        this.mauSacRepository = new MauSacRepository();
    }

    @Override
    public List<MauSac> getAll() {
        return this.mauSacRepository.getAll();
    }
    
}
