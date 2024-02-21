/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.LoaiSanPham;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author tunga
 */
public class LoaiSanPhamRepository {
    
    public List<LoaiSanPham> getAll(){
        List<LoaiSanPham> loaiSanPhamList =  new ArrayList<>();
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM loai_san_pham";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while (resultSet.next()) {                    
                    Integer id = resultSet.getInt("id");
                    String ma = resultSet.getString("ma");
                    String ten = resultSet.getString("ten");
                    String trangThai = resultSet.getString("trang_thai");
                    LocalDate ngayTao = resultSet.getDate("ngay_tao").toLocalDate();
                    LocalDate ngaySua =  resultSet.getDate("ngay_cap_nhat").toLocalDate();
                    LoaiSanPham loaiSanPham = new LoaiSanPham(id, ma, ten, trangThai, ngayTao, ngaySua);
                    loaiSanPhamList.add(loaiSanPham);
                }
                
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
        }
        return loaiSanPhamList;
    }
}
