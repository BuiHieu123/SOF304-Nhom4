
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

//        @Test
//        public void testXoaSP1() {
//            int test = qlsp.xoa(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
//            int ex = 1;
//            assertEquals(ex, test);
//        }


    }
