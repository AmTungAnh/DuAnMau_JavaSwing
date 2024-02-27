/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duanmau.repository;

import duanmau.entity.MauSac;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author tunga
 */
public class MauSacRepository {
    
    public List<MauSac> getAll(){
        List<MauSac> mauSacList = new ArrayList<>();
        Connection connection = DBConfig.getConnection();
        if (connection != null) {
            try {
                String query = "SELECT * FROM mau_sac";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                
                while (resultSet.next()) {
                    Integer id = resultSet.getInt("id");
                    String ma  = resultSet.getString("ma");
                    String ten = resultSet.getString("ten");
                    String trangThai = resultSet.getString("trang_thai");
                    LocalDate ngayTao = resultSet.getDate("ngay_tao").toLocalDate();
                    LocalDate ngaySua = resultSet.getDate("ngay_cap_nhat").toLocalDate();        
                    MauSac mauSac = new MauSac(id, ma, ten, trangThai, ngayTao, ngaySua);
                    mauSacList.add(mauSac);
                }
                
                preparedStatement.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConfig.closeConnection(connection);
            }
            
        }
        return mauSacList;
    }
}
