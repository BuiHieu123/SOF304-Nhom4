/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;


import domainmodel.NhanVien.HoaDon;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import repositorys.HoaDonRepository;

/**
 *
 * @author ASUS
 */
public class phaCheHoaDon {
    
    private String maHoaDon;
    private String maNhanVien;
    private String thoiGian;
    private String trangThaiThanhToan;
    private String trangThaiOrder;
    private String maVoucher;
    private String dichVuPhatSinh;
    private String ghiChu;

    public phaCheHoaDon() {
    }

    public phaCheHoaDon(String maHoaDon, String maNhanVien, String thoiGian, String trangThaiThanhToan, String trangThaiOrder, String maVoucher, String dichVuPhatSinh, String ghiChu) {
        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.thoiGian = thoiGian;
        this.trangThaiThanhToan = trangThaiThanhToan;
        this.trangThaiOrder = trangThaiOrder;
        this.maVoucher = maVoucher;
        this.dichVuPhatSinh = dichVuPhatSinh;
        this.ghiChu = ghiChu;
    }
    
    
//    
//    List<phaCheHoaDon> danhSachHD = getHoaDon();
//    
//    public int demSoLuong(List<phaCheHoaDon> listhd){
//        return listhd.size();
//    }
//    
//     int slpt = danhSachHD.size();
 
     
   
    
//    public static int demSoLuong(List<phaCheHoaDon> listhd){
//        return listhd.size();
//    }
////    
//   
//    public static void main(String[] args) {
//        int soLuong = demSoLuong(listhd);
//        System.out.println("sl la " + soLuong);
//    }
      
    
}
