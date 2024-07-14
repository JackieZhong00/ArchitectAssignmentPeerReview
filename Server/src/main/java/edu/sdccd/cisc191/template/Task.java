package edu.sdccd.cisc191.template;
import java.time.LocalDate;

/*
 * Represents a task in the To-Do List Application.
 * Each task has a description that can be assigned and retrieved.
 */

public class Task {

    private String description; // variable to store task description
    private LocalDate dueDate;; //variable used to represent when task should expire


    //constructor to initialize Task with description only
    public Task(String description) {
        this.description = description;
    }

    // Constructor to initialize Task with description and due date
    public Task(String description, String dueDate) {
        this.description = description;
        //reading from input field returns a string "YYYY-MM-DD", this parses it to create LocalDate obj
        this.dueDate = LocalDate.parse(dueDate);
    }
    // Getter method for Task
    public String getDescription() {
        return description;
    }
    // Setter method for Task
    public void setDescription(String taskDescription) {
        this.description = taskDescription;
    }
    //Getter method for dueDate
    public String getDueDate() { return dueDate.toString(); }
    //Setter method for dueDate
    public void setDueDate(LocalDate dueDate){ this.dueDate = dueDate; }
    // Overridden method to return Task info
    @Override
    public String toString() {
        return description;
    }

} // end Task class
