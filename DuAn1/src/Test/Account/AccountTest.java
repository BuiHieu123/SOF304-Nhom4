/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test.Account;

import domainmodel.Role;
import domainmodel.TaiKhoanDomail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import repositorys.TaiKhoanRepositorys;
import utilities.DBConnect;


/**
 *
 * @author duong
 */
public class AccountTest {
    private static Connection connection = null;

    static {
        try {
            connection = DBConnect.getConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public boolean updateTaiKhoan(String maTaiKhoan,int maNhanVien,String matKhau,String role,Integer trangThai) {
        try {
            String query = "update TaiKhoan set MaNhanVien =?,MatKhau =?,VaiTro =?,TrangThai =? where MaTaiKhoan =? ";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, maNhanVien);
            ps.setString(2, matKhau);
            ps.setString(3, role);
             
            ps.setInt(4, trangThai);
            ps.setString(5, maTaiKhoan);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
     public boolean insertTaiKhoan(String maTaiKhoan,int maNhanVien,String matKhau,String role,Integer trangThai) {
        try {
            String query = "insert into TaiKhoan values(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, maTaiKhoan);
            ps.setInt(2, maNhanVien);
            ps.setString(3, matKhau);
             ps.setString(4, role);
             ps.setInt(5, trangThai);
          
            ps.executeUpdate();
 
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
