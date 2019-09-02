/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone;

/**
 *
 * @author lenovo
 */
public class HandphoneNiningMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HanphoneNining hp1 = new HanphoneNining();
        HanphoneNining hp2 = new HanphoneNining();
        HanphoneNining hp3 = new HanphoneNining();
        Handphone hp4 = new Handphone(); 
        
        // Panggil method didalam objek sepeda
        hp1.setMerek("Samsung");
        hp1.kartuperdana("Tsel");
        hp1.tambahisipulsa(50);
        hp1.cetakStatus();
        
        hp2.setMerek("Iphone");
        hp2.kartuperdana("XL");
        hp2.tambahisipulsa(30);
        hp2.kartuperdana("Indosat");
        hp2.tambahisipulsa(100);
        hp2.cetakStatus();
        
        hp3.setMerek("Xiaomi");
        hp3.kartuperdana("Smartfren");
        hp3.tambahisipulsa(25);
        hp3.cetakStatus();
        
        hp4.setMerek("Iphone");
        hp4.kartuperdana("Three");
        hp4.tambahisipulsa(100);
        hp4.setTipeHandphone("Iphone XS MAX");
        hp4.cetakStatus();
    }
}
