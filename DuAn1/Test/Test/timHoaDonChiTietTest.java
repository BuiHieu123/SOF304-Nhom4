/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import Module.timHoaDonChiTiet;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Alldy
 */
public class timHoaDonChiTietTest {
    timHoaDonChiTiet hdct = new timHoaDonChiTiet();
    public timHoaDonChiTietTest() {
    }

//    @Test
//    public void testTimHD() {
//    }
    @Test
    public void testTimHD01() {
        int test = hdct.timHD("NV01", "01/07/2023","02/07/2023","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD02() {
        int test = hdct.timHD("", "","","");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD03() {
        int test = hdct.timHD("", "01/07/2023","02/07/2023","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD04() {
        int test = hdct.timHD("NV01", "","02/07/2023","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD05() {
        int test = hdct.timHD("NV01", "01/07/2023","","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD06() {
        int test = hdct.timHD("NV02", "01/07/2023","02/07/2023","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD07() {
        int test = hdct.timHD("NV01", "30/07/2023","31/07/2023","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimHD08() {
        int test = hdct.timHD("abc", "abc","abc","Đã Thanh Toán");
        int ex=1;
        assertEquals(ex, test);
    }
    
}
