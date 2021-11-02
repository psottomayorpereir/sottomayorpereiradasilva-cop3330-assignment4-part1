/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */

package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class TodoList {
    //private fields
    private static TodoList instance = new TodoList();
    private SimpleStringProperty name;
    private ObservableList<Item> items;
    private DateTimeFormatter formatter;
    private static String filename = "TodoListItems.txt";

    public TodoList(String name, ObservableList<Item> items, DateTimeFormatter formatter){
        //constructor
    }

    public static TodoList getInstance() {
        //return instance of the class
        return instance;
    }

    private TodoList(){
        //format due date
    }

    public ObservableList<Item> getItems() {
        //return the list of items
        return items;
    }

    public void addItem(Item item) {
        //add item
    }

    public void loadItems() throws IOException {
        //load items from an external storage
    }

    public void storeItems() throws IOException {
        //store items from a list to an external storage
    }

    public String getName() {
        //get list name
        return name.get();
    }

    public void setName(String name) {
        //set list name
    }

}