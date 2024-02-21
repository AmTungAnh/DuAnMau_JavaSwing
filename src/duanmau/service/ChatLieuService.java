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
    
    public List<ChatLieu> getAllChatLieu();
    
    public void addChatLieu(ChatLieu chatLieu);
}
