/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuleTest;

/**
 *
 * @author Admin 88
 */
public class DoiMatKhau {
    public String changePassword(String oldPassword, String newPassword, String confirmPassword) {
        // Kiểm tra mật khẩu cũ có đúng hay không
        if(oldPassword.isBlank()){
             if (!checkOldPassword(oldPassword)) {
           if  (!newPassword.equals(confirmPassword)) {
            return "New password and confirm password do not match";
        }
      }
    }
       
        // Trả về thông báo thành công
        return "Password changed successfully";
    }

    private boolean checkOldPassword(String oldPassword) {
        // Logic kiểm tra mật khẩu cũ ở đây
    
        if(oldPassword.equals("quanly1000")){   
        }
        return true; // Giả sử mật khẩu cũ là đúng
    }

    
}

