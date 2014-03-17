/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mushabe
 */
@Entity (name = "Person")
public class Person implements Serializable {
     
private int id;
 
private String firstName,lastName;
@Id
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
@Column (name = "fname")
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
@Column (name = "lname")
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
}

