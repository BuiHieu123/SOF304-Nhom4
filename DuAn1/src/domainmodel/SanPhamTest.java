package domainmodel;

import java.math.BigDecimal;
import java.sql.Blob;

public class SanPhamTest {
    private String maSanPham;
    private String tenSanPham;
    private String trangThai;
    private String motTa;
    private String anh;
    private String size;
    private String gia;


    public SanPhamTest() {
    }
    public SanPhamTest(String maSanPham, String tenSanPham, String trangThai, String motTa, String anh, String size, String gia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.trangThai = trangThai;
        this.motTa = motTa;
        this.anh = anh;
        this.size = size;
        this.gia = gia;
    }
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getMotTa() {
        return motTa;
    }

    public void setMotTa(String motTa) {
        this.motTa = motTa;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
