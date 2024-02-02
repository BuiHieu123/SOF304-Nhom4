 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCase;

import ModuleTest.QLNV;
import domainmodel.NhanVienTest;
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
    
    //Test ADD
    @Test
    public void testAddNV01(){
        int test=qlnv.addNV(new NhanVienTest("NV01", "Bui Minh Hieu", "12-6-2003", "Ha Nam", "03572482932", "Đang Làm Việc", "hieubmph21306@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testAddNV02(){
        int test=qlnv.addNV(new NhanVienTest("NV01", "", "12-6-2003", "Ha Nam", "03572482932", "Đang Làm Việc", "hieubmph21306@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testAddNV03(){
        int test=qlnv.addNV(new NhanVienTest("NV02", "Bui Minh Hieu1", "", "Ha Nam", "03572482932", "Đang Làm Việc", "hieubmph21306@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testAddNV04(){
        int test=qlnv.addNV(new NhanVienTest("NV03", "Bui Minh Hieu", "12-6-2003", "", "03572482932", "Đang Làm Việc", "hieubmph21306@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        int ex=1;
        assertEquals(ex, test);
    }
    @Test
    public void testAddNV05(){
        int test=qlnv.addNV(new NhanVienTest("NV01", "Bui Minh Hieu", "12-6-2003", "Ha Nam", "", "Đang Làm Việc", "hieubmph21306@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        int ex=1;
        assertEquals(ex, test);
    }
  
    
}
