/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBSHEET7;

/**
 *
 * @author lenovo
 */
public class Perkalianku1841720132nining {
    void perkalian(int a, int b) {
        System.out.println(a * b);
    }
    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }
    public static void main(String[] args) {
        Perkalianku1841720132nining objek = new Perkalianku1841720132nining();
        
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}
