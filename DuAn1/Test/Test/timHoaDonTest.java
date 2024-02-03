/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import Module.timHoaDon;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Alldy
 */
public class timHoaDonTest {
    timHoaDon hd = new timHoaDon();
    public timHoaDonTest() {
    }

//    @Test
//    public void testTimTheoNgay() {
//    }
    @Test //pass
    public void testTimTheoNgay01() {
        int test = hd.timTheoNgay("28/07/2023");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //null
    public void testTimTheoNgay02() {
        int test = hd.timTheoNgay("");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //sai ngay
    public void testTimTheoNgay03() {
        int test = hd.timTheoNgay("30/07/2023");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //sai dịnh dạng
    public void testTimTheoNgay04() {
        int test = hd.timTheoNgay("2023/07/30");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //sai dịnh dạng
    public void testTimTheoNgay05() {
        int test = hd.timTheoNgay("abc");
        int ex=1;
        assertEquals(ex, test);
    }

//    @Test
//    public void testTimTheoMaHD() {
//    }
    @Test
    public void testTimTheoMaHD01() {
        int test = hd.timTheoMaHD("1001");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimTheoMaHD02() {
        int test = hd.timTheoMaHD("");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimTheoMaHD03() {
        int test = hd.timTheoMaHD("2002");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimTheoMaHD04() {
        int test = hd.timTheoMaHD("abc");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testTimTheoMaHD05() {
        int test = hd.timTheoMaHD("a123");
        int ex=1;
        assertEquals(ex, test);
    }
    
}
