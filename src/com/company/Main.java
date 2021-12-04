/**
 * <h1>Create a chore chart!</h1>
 * <h2>This file determines the route to take</h2>
 * <p>Note: This program has not been made to be non-volatile as of yet
 * Care must be taken not to shut the program down if you are intending on
 * actually using it.</p>
 * @author: Tiffany Blacksher
 * @author: Justin Blacksher
 * @Filename: Main.java
 * @description: Main file that will control the program as a whole.
 */
package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    private static String[] args;


    // TODO: Define all constants


    // TODO: Create a checklist that will determine the formatting of the main menu and program flow
    private static Boolean menuItemSelected = Boolean.FALSE; // Has a menu item been selected?
    private static Boolean hasChildren = Boolean.FALSE;      // Has children been added?
    private static Boolean hasChoreChart = Boolean.FALSE;    // Has a chore chart been created / loaded?

    // TODO: Write Main functions specific to Main
    // TODO: Create Function that grabs all available chore charts


    // TODO: Create methods to change check variables
    public static void setMenuItemSelectedTrue(){menuItemSelected = Boolean.TRUE;}
    public static void setMenuItemSelectedFalse(){menuItemSelected = Boolean.FALSE;}
    public static void setHasChildrenTrue(){ hasChildren = Boolean.TRUE;}
    public static void setHasChildrenFalse(){ hasChildren = Boolean.FALSE;}
    public static void setHasChoreChartTrue(){ hasChoreChart = Boolean.TRUE;}
    public static void setHasChoreChartFalse(){ hasChoreChart  = Boolean.FALSE;}


    // TODO: Create methods to create custom chore list
    public static ChoreChart setCustomChoreList(){
        Scanner scan = new Scanner(System.in); // Scanner object to get user input
        Scanner listNum = new Scanner(System.in); // Scanner to get other input
        System.out.println("Setting Custom list:");
        System.out.println("How many items for this list?");
        int listItems = listNum.nextInt();
        String[] customChores = new String[listItems];

        for (int i = 0; i < listItems; i++){
            System.out.println("Enter for position: " + i);
            customChores[i] = scan.nextLine();

        }
        ChoreChart customChart = new ChoreChart(customChores, "customChart1");
        return customChart;
    }


    public static void main(String[] args) {


        // ChoreChart chart = setCustomChoreList(); Passed testing this is template for production
        // ChoreChart SundayChores = new ChoreChart(ChoreTemplates.Sunday, "Sunday Chores"); Passed Template
        // ChoreChart chores = new ChoreChart(); Passed for default constructor

        // TODO: Create main loop to display menu and program flow
        // TODO: Create a check and balances system to avoid user errors
        // TODO: Use boolean check system above to achieve a "smart" feel for the program

        // Menu 1: All options turned off and must initialize a chore chart and create a list of children
        // TODO: Create menu and test
        // TODO: (Maybe) Create MOTD and graphic to make the user feel warm and fuzzy
        // Menu 2: Will be a modified version of Menu 1 to reflect current changes and push user into final stage
        // TODO: Modify Menu 1 and display the instructions needed to progress into the next stage of the menu
        // Menu 3: Full and open menu that will have full functionality and has passed its setup phase with user
        // TODO: Finalize menu and let the user go to explore the awesome world of chores
        // TODO: Create Visual reflecting the status of chores (Percentage complete, Jobs Available, Children, etc)
        // TODO: Create a quick and dirty report that could be saved to a file for printing or just viewing.








        // ---------------------------------- TESTING SECTION (chore chart) -----------------------------

        // TODO: MAKE TEST FUNCTIONS TO TEST FUNCTIONALITY OF ChoreTemplates
        // TODO: Test the functionality of the Default constructor
        ChoreChart chores = new ChoreChart();               // Testing to see if default Constructor is working
        System.out.println(chores.getChartName());          // Can we access the default names?
        System.out.println(chores.getChoreList());
        System.out.println(chores.getChoreStatus());
        System.out.println(chores.getChoreCount());


        // TODO: Test functionality of the template chore charts

        System.out.println("---------------------------------------------------------------------------");
        ChoreChart SundayChores = new ChoreChart(ChoreTemplates.Sunday, "Sunday Chores"); // Grab template
        System.out.println(SundayChores.getChartName());    // Can we access all the predetermined values?
        System.out.println(SundayChores.getChoreStatus());
        System.out.println(SundayChores.getChoreCount());
        System.out.println(SundayChores.getChoreList());


        // TODO: Test functionality of the template chore charts

        System.out.println("---------------------------------------------------------------------------");
        ChoreChart Bathroom = new ChoreChart(ChoreTemplates.BathroomChart, "Bathroom Chores"); // Grab template
        System.out.println(Bathroom.getChartName());        // Can we access all the predetermined values
        System.out.println(Bathroom.getChoreStatus());
        System.out.println(Bathroom.getChoreCount());
        System.out.println(Bathroom.getChoreList());

        // TODO: Test functionality of the template chore charts

        System.out.println("---------------------------------------------------------------------------");
        ChoreChart Kitchen = new ChoreChart(ChoreTemplates.KitchenChart, "Kitchen Chores"); // Grab template
        System.out.println(Kitchen.getChartName());         // Can we access our predetermined values?
        System.out.println(Kitchen.getChoreStatus());
        System.out.println(Kitchen.getChoreCount());
        System.out.println(Kitchen.getChoreList());

        System.out.println("-----------------------------------------------------------------------------");
        // TODO: Test the functionality of creating a custom chore chart and displaying its information
        ChoreChart chart = setCustomChoreList();    // Local Method to create chores and add them to chart
        System.out.println(chart.getChoreList());   // Test to see if chore list is retrievable
        chart.setChartName("Custom Chart");         // Can we set the new name?
        System.out.println(chart.getChartName());   // Can we verify that the new name has in fact been changed
        System.out.println(chart.getChoreCount());  // Will it keep count of the chores added to the list



        //------------------------------------------- TESTING SECTION (CHILDREN) ---------------------------


    }
}
