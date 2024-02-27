/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.DongSanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author tunga
 */
public class DongSanPhamRepository {
    
    public List<DongSanPham> getAll(){
        List<DongSanPham> dongSanPhamList = new ArrayList<>();
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM dong_san_pham";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while (resultSet.next()) {                    
                    Integer id = resultSet.getInt("id");
                    String ma = resultSet.getString("ma");
                    String ten = resultSet.getString("ten");
                    String trangThai = resultSet.getString("trang_thai");
                    LocalDate ngayTao = resultSet.getDate("ngay_tao").toLocalDate();
                    LocalDate ngaySua =  resultSet.getDate("ngay_cap_nhat").toLocalDate();
                    DongSanPham dongSanPham = new DongSanPham(id, ma, ten, trangThai, ngayTao, ngaySua);
                    
                    dongSanPhamList.add(dongSanPham);
                }
                
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
        
        return dongSanPhamList;
    }
}
