package edu.sdccd.cisc191.template;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Creates and manages the UI for the application.
 * End users can add and remove tasks to the tasklist through the graphical interface
 */

public class TaskView {
    private TextField taskInput; // Text field for inputting new task
    private TextField dateInput; //dateInput for task's dueDate
    private Button addButton; // Button for adding task
    private Button deleteButton; // Button for removing task
    private ListView<Task> taskList; // List view for displaying all tasks

    // Constructor for JavaFX components
    public TaskView(Stage stage) {
        VBox root = new VBox(); // Vertical box display component

        taskInput = new TextField(); // Initialize text field
        taskInput.setId("taskInput"); // For testing purposes
        taskInput.setPromptText("Task Description"); //sets placeholder for task description

        dateInput = new TextField(); // Initialize text field
        dateInput.setId("dateInput"); // For testing purposes
        dateInput.setPromptText("enter due date: YYYY-MM-DD"); //sets placeholder for due date

        addButton = new Button("ADD"); // Initialize add button
        deleteButton = new Button("Delete"); // Initialize delete button
        taskList = new ListView<>(); // Initialize list view

        //create HBox to format task description and due date input fields
        HBox taskDateBox = new HBox(taskInput, dateInput);

        // add components to vertical box layout
        root.getChildren().addAll(taskDateBox, addButton, deleteButton, taskList);

        Scene scene = new Scene(root, 300, 400); // Initialize scene with the vertical box layout
        stage.setTitle("ToDo List"); // set the title of the stage
        stage.setScene(scene); // attach the scene to the stage
        stage.show(); // display the stage
    }
    // Getter method for the task in the input field
    public TextField getTaskInput() {
        return taskInput;
    }
    //Getter method for task's due date in input field
    public TextField getTaskDueDate() { return dateInput; }
    // Getter method for add button
    public Button getAddButton() {
        return addButton;
    }
    // Getter method for delete button
    public Button getDeleteButton() {
        return deleteButton;
    }
    // Getter method for the task list view
    public ListView<Task> getTaskList() {
        return taskList;
    }
} // end TaskView class
