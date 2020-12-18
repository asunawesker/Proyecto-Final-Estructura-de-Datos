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
public class Node <T> {
    
    private T data; 
    private Node nextNode;
    private Node prevNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;       
    }

    public T getData() {
        return this.data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }
    
    
    
}
