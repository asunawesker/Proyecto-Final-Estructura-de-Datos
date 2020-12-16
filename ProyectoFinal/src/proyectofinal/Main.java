/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;

import datastructure.CircularDoublyLinkedList;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        
        //list.printData();
        
        System.out.println(list.returnBackward());
        //System.out.println(list.returnBackward());
        //System.out.println("tail: ");
    }

}
