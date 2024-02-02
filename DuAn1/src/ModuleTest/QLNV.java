/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuleTest;

import domainmodel.NhanVienTest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin 88
 */
public class QLNV {

    public int searchNVbyName(String name) {
        if (name.equalsIgnoreCase("Nam")) {
            return 1;
        }
        return -1;
    }

    public int addNV(NhanVienTest nv) {
        List<NhanVienTest> lst = new ArrayList<>();
        lst.add(new NhanVienTest("NV01", "Bui Minh Hieu", "12-6-2003", "Ha Nam", "03572482932", "Đang Làm Việc", "hieubmph21306@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        lst.add(new NhanVienTest("NV02", "Bui Minh Hieu1", "12-6-2003", "Ha Nam", "03572482932", "Đang Làm Việc", "hieubmph21307@fpt.edu.vn", "0218329392", "", "Quản Lý"));
        lst.add(new NhanVienTest("NV03", "Bui Minh Hieu2", "12-6-2003", "Ha Nam", "03572482932", "Đang Làm Việc", "hieubmph21308@fpt.edu.vn", "0218329392", "", "Nhân Viên"));
        if (nv.getMaNhanVien().equals("") || nv.getHoVaTen().equals("") || nv.getNgaySinh().equals("") || nv.getDiaChi().equals("") || nv.getCCCD().equals("") || nv.getTrangThai().equals("") || nv.getEmail().equals("") || nv.getSoDienThoai().equals("") || nv.getChucVu().equals("")) {
            return -1;
        } else {
            return 1;
        }
    }

}
