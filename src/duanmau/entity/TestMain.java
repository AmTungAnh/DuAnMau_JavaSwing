/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.entity;

import duanmau.repository.ChatLieuRepository;
import java.util.List;

/**
 *
 * @author tunga
 */
public class TestMain {
    public static void main(String[] args) {
        ChatLieuRepository chatLieuRepository = new ChatLieuRepository();
        
        // Gọi phương thức getAll() để lấy danh sách các chất liệu từ CSDL
        List<ChatLieu> chatLieuList = chatLieuRepository.getAll();
        System.out.println("hahahaha");
        // In thông tin về các chất liệu
        for (ChatLieu chatLieu : chatLieuList) {
            System.out.println("chatLieu" + chatLieu);
        }
    }
}
