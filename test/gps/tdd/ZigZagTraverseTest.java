/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gps.tdd;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author gabe
 */
public class ZigZagTraverseTest {
    zigZagMatrix zigZagMatrix;
    public ZigZagTraverseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void arrangeOnebyOneMatrix(){
        zigZagMatrix = new zigZagMatrix(1);
        assertEquals("11", zigZagMatrix.arrange());
    }
    
    @Test
    public void arrangeTwoByTwoMatrixFirstRow() {
        zigZagMatrix = new zigZagMatrix(2);
        assertEquals("11 12", null);
    }
}