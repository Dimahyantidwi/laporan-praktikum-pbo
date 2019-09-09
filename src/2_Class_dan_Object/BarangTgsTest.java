/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET2;

/**
 *
 * @author lenovo
 */
public class BarangTgsTest {
    public static void main(String[] args) {
        BarangTgs b1 = new BarangTgs();
        
        b1.setKode("CE12345");
        b1.setNamaBarang("Laptop ROG");
        b1.hargaDasar(18000000);
        b1.diskon(10);
        b1.hitungHargaJual((float) 0.3, 17500000);
        b1.tampilData();
    }
}
