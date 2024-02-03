
import domainmodel.SanPhamTest;
import org.junit.Test;
import ModuleTest.QLSP;
import static org.junit.Assert.assertEquals;

public class QLSPTest {
    QLSP qlsp = new QLSP();



    public  QLSPTest() {
    }

        @Test
        public void testAddSP1() {
            int test = qlsp.addSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
            int ex = 1;
            assertEquals(ex, test);
        }

        @Test
        public void testAddSP3() {
            int test = qlsp.addSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
            int ex = 1;
            assertEquals(ex, test);
        }

        @Test
        public void testAddSP4() {
            int test = qlsp.addSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
            int ex = 1;
            assertEquals(ex, test);
        }

    @Test
    public void TC1() {
        int rs = qlsp.DelSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void TC2() {
        int rs = qlsp.DelSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int ex = 1;
        assertEquals(ex, rs);
    }
    @Test
    public void TC3() {
        int rs = qlsp.DelSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void Up1() {
        int rs = qlsp.UptSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int ex = 1;
        assertEquals(ex, rs);
    }

    @Test
    public void Up2() {
        int rs = qlsp.UptSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int ex = 1;
        assertEquals(ex, rs);
    }
    @Test
    public void Up3() {
        int rs = qlsp.UptSP(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int ex = 1;
        assertEquals(ex, rs);
    }





//        @Test
//        public void testXoaSP1() {
//            int test = qlsp.xoa(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
//            int ex = 1;
//            assertEquals(ex, test);
//        }


    }
