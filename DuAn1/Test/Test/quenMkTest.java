/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import Module.quenMk;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alldy
 */
public class quenMkTest {
    quenMk q = new quenMk();
    public quenMkTest() {
    }

//    @Test
//    public void testQuenMk() {
//    }
    
    @Test //pass
    public void testQuenMk01() {
    int test = q.quenMk("tk01", "thanhtqph30275@fpt.edu.vn");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do trong
    public void testQuenMk02() {
    int test = q.quenMk("", "");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do trống email
    public void testQuenMk03() {
    int test = q.quenMk("tk01", "");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do trống tk
    public void testQuenMk04() {
    int test = q.quenMk("", "thanhtqph30275@fpt.edu.vn");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do sai mail
    public void testQuenMk05() {
    int test = q.quenMk("tk01", "thanhtqph30275");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do sai mail
    public void testQuenMk06() {
    int test = q.quenMk("tk01", "thanhtqph30275==");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do sai tk
    public void testQuenMk07() {
    int test = q.quenMk("tk1", "thanhtqph30275@fpt.edu.vn");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //fail do sai tk và mail
    public void testQuenMk08() {
    int test = q.quenMk("tk1", "abc");
        int ex=1;
        assertEquals(ex, test);
    }
  

}
