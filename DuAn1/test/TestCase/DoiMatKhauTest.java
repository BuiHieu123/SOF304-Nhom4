/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ModuleTest.DoiMatKhau;

/**
 *
 * @author Admin 88
 */
public class DoiMatKhauTest {
    DoiMatKhau dmk = new DoiMatKhau();
    public DoiMatKhauTest() {
    }
    @Test //pass
    public void testDoiMk01() {
        String test = dmk.changePassword("quanly1000","hieu123", "hieu123");
         assertEquals("Password changed successfully",test);
    }
    @Test //fail
    public void testDoiMk02() {
        String test = dmk.changePassword("","", "");
         assertEquals("OldPassword is blank",test);
    }
     @Test //fail
    public void testDoiMk03() {
        String test = dmk.changePassword("quanly2000","hieu123", "hieu123");
         assertEquals("OldPassword is incorrect",test);
    }
    @Test //fail
    public void testDoiMk04() {
        String test = dmk.changePassword("quanly1000","hieu123","hieu000");
         assertEquals("New password and confirm password do not match",test);
    }
}


