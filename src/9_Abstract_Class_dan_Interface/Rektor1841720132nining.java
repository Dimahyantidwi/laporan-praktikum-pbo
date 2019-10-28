/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author lenovo
 */
public class Rektor1841720132nining {
     public void beriSertifikatCumlaude(ICumlaude1841720132nining mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
      
        System.out.println("--------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi1841720132nining mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetensi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------");
    }
}
