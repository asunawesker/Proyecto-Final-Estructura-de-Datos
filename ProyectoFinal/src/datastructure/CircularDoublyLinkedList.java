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
public class CircularDoublyLinkedList <T>{
private Node head;
    private Node tail;
    private int size; 

    public CircularDoublyLinkedList(){
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

    public void addFirst(int data) {
        Node node = new Node(data);
        
        node.setNextNode(head);
        node.setPrevNode(null);
        
        if(head!=null)
            head.setPrevNode(node);
        head = node;
        if(tail==null)
            tail=node;
        size++;     
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
    
    public Node removeFirst() {
        if (size == 0) 
            throw new RuntimeException("Lista vacía");
        
        Node temp = head;
        head = head.getNextNode();
        head.setPrevNode(null); 
        
        size--;
        
        return temp;
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
        T data = null;
        int cont=0;
        Node aux=head;
        if (!isEmpty()) {
            while(aux!=null){
                if (pos == cont){
                    data = (T) aux.getData();
                }                
                aux=aux.getNextNode();
                cont++;
            }
        }    
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public T returnForward(){
        //head-->tail
        Node current = head;
        T tailBackward = null;
        
        do{
            tailBackward = (T) current.getData();
            current = current.getNextNode();
        } while((current != null));
        
        return tailBackward;
    }
    
    public T returnBackward(){
        //tail-->head
        Node currentNode = head;
        
        T data = (T) currentNode.getData();
        return data;
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
