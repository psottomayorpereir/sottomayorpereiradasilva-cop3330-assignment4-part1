/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */

package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class Item {
    //private fields
    private SimpleStringProperty name;
    private SimpleStringProperty description;
    private SimpleStringProperty status;
    private LocalDate dueDate;

    public Item(String name, String description, String status, LocalDate dueDate){
        //constructor
    }

    public String getName() {
        //get item name
        return name.get();
    }

    public void setName(String name) {
        //set item name
    }

    public String getDescription() {
        //get item description
        return description.get();
    }

    public void setDescription(String description) {
        //set item description
    }

    public String getStatus() {
        //get item status
        return status.get();
    }

    public void setStatus(String status) {
        //set item status
    }

    public LocalDate getDueDate() {
        //get item due date
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        //set item due date
    }

}