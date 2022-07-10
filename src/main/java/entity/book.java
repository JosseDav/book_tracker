/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author josse
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {
    private String title;
    
    @Id
    public String getTitle(){
        return title;
    }
    
}
