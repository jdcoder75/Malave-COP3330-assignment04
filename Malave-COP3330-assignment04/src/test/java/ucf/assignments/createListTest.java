package ucf.assignments;

import org.junit.jupiter.api.Test;

class createListTest {
    @Test
    public void listCreateTest()
    {
        createList test1 = new createList();
        display displayL = new display();
        edit editL = new edit();
        saveOrLoad saveOrLoad_List = new saveOrLoad();

        // parameters we are going to use
        String[] items = {"book"};
        String[] description = {" it works"};
        String[] dueDate = { "2021-12-12"};
        int[] completed = {1};

        //create a todo List
        test1.createList("Reading", items, description, dueDate, completed);

        //edit the todoList
        editL.removeToDoList(/*send in the all lists: createList[] todoList*/);
        editL.editTitle(/*send in the all lists: createList[] todoList*/);
        editL.markDone(/*send in the all lists: createList[] todoList*/);
        editL.addItem(/*send in the all lists: createList[] todoList*/);


        //display the different todo lists
        displayL.displayAll(/*send in the all lists: createList[] todoList*/);
        displayL.displayComplete(/*send in the all lists: createList[] todoList*/);
        displayL.displayIncomplete(/*send in the all lists: createList[] todoList*/);

        //saveorload
        saveOrLoad_List.saveToDoList(/*send in the all lists: createList[] todoList*/);
        saveOrLoad_List.loadToDoList(/*send in the all lists: createList[] todoList*/);
        saveOrLoad_List.saveAllToDoList(/*send in the all lists: createList[] todoList*/);
        saveOrLoad_List.loadAllToDoList(/*send in the all lists: createList[] todoList*/);


    }

}
