package DuAnTest;

import com.example.demo.DuAn.apDungVoucher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class apDungVoucherTest {
    apDungVoucher a = new apDungVoucher();
    public apDungVoucherTest() {
    }

    @Test //pass
    public void apDungVoucherTest01() {
        int test = a.apDungVoucher("80293992");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void apDungVoucherTest02() {
        int test = a.apDungVoucher("80898738");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void apDungVoucherTest03() {
        int test = a.apDungVoucher("80294941");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void apDungVoucherTest04() {
        int test = a.apDungVoucher("80295890");
        int ex=1;
        assertEquals(ex, test);
    }

    @Test //
    public void apDungVoucherTest05() {
        int test = a.apDungVoucher("");
        int ex=1;
        assertEquals(ex, test);
    }
}
