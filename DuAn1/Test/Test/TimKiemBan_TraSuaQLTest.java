/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import Module.TimKiemBan_TraSuaQL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author portg
 */
public class TimKiemBan_TraSuaQLTest {
    
 TimKiemBan_TraSuaQL ban;
    
    public TimKiemBan_TraSuaQLTest() {
        ban = new TimKiemBan_TraSuaQL();
    }

    @Test
    public void TC1() {
        int rs = ban.SrcSP("");
        int ex = 1;
        assertEquals(ex, rs);
    }
    
    @Test
    public void TC2() {
        int rs = ban.SrcSP("Bàn 1");
        int ex = 1;
        assertEquals(ex, rs);
    }
    
    @Test
    public void TC3() {
        int rs = ban.SrcSP("SP2");
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void testSrcSP() {
    }

    
}
