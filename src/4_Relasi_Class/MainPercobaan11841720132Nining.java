/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jobsheet4.relasikelaspbo;

/**
 *
 * @author lenovo
 */
public class MainPercobaan11841720132Nining {
    public static void main(String []args){
         Processor1841720132Nining p = new Processor1841720132Nining("Intel i5", 3);
         Laptop1841720132Nining l = new Laptop1841720132Nining("Thinkpad", p);
         l.info();
         Processor1841720132Nining p1 = new Processor1841720132Nining();
         p1.setmMerk("intel i5");
         p1.setmCache(4);
         Laptop1841720132Nining l1 = new Laptop1841720132Nining();
         l1.setmMerk("Thinkpad");
         l1.setmProc(p1);
         l1.info();
        
    }
}
