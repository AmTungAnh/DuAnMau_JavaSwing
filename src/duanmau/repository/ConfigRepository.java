/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.ChatLieu;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author tunga
 */
public class ConfigRepository {
    
    Random rd = new Random();
    Integer randomNewMa = rd.nextInt(0, 10000);
    String maNew = "ASSW" + randomNewMa;
    
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
                    LocalDate ngaySua = resultSet.getDate("ngay_cap_nhat").toLocalDate();
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
    
    public void add(String ten, String tableName) {
        Connection connection = DBConfig.getConnection();       
        if (connection != null) {
            try {
                String query = "INSERT INTO " + tableName + " (ma, ten, trang_thai, ngay_tao, ngay_cap_nhat) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
                preparedStatement.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
                preparedStatement.setString(1, maNew);
                preparedStatement.setString(2, ten);
                preparedStatement.setString(3, "Hoạt động");
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
    }
    
    public void update(String tableName, Integer id, String ten){
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "UPDATE " + tableName + " SET ten = ? WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, ten);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
    }
    
    public void removeOrRevert(String tableName, Integer id, String trangThai){
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "UPDATE " + tableName + " SET trang_thai = ? WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, trangThai);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
    }
    
    public void delete(String tableName, Integer id) {
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "DELETE FROM " + tableName + " WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
            }
        }
}
