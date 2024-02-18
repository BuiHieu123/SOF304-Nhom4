package RunnerTest;

public class SanPhamTest {

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

    /**
     *
     * @author duong
     */

        private SanPhamPC pc;

        @Before
        public void Start(){
            pc = new SanPhamPC();
        }

        //kiểm tra tìm kiếm thành công
        @Test
        public void testSearch(){
            int eq = pc.getSanPhamTheoTen("keo");
            int ex = 1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra lỗ hổng sql ịnjection
        @Test
        public void testSearchSqlIn(){
            int eq = pc.getSanPhamTheoTen("union select * from TaiKhoan where TaiKhoan.MaTaiKhoan = 'TKQL1000'");
            int ex= -1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra người dùng nhập emoji
        @Test
        public void testSearchEmoji(){
            int eq = pc.getSanPhamTheoTen("🤦‍♀️💕👏🎉💕🌹💋");
            int ex=-1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra người dùng nhập khong co trong Db
        @Test
        public void testSearchNoExits(){
            int eq = pc.getSanPhamTheoTen("banh");
            int ex=-1;
            Assert.assertEquals(ex, eq);



        }
        //kiếm tra người dùng nhập Blank
        @Test
        public void testSearchInput(){
            int eq = pc.getSanPhamTheoTen(" ");
            int ex=-1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra người dùng nhập là số
        @Test
        public void testSearchInputNumber(){
            int eq = pc.getSanPhamTheoTen("123456789");
            int ex=-1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra người dùng nhập 100 ký tự
        @Test
        public void testSearch100Char(){
            int eq = pc.getSanPhamTheoTen("1234567890qwertyiuoasdgjljzxznxcbn,s;ádwnhasacacaweq");
            int ex=-1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra người dùng nhập 1 ký tự
        @Test
        public void testSearch1Char(){
            int eq = pc.getSanPhamTheoTen("k");
            int ex=1;
            Assert.assertEquals(ex, eq);



        }
        //kiểm tra người dùng nhập In Hoa
        @Test
        public void testSearchSChar(){
            int eq = pc.getSanPhamTheoTen("KEO");
            int ex=1;
            Assert.assertEquals(ex, eq);



        }
        @After
        public void printMessage(){
            System.out.println("checked");
        }

    }
