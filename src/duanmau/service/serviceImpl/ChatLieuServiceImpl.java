/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.service.serviceImpl;

import duanmau.entity.ChatLieu;
import duanmau.repository.ChatLieuRepository;
import duanmau.service.ChatLieuService;
import java.util.List;

/**
 *
 * @author tunga
 */

public class ChatLieuServiceImpl implements ChatLieuService{
    
    private final ChatLieuRepository chatLieuRepository;

    public ChatLieuServiceImpl() {
        this.chatLieuRepository = new ChatLieuRepository();
    }
    
    @Override
    public void addChatLieu(ChatLieu chatLieu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ChatLieu> getAllChatLieu() {
        return this.chatLieuRepository.getAll();
    }
    
}
