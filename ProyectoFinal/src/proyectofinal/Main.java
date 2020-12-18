/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectofinal;

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
            
        System.out.println("Eliminando elemento: ");
        list.deleteLast();
        
        for (int i=0; i<list.listSize(); i++) {
            Student student = (Student) list.search(i);
            System.out.println(student.getMatricula());
        }    
        */
    }

}
