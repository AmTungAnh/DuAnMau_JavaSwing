/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.ChatLieu;
import duanmau.repository.ConfigRepository;
import duanmau.service.ChatLieuService;
import java.util.List;

/**
 *
 * @author tunga
 */

public class ChatLieuServiceImpl implements ChatLieuService{
    
    private final ConfigRepository chatLieuRepository;

    public ChatLieuServiceImpl() {
        this.chatLieuRepository = new ConfigRepository();
    }
    
    @Override
    public void addChatLieu(String tableName, String ten) {
        this.chatLieuRepository.add(ten, tableName);
    }

    @Override
    public List<ChatLieu> getAllChatLieu(String tableName) {
        return this.chatLieuRepository.getAll(tableName);
    }

    @Override
    public void update(String tableName, Integer id, String ten) {
        this.chatLieuRepository.update(tableName, id, ten);
    }

    @Override
    public void removeOrRevert(String tableName, Integer id, String trangThai) {
        this.chatLieuRepository.removeOrRevert(tableName, id, trangThai);
    }

    @Override
    public void delete(String tableName, Integer id) {
        this.chatLieuRepository.delete(tableName, id);
    }
    
}
