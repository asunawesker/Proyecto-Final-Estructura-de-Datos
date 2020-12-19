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
public class Queue <T> {

    public Node<T> head;
    public Node<T> tail;
  

    public Queue() {
       head=null;
    }
    
  
    public boolean isEmpty() {
      return head==null;
    }
    
    public void enqueue(T t) {
        Node newNode = new Node(t);
        
        newNode.setNextNode(head);
        newNode.setPrevNode(null);
        
        if(head!=null)
            head.setPrevNode(newNode);
        head = newNode;
        if(tail==null)
            tail=newNode;
    }
    
     public void poll() {
        Node temp = tail;
        tail = tail.getPrevNode();
        tail.setNextNode(null);  
    }
    
    public T peek(){
        return (T) head.getData(); 
    }
    
    public T search(int pos){
        T dato=null;
        int cont=0;
        Node<T> aux=head;
        if (!isEmpty()) {
          if(pos<0 || pos>=listLength()){
            dato=null;
           }else{
            while(aux!=null){
                if (pos == cont){
                    dato=aux.getData();
                }                
                aux=aux.getNextNode();
                cont++;
            }
          }
        }    
        return dato;
    }
    

    public int listLength(){
        int i=0;
        if (!isEmpty()) {
            Node<T> aux = head;
            while (aux!=null) {          
                i++;
                aux = aux.getNextNode();
            }
        } 
        return i;
    }
}