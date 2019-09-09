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
public class BarangTgs {
    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;
    private int hargaJual;
    
    public void setKode(String kodee){
        kode = kodee;
    }
    public void setNamaBarang(String namaBr){
        namaBarang = namaBr;
    }
    public int hargaDasar(int harga){
        hargaDasar = harga;
        return hargaDasar;
    }
    public float diskon(float dskn){
        diskon = dskn;
        return diskon;
    }
    public int hitungHargaJual(float diskon, int harga){
        hargaJual = (int) (hargaDasar -(diskon * harga));
        return hargaJual;
    }
    public void tampilData(){
        System.out.println("Kode        : "+ kode);
        System.out.println("Nama Barang : "+ namaBarang);
        System.out.println("Harga Dasar : "+ hargaDasar);
        System.out.println("Diskon      : "+ diskon+"%");
        System.out.println("Harga Jual  : "+ hargaJual);
    }
}
