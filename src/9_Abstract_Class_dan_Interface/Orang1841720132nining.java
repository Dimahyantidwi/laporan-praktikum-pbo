/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author lenovo
 */
public class Orang1841720132nining {
    
    private String mNama;
    private Hewan1841720132nining mhewanPeliharaan;
    
    public Orang1841720132nining(String nama){
        this.mNama = nama;
    }
    
    public void peliharaanHewanning(Hewan1841720132nining hewanpeliharaan){
        this.mhewanPeliharaan = hewanpeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanning(){
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.mhewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
    }
}
