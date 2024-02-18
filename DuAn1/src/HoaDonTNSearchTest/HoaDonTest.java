package HoaDonTNSearchTest;

public class HoaDonTest {
    private HoaDonRepository HoaDonRepo = new HoaDonRepository();

    public int  TimKiemQLHoaDon(Integer maHoaDon) {
        HoaDonDoMainModel danhSachHD =  HoaDonRepo.getById(maHoaDon) ;

        if(danhSachHD !=null){
            return 1;
        }

        return -1;
    }
}
