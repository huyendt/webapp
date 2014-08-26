package com.webapp.model;

import com.webapp.entity.Category;
import java.util.List;
import org.junit.Test;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HuyenDo
 */
public class CategoryModelTest {
    
    public CategoryModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class CategoryModel.
     */
    @Test
    public void testGetAll() throws Exception {
        System.out.println("getAll");
        CategoryModel instance = new CategoryModel();
        List expResult = null;
        List result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CategoryModel.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Category category = null;
        CategoryModel instance = new CategoryModel();
        instance.add(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CategoryModel.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Category category = null;
        CategoryModel instance = new CategoryModel();
        instance.update(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CategoryModel.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        Category category = null;
        CategoryModel instance = new CategoryModel();
        instance.delete(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}