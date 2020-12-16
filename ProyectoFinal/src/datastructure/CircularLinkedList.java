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
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while(currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(node);
        }
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
}
