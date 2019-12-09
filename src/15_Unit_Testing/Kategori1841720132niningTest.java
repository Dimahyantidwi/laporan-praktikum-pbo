/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import org.junit.framework.TestCase;
import static org.junit.*;

/**
 *
 * @author lenovo
 */
public class Kategori1841720132niningTest {
    Kategori1841720132nining instance;
    
    public Kategori1841720132niningTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1841720132nining("Comics", "Comic is combination words and pictures")
        System.out.format("Start Teesting :%s \n", instance.getNama());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", instance.getNama());
    }

    @org.junit.Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        Kategori1841720132nining instance = new Kategori1841720132nining();
        ArrayList<Kategori1841720132nining> result = instance.search(keyword);
        ArrayList<Kategori1841720132nining> expresult = instance.getByNamaAndKeterangan(keyword);
        assertEquals(expResult.size(), result.size());
    }

    @org.junit.Test
    public void testSave() {
        System.out.println("save test");
        instance.save();
        Kategori1841720132nining instance = new Kategori1841720132nining();
        instance.save();
        Assert.fail("The test case is a prototype.");
    }
}
