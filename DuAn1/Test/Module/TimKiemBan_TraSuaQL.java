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
public class TimKiemBan_TraSuaQL {
    Ban sp = new Ban();
    List<Ban> lst = new ArrayList<>();

    public int SrcSP(String src) {
        lst.add(new Ban("B001", "Bàn 1", 1, "Còn hàng"));
        lst.add(new Ban("B002", "Bàn 2", 2, "Còn hàng"));
        lst.add(new Ban("B002", "Mang về", 0, "Còn hàng"));
        for (int i = 0; i < lst.size(); i++) {
            String inf = lst.get(i).getTenBan();
            if (src.equals(inf)) {
                return 1;
            }
        }
        return -1;
    }}
