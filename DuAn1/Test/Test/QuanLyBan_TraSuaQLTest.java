/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import model.Ban;
import org.junit.Test;
import static org.junit.Assert.*;
import Module.QuanLyBan_TraSuaQL;

/**
 * v
 * @author portg
 */
public class QuanLyBan_TraSuaQLTest {

    Ban ban;
    QuanLyBan_TraSuaQL fc;

    public QuanLyBan_TraSuaQLTest() {
        fc = new QuanLyBan_TraSuaQL();
    }

    @Test
    public void TC1() {
        ban = new Ban("B001", "Bàn 1", 1, "Còn hàng");
        int rs = fc.DelTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC2() {
        ban = new Ban("", "Bàn 1", 1, "Còn hàng");
        int rs = fc.DelTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC3() {
        ban = new Ban("B001", "Bàn 1", 1, "Còn hàng");
        int rs = fc.UptTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC4() {
        ban = new Ban("", "", 1, "");
        int rs = fc.DelTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC5() {
        ban = new Ban("B001", "Bàn 1", 1, "Còn hàng");
        int rs = fc.AddTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC6() {
        ban = new Ban("B004", "Bàn 1", 1, "Còn hàng");
        int rs = fc.AddTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC7() {
        ban = new Ban("", "Bàn 1", 1, "Còn hàng");
        int rs = fc.AddTbl(ban);
        int ex = 1;
        assertEquals(ex, rs);
    }

}
