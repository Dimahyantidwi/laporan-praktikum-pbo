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
public class Barang {
    public String namaBarang;
    public String jenisBarang;
    public int stok;
    
    public void tampilBarang() {
        System.out.println("Nama Barang     : " +namaBarang);
        System.out.println("Jenis Barang    : " +jenisBarang);
        System.out.println("Stok:           : " +stok);
    }
    public int tambahStok(int barangMasuk) {
        int stokBaru = barangMasuk + stok;
        return stokBaru;
    }
}
