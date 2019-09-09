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
public class Lingkaran {
    public double phi;
    public double r;
    double hasil;
    
    public double hitungLuasLingkaran() {
        return hasil = 3.14 * r * r;
    }
    public double hitungKelilingLingkaran() {
        return hasil = 2 * 3.14 * r;
    }
    public void tampilData() {
        System.out.println("r: " +r);
        System.out.println("phi: " +phi);
        System.out.println("Luas Lingkaran: " +hitungLuasLingkaran());
        System.out.println("Keliling Lingkaran: " +hitungKelilingLingkaran());
    }
}
