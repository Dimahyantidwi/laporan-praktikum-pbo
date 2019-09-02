/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author lenovo
 */
public class SepedaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Buat dua buah objek sepeda
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        
        // Panggil method didalam objek sepeda
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.setWarna("Merah");
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cyle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.setWarna("Biru");
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setWarna("Putih");
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
}
