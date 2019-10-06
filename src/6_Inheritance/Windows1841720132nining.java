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
public class Windows1841720132nining extends Laptop1841720132nining {

    public String mfitur;

    public Windows1841720132nining() {

    }

    public Windows1841720132nining(String fitur, String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.mfitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur \t\t\t: " + mfitur);
    }
}
