/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test.Account;

import domainmodel.TaiKhoanDomail;
import repositorys.TaiKhoanRepositorys;
import viewmodel.TaiKhoanViewModel;

/**
 *
 * @author duong
 */
public class SearchTest {
    private TaiKhoanRepositorys taiKhoanRepositorys =  new  TaiKhoanRepositorys();

      
    public int searchAc(String maTk){
    
        TaiKhoanDomail taiKhoanDomail = taiKhoanRepositorys.getTaiKhoanByMa(maTk);
        
        if(taiKhoanDomail != null){
        return 1;
        }
        return -1;
    }
       
    
}
