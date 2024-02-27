/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service;

import duanmau.entity.ThuongHieu;
import java.util.List;

/**
 *
 * @author tunga
 */
public interface ThuongHieuService {
    
    public List<ThuongHieu> getAll();
    
    public void add(String ten);
    
    public void update(Integer id, String ten);
    
    public void delete(Integer id);
}
