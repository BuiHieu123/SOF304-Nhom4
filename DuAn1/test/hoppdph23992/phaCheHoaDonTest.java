/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoppdph23992;

import domainmodel.hoaDonphache;
import domainmodel.phaCheHoaDon;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ASUS
 */
public class phaCheHoaDonTest {
    
    hoaDonphache pchd = new hoaDonphache();
    
     int soLuong = pchd.demSoLuongPhanTu01();
     int sl11 = pchd.demSoLuongPhanTu02();
    
    @Test //pass
    public void testPHD12(){
        int test;
        if(soLuong==12){
            test =1;
        }else{
            test = -1;
        }
        int ex =1;
        assertEquals(ex,test);
    }
    
    @Test //pass
    public void testPHD11(){
        int test;
        if(sl11==0){
            test =1;
        }else{
            test = -1;
        }
        int ex =1;
        assertEquals(ex,test);
    }
}
