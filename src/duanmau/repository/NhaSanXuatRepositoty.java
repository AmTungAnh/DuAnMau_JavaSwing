/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.NhaSanXuat;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author tunga
 */
public class NhaSanXuatRepositoty {
    
    public List<NhaSanXuat> getAll(){
        List<NhaSanXuat> nhaSanXuatList = new ArrayList<>();
        Connection connection = DBConfig.getConnection();
        try {
            String query = "SELECT * FROM nha_san_xuat";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                Integer id = resultSet.getInt("id");
                String ma = resultSet.getString("ma");
                String ten = resultSet.getString("ten");
                String trangThai = resultSet.getString("trang_thai");
                LocalDate ngayTao = resultSet.getDate("ngay_tao").toLocalDate();
                LocalDate ngaySua = resultSet.getDate("ngay_cap_nhat").toLocalDate();
                NhaSanXuat nsx = new NhaSanXuat(id, ma, ten, trangThai, ngayTao, ngaySua);
                nhaSanXuatList.add(nsx);
            }
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConfig.closeConnection(connection);
        }
        return nhaSanXuatList;
    }
}
