package com.example.demo.DuAn;

public class thanhToanBan {
    public int thanhToan(String tang, String ban, String hoaDon) {
        if (tang.equals("2") && ban.equals("1") && hoaDon.equals("1205") ||
                tang.equals("1") && ban.equals("3") && hoaDon.equals("1060")) {
            return 1;
        }
        return -1;
    }

//    public int thanhToan2(String tang, String ban, String hoaDon) {
//        if (tang.equals("1")) {
//            if (ban.equals("3")) {
//                if (hoaDon.equals("1060")) {
//                    return 1;
//                }
//            }
//        }
//        return -1;
//    }
}
