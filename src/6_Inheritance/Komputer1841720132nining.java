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
public class Komputer1841720132nining {

    public String mmerk;
    public int mkecProsesor;
    public int msizeMemory;
    public String mjnsProsesor;

    public Komputer1841720132nining() {
    }

    public Komputer1841720132nining(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.mmerk = merk;
        this.mkecProsesor = kecProsesor;
        this.msizeMemory = sizeMemory;
        this.mjnsProsesor = jnsProsesor;
    }

    public void tampilDataKomputer() {
        System.out.println("Merk Komputer \t\t: " + mmerk);
        System.out.println("Kecepatan Prosesor \t: " + mkecProsesor);
        System.out.println("Size Memory \t: " + msizeMemory);
        System.out.println("Jenis Prosesor \t\t: " + mjnsProsesor);
    }
}
