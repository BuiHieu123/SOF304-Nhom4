package DuAnTest;

import com.example.demo.DuAn.hoaDonSP;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class hoaDonSPTest {
    hoaDonSP h = new hoaDonSP();
    public hoaDonSPTest() {
    }

    @Test //pass
    public void hoaDonSPTest01() {
        int test = h.hoaDon("2", "2", "Tiger sugar", "M", "nhiều đường", "23");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest02() {
        int test = h.hoaDon("1", "3", "Tiger sugar", "L", "ít đường", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest03() {
        int test = h.hoaDon("", "", "", "", "", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest04() {
        int test = h.hoaDon("", "2", "Tiger sugar", "M", "nhiều đường", "23");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest05() {
        int test = h.hoaDon("2", "", "Tiger sugar", "M", "nhiều đường", "23");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest06() {
        int test = h.hoaDon("2", "2", "", "M", "nhiều đường", "23");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest07() {
        int test = h.hoaDon("2", "2", "Tiger sugar", "", "nhiều đường", "23");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest08() {
        int test = h.hoaDon("2", "2", "Tiger sugar", "M", "", "23");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void hoaDonSPTest09() {
        int test = h.hoaDon("2", "2", "Tiger sugar", "M", "nhiều đường", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest10() {
        int test = h.hoaDon("", "3", "Tiger sugar", "L", "ít đường", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest11() {
        int test = h.hoaDon("1", "", "Tiger sugar", "L", "ít đường", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest12() {
        int test = h.hoaDon("1", "3", "", "L", "ít đường", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest13() {
        int test = h.hoaDon("1", "3", "Tiger sugar", "", "ít đường", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest14() {
        int test = h.hoaDon("1", "3", "Tiger sugar", "L", "", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void hoaDonSPTest15() {
        int test = h.hoaDon("1", "3", "Tiger sugar", "L", "ít đường", "1");
        int ex=1;
        assertEquals(ex, test);
    }
}
