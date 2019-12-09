/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.Test;
import org.junit.Assert;
import unittest.MessageProcessor1841720132nining;

/**
 *
 * @author lenovo
 */
public class MessageProcessorTest1841720132nining {
    MessageProcessor1841720132nining mp;
    public MessageProcessorTest1841720132nining() {
        mp = new MessageProcessor1841720132nining();
        mp.setSender("Ronaldo");
        mp.setRecipient("Rafael");
        mp.setMessage("Whats up bro?");
    }
    @Test
    public void testShowMessage(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo."
                + "\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormat());
    }
}
