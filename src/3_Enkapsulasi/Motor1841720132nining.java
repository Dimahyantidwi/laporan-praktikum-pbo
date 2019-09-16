/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author lenovo
 */
public class Motor1841720132nining {
    private int mkecepatan = 0;
    private boolean mkontakOn = false;
    
    public void nyalakanMesinnining(){
        mkontakOn = true;
    }
    public void matikanMesin(){
        mkontakOn = false;
        mkecepatan = 0;
    }
    public void tambahKecepatannining(){
        if (mkontakOn == true){
            mkecepatan += 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");     
        }
    }
    public void kurangiKecepatannining(){
        if (mkontakOn == true){
            mkecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
        }
    }
    public void printStatusining(){
        if (mkontakOn == true){
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mkecepatan+"\n");
    }
}
