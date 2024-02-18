package TestPackages.AccountRunner;


import Test.Account.AccountTest;
import Test.Account.SearchTest;
import domainmodel.Role;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.TaiKhoanServicess;
import viewmodel.TaiKhoanViewModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duong
 */
public class TestSearchAccount {
    private SearchTest tkSv ;

    @Before
    public void newMain(){
        tkSv = new SearchTest();
    }

    //kiểm tra tìm kiếm thành công
     @Test
    public void testSearch(){
     int eq = tkSv.searchAc("TKQL1000");
        int ex = 1;
        Assert.assertEquals(ex, eq);
       
        
        
    }
    //kiểm tra lỗ hổng sql ịnjection
     @Test
    public void testSearchSqlIn(){
     int eq = tkSv.searchAc("union select * from TaiKhoan where TaiKhoan.MaTaiKhoan = 'TKQL1000'");
        int ex= -1;
        Assert.assertEquals(ex, eq);
       
        
        
    }
    //kiểm tra người dùng nhập emoji
     @Test
    public void testSearchEmoji(){
     int eq = tkSv.searchAc("🤦‍♀️💕👏🎉💕🌹💋");
        int ex=-1;
        Assert.assertEquals(ex, eq);
       
        
        
    }
    //kiểm tra người dùng nhập 100 ký tự
     @Test
    public void testSearch100Char(){
     int eq = tkSv.searchAc("1234567890qwertyiuoasdgjljzxznxcbn,s;ádwnhasacacaweq");
        int ex=-1;
        Assert.assertEquals(ex, eq);
       
        
        
    }
    //kiếm tra người dùng nhập bừa
     @Test
    public void testSearchInput(){
     int eq = tkSv.searchAc("qưeqsasda");
        int ex=-1;
        Assert.assertEquals(ex, eq);
       
        
        
    }
    //kiểm tra người dùng nhập là số
        @Test
    public void testSearchInputNumber(){
     int eq = tkSv.searchAc("1231231");
        int ex=-1;
        Assert.assertEquals(ex, eq);
       
        
        
    }
    
    @After
    public void printMessage(){
        System.out.println("checked");
    }
   
}
