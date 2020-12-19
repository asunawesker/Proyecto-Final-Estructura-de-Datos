/*
 * To change this license list.getHeader, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import datastructure.Node;
import datastructure.SimpleLinkedList;
import java.util.Scanner;
import objects.Student;
import screens.MainMenu;

/**
 *
 * @author asunawesker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        
        
        /*
        Scanner sc = new Scanner(System.in);
        SimpleLinkedList list = new SimpleLinkedList();  

        
        String op;
        do {
            System.out.println("Nombre: ");
            String name = sc.next();

            System.out.println("Apellido: ");
            String apellido = sc.next();

            System.out.println("Matricula: ");
            int matri = sc.nextInt();
            
            System.out.println("S o N: ");
            op = sc.next();
            
            list.addLast(new Student(name, apellido, matri));
            
        } while (op.equals("S"));
        
        for (int i=0; i<list.listSize(); i++) {
            Student student = (Student) list.search(i);
            System.out.println(student.getMatricula());
        }        
        
        if (list.getSize() > 1) {
            boolean wasChanged = true;
            while( wasChanged ) {
                Node current = list.getHead();
                Node previous = null;
                Node next = list.getHead().getNextNode();
                wasChanged = false;
                while ( next != null ) {
                    Student currentData = (Student) current.getData();
                    Student nextData = (Student) next.getData();
                    
                    int cDataEnrollment = currentData.getMatricula();
                    int nDataEnrollment = nextData.getMatricula();
                    
                    if ( cDataEnrollment > nDataEnrollment ) {
                        wasChanged = true;
                        if ( previous != null ) {
                            Node sig = next.getNextNode();

                            previous.setNextNode(next);
                            next.setNextNode(current);
                            current.setNextNode(sig);
                        } else {
                            Node sig = next.getNextNode();
                            
                            Node cHead = list.getHead();
                            cHead = next;
                            next.setNextNode(current);
                            current.setNextNode(sig);
                        }

                        previous = next;
                        next = current.getNextNode();
                    } else { 
                        previous = current;
                        current = next;
                        next = next.getNextNode();
                    }
                } 
            } 
        }
    
        System.out.println("Ordenado");
        
        for (int i=0; i<list.listSize(); i++) {
            Student student = (Student) list.search(i);
            System.out.println(student.getMatricula());
        } 
        */
    }

}
