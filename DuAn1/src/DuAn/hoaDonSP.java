package com.example.demo.DuAn;

public class hoaDonSP {
    public int hoaDon(String tang, String ban, String sp, String size, String ghiChu, String dvps) {
        if (tang.equals("2") && ban.equals("2") && sp.equals("Tiger sugar") && size.equals("M") && ghiChu.equals("nhiều đường") && dvps.equals("23") ||
                tang.equals("1") && ban.equals("3") && sp.equals("Tiger sugar") && size.equals("L") && ghiChu.equals("ít đường") && dvps.equals("")) {
            return 1;
        }
        return -1;
    }

//    public int hoaDon2(String tang, String ban, String sp, String size, String ghiChu, String dvps) {
//        if (tang.equals("2")) {
//            if (ban.equals("2")) {
//                if (sp.equals("Tiger sugar")) {
//                    if (size.equals("M")) {
//                        if (ghiChu.equals("nhiều đường")) {
//                            if (dvps.equals("")) {
//                                return 1;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return -1;
//    }
}
