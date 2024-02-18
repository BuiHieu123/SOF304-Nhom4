package TestSearchSanPhamPC;


import java.util.List;

public class SanPhamPC {
    SanPhamRepository  sanPhamRepository = new SanPhamRepository();

    public int getSanPhamTheoTen(String ten) {
        List<SanPhamDomainModel> sp = sanPhamRepository.getSanPhamTheoTen(ten);
        if(sp.size()>=1){
            return 1;
        }

        return -1;
    }

}
