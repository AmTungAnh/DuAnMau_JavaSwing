/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.ThuongHieu;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tunga
 */
public class ThuongHieuRepository {
    
    public List<ThuongHieu> getAll(){
        List<ThuongHieu> thuongHieuList = new ArrayList<>();
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM thuong_hieu";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {                
                    Integer id = resultSet.getInt("id");
                    String ma = resultSet.getString("ma");
                    String ten = resultSet.getString("ten");
                    String trangThai = resultSet.getString("trang_thai");
                    LocalDate ngayTao = resultSet.getDate("ngay_tao").toLocalDate();
                    LocalDate ngaySua = resultSet.getDate("ngay_cap_nhat").toLocalDate();
                    ThuongHieu thuongHieu = new ThuongHieu(id, ma, ten, trangThai, ngayTao, ngaySua);
                    thuongHieuList.add(thuongHieu);
                }
                
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
            
        }
        
        return thuongHieuList;
    }
    
    public void add(String ten){
        Connection connection = DBConfig.getConnection();
        Random rd = new Random();
        String ma = "TH" + rd.nextInt(0, 1000);
        if (connection != null) {
            try {
                String query = "INSERT INTO thuong_hieu (ma, ten, trang_thai, ngay_tao, ngay_cap_nhat) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, ma);
                preparedStatement.setString(2, ten);
                preparedStatement.setString(3, "Hoạt động");
                preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
                preparedStatement.setDate(5, Date.valueOf(LocalDate.now()));
                preparedStatement.executeUpdate();
                
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
    }
    
    public void update(Integer id, String ten){
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "UPDATE thuong_hieu SET ten = ? WHERE id = ?";
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
    
    public void delete(Integer id){
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "DELETE FROM thuong_hieu WHERE id = ?";
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
