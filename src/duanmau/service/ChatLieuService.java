/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service;

import duanmau.entity.ChatLieu;
import java.util.List;

/**
 *
 * @author tunga
 */
public interface ChatLieuService {
    
    public List<ChatLieu> getAllChatLieu(String tableName);
    
    public void addChatLieu(String tableName, String ten);
    
    public void update(String tableName, Integer id, String ten);
    
    public void removeOrRevert(String tableName, Integer id, String trangThai);
    
    public void delete(String tableName, Integer id);
}
