/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module;

/**
 *
 * @author Alldy
 */
public class timHoaDonChiTiet {

    public int timHD(String maNv, String ngayBatDau, String ngayKetThuc,
            String trangThai) {
        if (maNv.equals("NV01")) {
            if (ngayBatDau.equals("01/07/2023")) {
                if (ngayKetThuc.equals("02/07/2023")) {
                    if (trangThai.endsWith("Đã Thanh Toán")) {
                        return 1;
                    }
                }
            } 
        }
        return -1;
    }
    }

