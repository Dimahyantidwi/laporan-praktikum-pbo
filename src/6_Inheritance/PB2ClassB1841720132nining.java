/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET6.percobaan2;

/**
 *
 * @author lenovo
 */
public class PB2ClassB1841720132nining extends PB2ClassA1841720132nining{

    private int mz;

    public void setZ(int z) {
        this.mz = z;
    }

    public void getNilaiZ() {
        System.out.println("nilai z : " + mz);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (mx + my + mz));
    }
}
