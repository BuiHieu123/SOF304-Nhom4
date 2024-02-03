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

    public int UptSP(SanPhamTest sp) {
        List<SanPhamTest> list = new ArrayList<>();
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        if (sp.getMaSanPham().equals("") || sp.getTenSanPham().equals("") || sp.getTrangThai().equals("") || sp.getMotTa().equals("") || sp.getAnh().equals("") || sp.getSize().equals("") || sp.getGia().equals("")) {
            return -1;
        } else {
            for (int i = 0; i < list.size(); ++i) {
                if (sp.getMaSanPham().equals(list.get(i).getMaSanPham())) {
                    list.set(i, sp);
                    return 1;
                }
            }
        }
        return -1;
    }

    public int DelSP(SanPhamTest sp) {
        List<SanPhamTest> list = new ArrayList<>();
        list.add(new SanPhamTest("1000", "Trà bưởi", "còn hàng", "ngon", "", "L", "1000"));
        if (sp.getMaSanPham().equals("") || sp.getTenSanPham().equals("") || sp.getTrangThai().equals("") || sp.getMotTa().equals("") || sp.getAnh().equals("") || sp.getSize().equals("") || sp.getGia().equals("")) {
            return -1;
        } else {
            for (int i = 0; i < list.size(); ++i) {
                if (!sp.getMaSanPham().equals(list.get(i).getMaSanPham()) && sp.getMaSanPham() != "") {
                    list.remove(i);
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return -1;

    }
}
