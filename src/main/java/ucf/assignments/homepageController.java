/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */

package ucf.assignments;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class homepageController implements Initializable {

    //variables that will be used for adding a TodoList and an item to it
    private List<Item> todoItems;
    private List<TodoList> todoLists;
    TodoLists listOfTodoList = new TodoLists();
    TodoList list = new TodoList("", FXCollections.observableArrayList(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    Item item = new Item("", "", "", LocalDate.of(2021, 11, 10));
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    TodoList selected = new TodoList("", FXCollections.observableArrayList(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

    //variables for 'Add a Todo List'
    @FXML
    private Label addListLabel;

    //variables for 'Add an item to a Todo List'
    @FXML
    private Label addItemTitleLabel;
    @FXML
    private Label addItemDescriptionLabel;
    @FXML
    private Label addItemDueDateLabel;
    @FXML
    private ChoiceBox addItemStatus;
    @FXML
    private Label addItemStatusLabel;
    @FXML
    private Label addItemToListLabel;
    @FXML
    private TextField listNameTxtField;
    @FXML
    private TextField itemNameTxtField;
    @FXML
    private TextField descriptionTxtField;
    @FXML
    private DatePicker dp;

    //variables for delete list
    @FXML
    private Label deleteListLabel;

    //configure the Todo List table
    @FXML
    private TableView<TodoList> tableView;
    @FXML
    private TableColumn<TodoList, String> listNamesColumn;
    @FXML
    private ListView<Item> todoListView;
    ObservableList<TodoList> obsList = FXCollections.observableArrayList();

    //configure the Item table
    @FXML
    private TableView<Item> tableViewItem;
    @FXML
    private TableColumn<Item, String> listNamesColumnItemTitle;
    @FXML
    private TableColumn<Item, String> listNamesColumnItemDescription;
    @FXML
    private TableColumn<Item, String> listNamesColumnItemStatus;
    @FXML
    private TableColumn<Item, LocalDate> listNamesColumnItemDueDate;
    ObservableList<Item> obsListItem = FXCollections.observableArrayList();


    public void addListButtonClick() {
        //method to 'Add a Todo List'
    }

    public void deleteListButtonClick() {
        //method to allow the user to delete a Todo List
    }

    public void addItemButtonClick() {
        //method to allow the user to add an item to a Todo List
    }

    public void deleteItemButtonClick() {
        //Method to allow the user to delete an item from a Todo List in the TableView
    }

    public void changeTodoListNameCellEvent() {
        //Method to allow the user to double click on a cell of the TableView and update the name of the Todo List
    }

    public void changeItemNameCellEvent() {
        //Method to allow the user to double click on a cell of the TableView and update the title of an item
    }

    public void changeItemDescriptionCellEvent() {
        //Method to allow the user to double click on a cell of the TableView and update description
    }

    public void changeItemDueDateCellEvent() {
        //Method to allow the user to double click on a cell of the TableView and update dueDate
    }

    public void changeItemStatusCellEvent() {
        //Method to allow the user to double click on a cell of the TableView and update the status of the item
    }

    public void displayAllItemsInTodoList() {
        //Method to allow the user to see all items in a Todo List on the TableView
    }

    public void displayCompleteItemsInTodoList() {
        //Method to allow the user to see all complete items in a Todo List on the TableView
    }

    public void displayIncompleteItemsInTodoList() {
        //Method to allow the user to see all incomplete items in a Todo List on the TableView
    }

    public void saveToExternalButtonClick() {
        //Method to allow the user to save a Todo List to external storage
    }

    public void saveMultipleToExternalButtonClick() {
        //Method to allow the user to save multiple Todo Lists to external storage
    }

    public void loadFromExternalButtonClick() {
        //Method to allow the user to load a Todo List from external storage
    }

    public void loadMultipleFromExternalButtonClick() {
        //Method to allow the user to load multiple Todo Lists from external storage
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //method to initialize table views, labels, etc
    }
}