/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet4.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class Laptop1841720132Nining {
    private String mMerk;
    private Processor1841720132Nining mProc;
    Laptop1841720132Nining() {
        
    }
    
    Laptop1841720132Nining(String merk, Processor1841720132Nining proc) {
        this.mMerk = merk;
        this.mProc = proc;
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720132Nining getmProc() {
        return mProc;
    }

    public void setmProc(Processor1841720132Nining mProc) {
        this.mProc = mProc;
    }
    
    
    public void info() {
        System.out.println("Merk Laptop = " + mMerk);
        mProc.info();
    }

}
