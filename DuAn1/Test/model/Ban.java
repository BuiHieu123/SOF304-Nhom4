/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author portg
 */
public class Ban {
    public String maBan;
    public String tenBan;
    public int tang;
    public String tthai;

    public Ban(String maBan, String tenBan, int tang, String tthai) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.tang = tang;
        this.tthai = tthai;
    }

    public Ban() {
    }

    public Ban(String tenBan, int tang, String tthai) {
        this.tenBan = tenBan;
        this.tang = tang;
        this.tthai = tthai;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getTthai() {
        return tthai;
    }

    public void setTthai(String tthai) {
        this.tthai = tthai;
    }

    @Override
    public String toString() {
        return "Ban{" + "maBan=" + maBan + ", tenBan=" + tenBan + ", tang=" + tang + ", tthai=" + tthai + '}';
    }
    
    
    
}
