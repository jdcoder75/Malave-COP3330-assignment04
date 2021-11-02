package ucf.assignments;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jose Malave
 */
//psuedo code
public class App {
    public static void main(String[] arg){
        // here is where we ask the user to create a todo lisst
        //after ask if they want
        String title;
        Scanner sc = new Scanner(System.in);
        String[] items = new String[100];
        String[] description = new String[100];
        String[] dueDate = new String[100];
        int[] completed = new int[100];
        int j = 0;


        /*ArrayList s = new ArrayList();

        for(int i = 0; i < 100; i++)
        {
            items[i] = sc.nextLine();
            description[i] = sc.nextLine();
        }*/

        //ask the user to make a todo list
        createList[] todoList = new createList[100];



        while(/*until the user doesn't want to = 0*/)
        {
            //ask what the user want to dop
            /* use a switch case to see if

            1 if want to add a todolist
            todoList[j] = new createList(title,items, description,dueDate,completed);


            2 if want to edit
                send todoList to edit class

            3 if want display
                send todoList to display class

            4 if want to save/load
                send todoList to saveOrLoad class


            0 if want to exit
             */
        }
    }



}



class createList{
    String title;
    String[] items = new String[100];
    String[] description = new String[100];
    String[] dueDate = new String[100];
    int[] completed = new int[100];

    // here is where we ask the user to create a todo list
    //after ask if they want to add, remove, edit, display, or
     public void createList(String title, String[] items, String[] description, String[] dueDate, int[] completed )
    {
        for(int i = 0; i < 100; i++)
        {
            this.title = title;
            this.items[i] = items[i];
            this.description[i] = description[i];
            this.dueDate[i] = dueDate[i];
            this.completed[i] = completed[i];
        }


    }

}


class edit{
    public static void main(String[] arg){
        // here is where we ask the user to edit a todo list
        // do they want to remove an item, add an item or alter anything
    }
    public void addItem()
    {
        //find the todoList first
        //indexOf command on title


    }
    public void removeToDoList()
    {
        //find the todoList first
        //indexOf command on title
    }
    public void removeItem()
    {
        //find the todoList first
        //indexOf command on title
        //find the index of the item you want to remove
    }

    public void editTitle()
    {
        //find the todoList first
        //indexOf command on title
        //set the new title
    }
    public void editDueDate()
    {
        //find the todoList first
        //indexOf command on title
        //find the index of the item you want
        //change the dueDate
    }
    public void markDone()
    {
        //find the todoList first
        //indexOf command on title
        //find the index of the item you want
        //set the b[i].completed[j] equal to 1

    }


}

class display{
    public static void main(String[] arg){
        // display certain aspects of the list
        //functions: allLists, incompleteLists, completeLists.

    }
    public void displayAll()
    {
        //ask what list you want to see
        //find title first
        //indexOf to locate it
        for(/*loop thru the entire todolist*/)
        {
            System.out.println( todoList[i].item, todoList[i].description, todoList[i].dueDate, todoList[i].completed);
        }

    }
    public void displayComplete()
    {
        for(/*loop thru the entire todoList*/)
        {
            if(/*b[i].completed = 1*/)
                System.out.println( todoList[i].item, todoList[i].description, todoList[i].dueDate, todoList[i].completed);
        }
    }
    public void displayIncomplete()
    {
        for(/*loop thru the entire hashmap*/)
        {
            if(/*b[i].completed = 0*/)
                System.out.println( b[i].item, b[i].description, b[i].dueDate, b[i].completed);
        }
    }


}

class saveOrLoad {
    public static void main(String[] arg) {
        // create a text file for the list or lists
        //Incorporate a BufferReader/BufferWritter
        //ask the user if they want to save or load

    }
    public void saveToDoList(/*send in the all lists: createList[] todoList*/)
    {
        //ask what list you want to see
        //find title first
        //indexOf to locate it
        //then write it to txt file that the user creates

    }
    public void saveAllToDoList(/*send in the all lists: createList[] todoList*/)
    {

    }
    public void loadToDoList(/*send in the all lists: createList[] todoList*/)
    {
        //read in the txt file that you want
        //then add it to the todoLists that are being made

    }
    public void loadAllToDoList()
    {
        //here we want to read i/*send in the all lists: createList[] todoList*/n the file
        //ask user what the txt file name is
        //read in all todoLists that are in the file
    }
}

