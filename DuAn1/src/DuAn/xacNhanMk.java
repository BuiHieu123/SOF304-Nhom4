package com.example.demo.DuAn;

public class xacNhanMk {
    public int xacNhanMk(String newMk, String newMk2) {
        if(newMk.equals("123456") && newMk2.equals("123456") || newMk.equals("abcxyz") && newMk2.equals("abcxyz")){
                return 1;
        }
        return -1;
    }

//    public int xacNhanMk2(String newMk, String newMk2) {
//        if(newMk.equals("abcxyz")){
//            if(newMk2.equals("abcxyz")){
//                return 1;
//            }
//        }
//        return -1;
//    }
}
