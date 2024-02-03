/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module;

/**
 *
 * @author Admin
 */
public class dangnhap {
// check rỗng
    public boolean checkLogin(String user, String pass) {
        if (user.equals("") && pass.equals("")) {
            return true;
        }
        return false;
    }
    // check trùng
    public boolean checkTrungdb(String user, String userdb){
        return user.equals(userdb);
        
    }
    public boolean checkTrungMkdb(String pass, String passdb){
        return pass.equals(passdb);
    }
    
}
