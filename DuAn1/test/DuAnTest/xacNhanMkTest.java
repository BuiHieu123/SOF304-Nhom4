package DuAnTest;

import com.example.demo.DuAn.xacNhanMk;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class xacNhanMkTest {
    xacNhanMk x = new xacNhanMk();
    public xacNhanMkTest() {
    }

    @Test //pass
    public void xacNhanMkTest01() {
        int test = x.xacNhanMk("123456", "123456");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest02() {
        int test = x.xacNhanMk("abcxyz", "abcxyz");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest03() {
        int test = x.xacNhanMk("123456", "abcxyz");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void xacNhanMkTest04() {
        int test = x.xacNhanMk("", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest05() {
        int test = x.xacNhanMk("abcxyz", "123456");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest06() {
        int test = x.xacNhanMk("", "123456");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest07() {
        int test = x.xacNhanMk("123456", "");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest08() {
        int test = x.xacNhanMk("", "abcxyz");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //pass
    public void xacNhanMkTest09() {
        int test = x.xacNhanMk("abcxyz", "");
        int ex=1;
        assertEquals(ex, test);
    }
}
