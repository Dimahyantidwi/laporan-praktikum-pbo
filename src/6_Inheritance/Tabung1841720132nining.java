/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET6;

/**
 *
 * @author lenovo
 */
public class Tabung1841720132nining extends Bangun1841720132nining{

    protected int mt;

    public void setSuperPhi(double phi) {
        super.mphi = phi;
    }

    public void setSuperR(int r) {
        super.mr = r;
    }

    public void setT(int t) {
        this.mt = t;
    }

    public void volume() {
        System.out.println("Volume Tabung Adalah : " + (super.mphi * super.mr * super.mr * this.mt));
    }
}
