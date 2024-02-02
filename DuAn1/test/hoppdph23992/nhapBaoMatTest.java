/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoppdph23992;

import domainmodel.nhapBaoMat;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author ASUS
 */
public class nhapBaoMatTest {
    nhapBaoMat n = new nhapBaoMat();
    public nhapBaoMatTest(){
         }
    
    @Test //pass
    public void testBM11(){
        int test = n.NhapMaBaoMat("255251");
        int ex =1;
        assertEquals(ex,test);
    }
    @Test //Kiểm tra trống
    public void testBM12() {
    int test = n.NhapMaBaoMat("");
        int ex=1;
        assertEquals(ex, test);
    }
     @Test //Điền mã cả chữ và số
    public void testBM13() {
    int test = n.NhapMaBaoMat("2awfwegew");
        int ex=1;
        assertEquals(ex, test);
    }
     @Test //Điền mã cả chữ và số
    public void testBM14() {
    int test = n.NhapMaBaoMat("3qy4ay4y4");
        int ex=1;
        assertEquals(ex, test);
    }
     @Test //Điền mã cả chữ và số
    public void testBM15() {
    int test = n.NhapMaBaoMat("38gy5ya54");
        int ex=1;
        assertEquals(ex, test);
    }
     @Test //Điền mã cả chữ và số
    public void testBM16() {
    int test = n.NhapMaBaoMat("dh54wey53");
        int ex=1;
        assertEquals(ex, test);
    }
     @Test //Điền mã cả chữ và số
    public void testBM17() {
    int test = n.NhapMaBaoMat("zfh35234ds");
        int ex=1;
        assertEquals(ex, test);
    }
     @Test // Điền dữ liệu có dấu cách
    public void testBM18() {
    int test = n.NhapMaBaoMat("24wa  sfdsg");
        int ex=1;
        assertEquals(ex, test);
    }
    
     @Test //Điền dữ liệu có dấu cách
    public void testBM19() {
    int test = n.NhapMaBaoMat("124 234");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có dấu cách
    public void testBM110() {
    int test = n.NhapMaBaoMat("4 53 235");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có dấu cách
    public void testBM111() {
    int test = n.NhapMaBaoMat("252 32 2");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có dấu cách
    public void testBM112() {
    int test = n.NhapMaBaoMat("x ra wr3 34");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có kí tự đặc biệt
    public void testBM113() {
    int test = n.NhapMaBaoMat("#$@%#@");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có kí tự đặc biệt
    public void testBM114() {
    int test = n.NhapMaBaoMat("%$ $%# ");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có kí tự đặc biệt
    public void testBM115() {
    int test = n.NhapMaBaoMat("24$#2a 3*");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có kí tự đặc biệt
    public void testBM116() {
    int test = n.NhapMaBaoMat("dfh%$%&#");
        int ex=1;
        assertEquals(ex, test);
    }
    @Test //Điền dữ liệu có kí tự đặc biệt
    public void testBM117() {
    int test = n.NhapMaBaoMat("264@231!!");
        int ex=1;
        assertEquals(ex, test);
    }
    
}
