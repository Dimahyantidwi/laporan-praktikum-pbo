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
public class Handphone extends HanphoneNining {
    
    private String TipeHandphone;
    
    public void setTipeHandphone (String newValue){
        TipeHandphone = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Handphone: "+ TipeHandphone);
    }
}
