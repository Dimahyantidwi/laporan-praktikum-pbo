/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class Anggota1841720132niningTest {
    Anggota1841720132nining instance;
    
    public Anggota1841720132niningTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Anggota1841720132nining("Natlus", "Palopo", "111");
        System.out.format("Start Testing : %s \n", instance.getNama());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getNama());
    }

    @org.junit.Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "Natlus";
        Anggota1841720132nining instance = new Anggota1841720132nining();
        ArrayList<Anggota1841720132nining> expResult = instance.getByNama(keyword,"", "");
        ArrayList<Anggota1841720132nining> result = instance.search(keyword);
        assertEquals(expResult.size(), result.size());
    }

    @org.junit.Test
    public void testSave() {
        System.out.println("save test");
        Anggota1841720132nining instance = new Anggota1841720132nining();
        instance.save();
        assertTrue(expResult.size() > 0);
    }
}
