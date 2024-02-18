package RunnerTest;

public class HoaDonTNTest {
    private ThuNganSearch tn;

    @Before
    public void Start(){
        tn = new ThuNganSearch();
    }

    //kiểm tra tìm kiếm thành công
    @Test
    public void testSearch(){
        int eq = tn.TimKiemQLHoaDon(1);
        int ex = 1;
        Assert.assertEquals(ex, eq);



    }
    //kiểm tra lỗ hổng sql ịnjection
    @Test
    public void testSearchSqlIn(){
        int eq = tn.TimKiemQLHoaDon(Integer.valueOf("select * from hoadon"));
        int ex= -1;
        Assert.assertEquals(ex, eq);



    }
    //kiểm tra Null
    @Test
    public void testSearchNull(){
        int eq = tn.TimKiemQLHoaDon(null);
        int ex= -1;
        Assert.assertEquals(ex, eq);



    }
    //kiểm tra emoji
    @Test
    public void testSearchEmoji(){
        int eq = tn.TimKiemQLHoaDon(Integer.valueOf("❤🤣😂😊😍😒👌"));
        int ex= -1;
        Assert.assertEquals(ex, eq);



    }

    @After
    public void printMessage(){
        System.out.println("checked");
    }

}
