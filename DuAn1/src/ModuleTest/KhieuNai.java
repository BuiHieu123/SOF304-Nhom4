/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuleTest;

/**
 *
 * @author Admin 88
 */
public class KhieuNai {
     public String checkKhieuNai(String noiDungKhieuNai) {
        // Kiểm tra Nội dung khiếu nại có trống hay không
        if(noiDungKhieuNai.isBlank()){   
            return "Không được bỏ trống nội dung";
        }       
        // Trả về thông báo thành công
        return "Gửi Email thành công";
    }
}
