package DuAnTest;

import com.example.demo.DuAn.timKiem;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class timKiemTest {
    timKiem s = new timKiem();
    public timKiemTest() {
    }

    @Test //pass
    public void timKiemTest01() {
        int test = s.timKiem("Tiger sugar");
        int ex = 1;
        assertEquals(ex, test);
    }

    @Test
    public void timKiemTest02() {
        int test = s.timKiem("Trà");
        int ex = 1;
        assertEquals(ex, test);
    }

    @Test //fail
    public void timKiemTest03() {
        int test = s.timKiem("133");
        int ex = 1;
        assertEquals(ex, test);
    }

    @Test //fail
    public void timKiemTest04() {
        int test = s.timKiem("abc");
        int ex = 1;
        assertEquals(ex, test);
    }

    @Test //fail
    public void timKiemTest05() {
        int test = s.timKiem("");
        int ex = 1;
        assertEquals(ex, test);
    }
}
