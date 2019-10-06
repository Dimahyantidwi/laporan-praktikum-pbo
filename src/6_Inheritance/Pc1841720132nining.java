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
public class Pc1841720132nining extends Komputer1841720132nining {

    public int mukuranMonitor;

    public Pc1841720132nining() {

    }

    public Pc1841720132nining(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.mukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilDataKomputer();
        System.out.println("Ukuran Monitor \t\t: " + mukuranMonitor);
    }
}
