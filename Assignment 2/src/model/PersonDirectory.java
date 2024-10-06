/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hardishah
 */
public class PersonDirectory {
    ArrayList<Person> history;
    
    public PersonDirectory(){
        history = new ArrayList<Person>();
    }
    
    public Person addNewPerson(){
        Person newP = new Person();
        history.add(newP);
        return newP;
    }
    
    public void removePerson (int p){
        history.remove(p);
    }
    
    public ArrayList<Person> getHistory(){
        return history; 
    }
    
    
   public Person searchAccount(String searchable) {
    for (Person p : history) {
        if (p.getFirstName().contains (searchable) || p.getLastName().contains (searchable) || p.homeAddress.getStreet().contains(searchable) || p.workAddress.getStreet().contains(searchable)) {
        return p;
        }
    }
        return null;
}
   
   
}
