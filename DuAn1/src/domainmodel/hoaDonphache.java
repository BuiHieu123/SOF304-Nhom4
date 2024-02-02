/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class hoaDonphache {
    public List<phaCheHoaDon> listhd;
    
    public hoaDonphache(){
        listhd = new ArrayList<>();
        listhd.add(new phaCheHoaDon("01", "01", "2023-08-14", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("02", "02", "2023-08-15", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("03", "03", "2023-08-15", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("04", "04", "2023-08-15", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("05", "05", "2023-08-15", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("06", "06", "2023-08-15", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("07", "07", "2023-08-16", "0", "0", "0", "2000", "nhiều đường"));
        listhd.add(new phaCheHoaDon("08", "08", "2023-08-16", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("09", "09", "2023-08-16", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("10", "10", "2023-08-16", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("11", "11", "2023-08-16", "0", "0", "0", "2000", "ít đường"));
        listhd.add(new phaCheHoaDon("12", "12", "2023-08-17", "0", "0", "0", "2000", "ít đường"));
    }
    
    public List<phaCheHoaDon> getHoaDon(){
        return listhd;
    }
    
    public int demSoLuongPhanTu01() {
        return listhd.size();
    }
    
   public List<phaCheHoaDon> listhd02 = new ArrayList<>();
   public int demSoLuongPhanTu02() {
        return listhd02.size();
    }
   
   
}
