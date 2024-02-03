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
public class TestUpdateAccount {
    
       private AccountTest acT;
    
    @Before
    public void newMain(){
    acT = new AccountTest();
    }
    //test null update
    @Test
    public void testUpdateNull(){
      Role role = Role.NhanVien;
        boolean eq = acT.updateTaiKhoan("", 0, "", null, 2);
       boolean ex = false   ;
        Assert.assertEquals(ex, eq);
    }
    //test update thành công
      @Test
    public void testUpdateSuccess(){
      Role role = Role.QuanLy;
        boolean eq = acT.updateTaiKhoan("TKQL1000", 1000, "testsucess", role.toString(), 1);
       boolean ex = true   ;
        Assert.assertEquals(ex, eq);
    }
    //test không nhập mã nhân viên
      @Test
    public void testUpdateNoMaNV(){
      Role role = Role.QuanLy;
        boolean eq = acT.updateTaiKhoan("TKQL1000", 0, "nomanv", role.toString(), 1);
       boolean ex = false   ;
        Assert.assertEquals(ex, eq);
    }
    //test không nhập mật khẩu
      @Test
    public void testUpdateNoPassword(){
      Role role = Role.NhanVien;
        boolean eq = acT.updateTaiKhoan("TKQL1000", 1000, "", role.toString(), 1);
       boolean ex = false   ;
        Assert.assertEquals(ex, eq);
    }
    
        //test không chọn trạng thái
      @Test
    public void testUpdateNoStatus(){
      Role role = Role.NhanVien;
        boolean eq = acT.updateTaiKhoan("TKQL1000", 1000, "", role.toString(), null);
       boolean ex = false   ;
        Assert.assertEquals(ex, eq);
    }
     @After
    public void printMessage(){
        System.out.println("checked");
    }
}
