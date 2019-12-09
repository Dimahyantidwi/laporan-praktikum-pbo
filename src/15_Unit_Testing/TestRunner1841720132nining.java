/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;
import unittest.database.Anggota1841720132nining;
import unittest.database.Kategori1841720132nining;
/**
 *
 * @author lenovo
 */
public class TestRunner1841720132nining {
   
    public static void main(String[]args){
        Result mResult = new JUnitCore().runClasses(MessageProcessor1841720132nining.class);
        showMessageResult(mResult, MessageProcessor1841720132nining.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Kategori1841720132nining.class);
        showMessageResult(mResult, Kategori1841720132nining.class.getSimpleName());
    
        mResult = new JUnitCore().runClasses(Anggota1841720132nining.class);
        showMessageResult(mResult, Anggota1841720132nining.class.getSimpleName());
    }

    private static void showMessageResult(Result mResult, String className){
        if (mResult.wasSuccessful()) {
            System.out.format("The result test from %s : %s\n", className, mResult.wasSuccessful());
        } else{
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);    
            }
        }
    }
}