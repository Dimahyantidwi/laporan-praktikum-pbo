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
public class Mac1841720132nining extends Laptop1841720132nining {

    public String msecurity;

    public Mac1841720132nining() {

    }

    public Mac1841720132nining(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.msecurity = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security \t\t: " + msecurity);
    }
}
