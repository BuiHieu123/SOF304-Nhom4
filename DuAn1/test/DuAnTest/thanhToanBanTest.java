package DuAnTest;

import com.example.demo.DuAn.thanhToanBan;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class thanhToanBanTest {
    thanhToanBan t = new thanhToanBan();
    public thanhToanBanTest() {
    }

    @Test //pass
    public void xacNhanMkTest01() {
        int test = t.thanhToan("2", "1", "1205");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest02() {
        int test = t.thanhToan("1", "3", "1060");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest03() {
        int test = t.thanhToan("3", "1", "1205");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest04() {
        int test = t.thanhToan("1", "2", "1060");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest05() {
        int test = t.thanhToan("2", "1", "1206");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest06() {
        int test = t.thanhToan("", "1", "1205");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest07() {
        int test = t.thanhToan("2", "", "1205");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest08() {
        int test = t.thanhToan("2", "1", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest09() {
        int test = t.thanhToan("", "3", "1060");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest10() {
        int test = t.thanhToan("1", "", "1060");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest11() {
        int test = t.thanhToan("1", "3", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest12() {
        int test = t.thanhToan("", "", "");
        int ex=1;
        assertEquals(ex, test);
    }
}
