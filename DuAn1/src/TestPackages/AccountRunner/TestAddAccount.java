/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPackages.AccountRunner;

import Test.Account.AccountTest;
import domainmodel.Role;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author duong
 */
public class TestAddAccount {
    private AccountTest acT;
    
    @Before
    public void newMain(){
    acT = new AccountTest();
    }
    

    //Test không chọn trạng thái
    @Test
    public void testAddNoStatus(){
        Role role = Role.NhanVien;
        boolean eq = acT.insertTaiKhoan("DuongHuy", 1006, "1234567",role.toString(),null);
       boolean ex = false   ;
        Assert.assertEquals(ex, eq);
    }
    //test trùng mã nhân viên
    @Test
    public void testAddCheckMaNV(){
        Role role = Role.NhanVien;
        boolean eq = acT.insertTaiKhoan("YangHui", 1006, "1234567",role.toString(),1);
       boolean ex = false;
  
        Assert.assertEquals(ex, eq);
    }
    //test add successful
    @Test
    public void testAddSuccess(){
          Role role = Role.QuanLy;
        boolean eq = acT.insertTaiKhoan("YangHui", 1008, "1234567",role.toString(),1);
       boolean ex = true;
  
        Assert.assertEquals(ex, eq);
    }
       //test không nhập mật khẩu
    @Test
    public void testAddNoPassword(){
          Role role = Role.QuanLy;
        boolean eq = acT.insertTaiKhoan("YangHui", 1009, "",role.toString(),1);
       boolean ex = false;
  
        Assert.assertEquals(ex, eq);
    }
       @After
    public void printMessage(){
        System.out.println("checked");
    }
   
}
