/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objects;

/**
 *
 * @author asunawesker
 */
public class Book {

    private String edition;
    private int ID;

    public Book(int ID, int count) {
        this.edition = "Edición no. " + count;
        this.ID = ID;        
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}
