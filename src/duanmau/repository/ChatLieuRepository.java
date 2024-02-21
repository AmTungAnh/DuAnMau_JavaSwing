/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.ChatLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tunga
 */
public class ChatLieuRepository {
    
    public List<ChatLieu> getAll(){
        List<ChatLieu> chatLieuList = new ArrayList<>();
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM chat_lieu";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while (resultSet.next()) {                    
                    Integer id = resultSet.getInt("id");
                    String ma = resultSet.getString("ma");
                    String ten = resultSet.getString("ten");
                    String trangThai = resultSet.getString("trang_thai");
                    LocalDate ngayTao = resultSet.getDate("ngay_tao").toLocalDate();
                    LocalDate ngaySua = resultSet.getDate("ngay_sua").toLocalDate();
                    ChatLieu chatLieu = new ChatLieu(id, ma, ten, trangThai, ngayTao, ngaySua);
                    chatLieuList.add(chatLieu);
                }
                
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
        return chatLieuList;
    }
    
    public void addChatLieu(ChatLieu chatLieu) {
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "INSERT INTO chatlieu (ma, ten, trang_thai, ngay_tao, ngay_sua) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, chatLieu.getMa());
                preparedStatement.setString(2, chatLieu.getTen());
                preparedStatement.setString(3, chatLieu.getTrangThai());
                preparedStatement.setDate(4, java.sql.Date.valueOf(chatLieu.getNgayTao()));
                preparedStatement.setDate(5, java.sql.Date.valueOf(chatLieu.getNgaySua()));
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
    }
    
    
}
