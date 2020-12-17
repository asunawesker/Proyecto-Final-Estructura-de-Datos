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
    
    public void addFirst(T data) {
        Node newNode = new Node(data);
        
        newNode.setData(data);
        newNode.setNextNode(head);
        newNode.setPrevNode(null);
        
        if(head!=null)
            head.setPrevNode(newNode);
        head = newNode;
        if(tail==null)
            tail=newNode;
        
        size++;        
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

    public void deleteAnyone(Node anyone) {
        Node temp = head;
        
        while (temp.getNextNode()!= null && temp.getData() != anyone.getData()) {
            temp = temp.getNextNode();
        }
        
        if (temp.getNextNode()!= null)
            temp.getNextNode().getNextNode().setPrevNode(temp);
        
        temp.setNextNode(temp.getNextNode().getNextNode());
    }
    
    public Node deleteAll(SimpleLinkedList list) {
        if (size == 0) 
            throw new RuntimeException("Lista vacía");
        
        Node temp = head;
        
        for (int i=0; i<size; i++){
            head = head.getNextNode();
            head.setPrevNode(null); 

            size--;
        }
                
        return temp;
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
        Node current = tail;
        T tailBackward = null;
        
        do{
            tailBackward = (T) current.getData();
            current = current.getPrevNode();
        } while((current != null));
        
        return tailBackward;
    }
}
