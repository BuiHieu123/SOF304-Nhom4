package ModuleTest;

import domainmodel.SanPhamTest;

import java.util.ArrayList;
import java.util.List;

public class QLSP {
    public int addSP(SanPhamTest sp) {
        List<SanPhamTest> list = new ArrayList<>();
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        if (sp.getMaSanPham().equals("") || sp.getTenSanPham().equals("") || sp.getTrangThai().equals("") || sp.getMotTa().equals("") || sp.getAnh().equals("") || sp.getSize().equals("") || sp.getGia().equals("")) {
            return -1;
        } else {
            return 1;
        }
        }

    public int sua(SanPhamTest sp){
        List<SanPhamTest> list =new ArrayList<>();
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        for (SanPhamTest a : list) {
            if(sp.getMaSanPham().equals(a.getMaSanPham())){
                a=sp;
                return 1;
            }
        }
        return -1;
    }

    public int xoa(String masanpham){
        List<SanPhamTest> list =new ArrayList<>();
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        int sl= list.size();
        for (SanPhamTest a : list) {
            if(masanpham.equals(a.getMaSanPham())){
                list.remove(a);
            }
        }
        if(list.size()<sl){
            return 1;
        }
        return -1;
    }
    }
