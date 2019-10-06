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
public class Laptop1841720132nining extends Komputer1841720132nining {

    public String mjnsBatrei;

    public Laptop1841720132nining () {

    }

    public Laptop1841720132nining (String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.mjnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        super.tampilDataKomputer();
        System.out.println("Jenis baterai \t\t: " + mjnsBatrei);
    }
}
