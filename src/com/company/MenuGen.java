/**
 * @author: Justin Blacksher
 * @author: Tiffany Blacksher
 * @version: 1.0
 *
 * This module is to control which of the menu's are displayed to make the main program less busy
 * and to provide a way to easily modify it later. This should allow for a GUI to be used eventually and easily
 * integrated without deleting anything much from the main class. Possibly using Java.swing
 */

package com.company;



import static com.company.Main.*;

public class MenuGen {


    // TODO: Make 3 different menu variations. Using a default constructor for initial menu
    public MenuGen() {

        startMain();


    }
    public void startMain() {
        if ((hasChildren == Boolean.FALSE) && (hasChoreChart == Boolean.FALSE)) {
            clearTheScreen(); // TODO: Figure out a clean way to get this working
            Graphics.EntryGraphic(); // Show the Graphic selected for menu
            Graphics.DefaultMenu(); // Display the limited default menu
        }
        if ((hasChildren == Boolean.FALSE) && (hasChoreChart == Boolean.TRUE)) {
            clearTheScreen(); // TODO: Figure out a clean way to get this working
            Graphics.OpenMenu(activeChart); // Display limited 2
        }
        if ((hasChildren == Boolean.TRUE) && (hasChoreChart == Boolean.TRUE)) {
            clearTheScreen(); // TODO: Figure out a clean way to get this working
            System.out.println("Chores Completed: ");
            Graphics.FinalMenu(activeChart, activeChildren);
        }
    }

}

// TODO: Create menus to ease program control
// TODO: Adding a child menu
// TODO: Adding a chore menu
// TODO: Creating custom chore chart menu
// TODO: Enabling Pre-made chart menu
// TODO: Completing and assigning chores menu