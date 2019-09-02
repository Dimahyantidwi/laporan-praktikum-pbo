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
public class HanphoneNining {
    
    private String merek;
    private String kartuperdana;
    private int pulsa;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    
    public void kartuperdana(String newValue){
        kartuperdana = newValue;
    }
    
    public void tambahisipulsa(int increment){
        pulsa = pulsa + increment;
    }
    
    public void pulsaberkurang(int decrement){
        pulsa = pulsa - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merek: "+ merek);
        System.out.println("Kartuperdana Handphone: "+ kartuperdana);
        System.out.println("Pulsa: "+ pulsa);
    }
}
