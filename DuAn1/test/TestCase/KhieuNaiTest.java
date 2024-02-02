/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCase;

import ModuleTest.KhieuNai;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Admin 88
 */
public class KhieuNaiTest {
    KhieuNai kn=new KhieuNai();
     public KhieuNaiTest() {
    }
    @Test //pass
    public void testKN01() {
        String test = kn.checkKhieuNai("abc");
         assertEquals("Gửi Email thành công",test);
    }
    @Test //fail
    public void testKN02() {
        String test = kn.checkKhieuNai("");
         assertEquals("Nội dung khiếu nại không được bỏ trống",test);
    }
}
