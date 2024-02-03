/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module;

import java.util.ArrayList;
import java.util.List;
import model.Ban;

/**
 *
 * @author portg
 */
public class QuanLyBan_TraSuaQL {

    List<Ban> lst = new ArrayList<>();

    public int DelTbl(Ban sp) {
        lst.add(new Ban("B001", "Bàn 1", 1, "Còn hàng"));
        lst.add(new Ban("B002", "Bàn 2", 2, "Còn hàng"));
        lst.add(new Ban("B002", "Mang về", 0, "Còn hàng"));
        if (sp.getMaBan().equals(null) || sp.getTenBan().equals(null) || sp.getTthai().equals(null) || sp.getTang()<= 0) {
            return -1;
        } else {
            for (int i = 0; i < lst.size(); ++i) {
                if (!sp.getMaBan().equals(lst.get(i).getMaBan()) && sp.getMaBan() != "") {
                    lst.remove(i);
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }

    public int AddTbl(Ban sp) {
        lst.add(new Ban("B001", "Bàn 1", 1, "Còn hàng"));
        lst.add(new Ban("B002", "Bàn 2", 2, "Còn hàng"));
        lst.add(new Ban("B002", "Mang về", 0, "Còn hàng"));
        if (sp.getMaBan().equals(null) || sp.getTenBan().equals(null) || sp.getTthai().equals(null) || sp.getTang()<= 0) {
            return -1;
        } else {
            for (int i = 0; i < lst.size(); ++i) {
                if (!sp.getMaBan().equals(lst.get(i).getMaBan()) && sp.getMaBan() != "") {
                    lst.set(i, sp);
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }

    public int UptTbl(Ban sp) {
        lst.add(new Ban("B001", "Bàn 1", 1, "Còn hàng"));
        lst.add(new Ban("B002", "Bàn 2", 2, "Còn hàng"));
        lst.add(new Ban("B002", "Mang về", 0, "Còn hàng"));
        if (sp.getMaBan().equals(null) || sp.getTenBan().equals(null) || sp.getTthai().equals(null) || sp.getTang()<= 0) {
            return -1;
        } else {
            for (int i = 0; i < lst.size(); ++i) {
                if (sp.getMaBan().equals(lst.get(i).getMaBan())) {
                    lst.set(i, sp);
                    return 1;
                }
            }
        }
        return -1;
    }


}
