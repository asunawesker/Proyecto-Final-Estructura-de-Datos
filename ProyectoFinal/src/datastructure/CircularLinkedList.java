/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructure;

/**
 *
 * @author asunawesker
 */
public class CircularLinkedList <T> {
    private Node head;
    private Node tail;
    private int size; 

    public CircularLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void addLast(T data) {
        Node newNode = new Node(data);
        
        newNode.setData(data);
        newNode.setNextNode(null);
        newNode.setPrevNode(tail);
        
        if(tail!=null)
            tail.setNextNode(newNode);
        
        tail = newNode;
        
        if(head==null)
            head=newNode;
        
        size++;        
    }
    
    public Node removeLast() {
        Node temp = tail;
        tail = tail.getPrevNode();
        tail.setNextNode(null);
        
        size--;
        
        return temp;
    }
    
    public int listSize() {     
        return size;
    }
    
    public T search(int pos) {
        T dato = null;
        int cont=0;
        Node aux=head;
        if (!isEmpty()) {
            while(aux!=null){
                if (pos == cont){
                    dato = (T) aux.getData();
                }                
                aux = aux.getNextNode();
                cont++;
            }
        }    
        return dato;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public T returnBackward(){
        //tail-->head
        Node current = tail;
        T tailBackward = null;
        
        do{
            tailBackward = (T) current.getData();
            current = current.getPrevNode();
        } while((current != null));
        
        return tailBackward;
    }
    
    public void printData() {
        Node currentNode = head;
        while(currentNode != null) {
            T data = (T) currentNode.getData();
            System.out.println(data);
            currentNode = currentNode.getNextNode();
        }
    }
}
