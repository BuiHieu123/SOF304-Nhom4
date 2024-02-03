/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import Module.dangnhap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class dangnhapTest {
    dangnhap d = new dangnhap();
    
    public dangnhapTest() {
    }    
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckLogin() {
        assertTrue(d.checkLogin("", ""));
    }

    @Test
    public void testCheckTrungdb() {
        String user = "123";
        String userdb = "456";
        assertTrue(d.checkTrungdb(user, userdb));
                
        
    }

    @Test
   public void testCheckTrungMkdb() {
        String pass = "namnh";
        String passdb = "namnh";
        assertTrue(d.checkTrungMkdb(pass, passdb));
    }
    
}
