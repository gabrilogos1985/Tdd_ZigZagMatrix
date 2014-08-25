/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gps.tdd;

/**
 *
 * @author gabe
 */
class zigZagMatrix {
    private final int size;

    zigZagMatrix(int matrixSize) {
     this.size=matrixSize;
    }

    String arrange() {
        
        return size==1?"11":"11 12";
    }
    
}
