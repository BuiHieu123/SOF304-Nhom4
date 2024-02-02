/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCase;

import ModuleTest.QLNV;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Admin 88
 */
public class QLNVTest {

    QLNV qlnv = new QLNV();

    public QLNVTest() {
    }

    @Test //pass
    public void testSearchbyName01() {
        int test = qlnv.searchNVbyName("Nam");
        int ex = 1;
        assertEquals(ex, test);
    }
     @Test //fail
    public void testSearchbyName02() {
        int test = qlnv.searchNVbyName("am");
        int ex = 1;
        assertEquals(ex, test);
    }
     @Test //fail
    public void testSearchbyName03() {
        int test = qlnv.searchNVbyName("");
        int ex = 1;
        assertEquals(ex, test);
    }
    
}
