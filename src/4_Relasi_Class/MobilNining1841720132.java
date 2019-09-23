/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.percobaan2.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class MobilNining1841720132 {
    private String mMerk;
    private int mBiaya;
    
    MobilNining1841720132() {
        
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungbiayamobilNining(int hari){
        return mBiaya * hari;
    }
}
