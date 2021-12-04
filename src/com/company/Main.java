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
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    private static String[] args;

    // TODO Write Main functions specific to Main
    // TODO: Create Function that grabs all available chore charts

    /*

    public String viewTemplates(){
        System.out.println("Bathroom Chores:");
        System.out.println("------------------")
        System.out.println(Arrays.toString(ChoreTemplates.getBathroomChart()));

           }
    */

    public static void menuTree(){      // Decision Tree for creating the menu
        Boolean menuItemSelected = Boolean.FALSE;
        Boolean hasChildren = Boolean.FALSE;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner object to get user input





        // ---------------------------------- TESTING SECTION -----------------------------

        // TODO: MAKE TEST FUNCTIONS TO TEST FUNCTIONALITY OF ChoreTemplates
        // TODO: Test the functionality of the Default constructor
        ChoreChart chores = new ChoreChart();
        System.out.println(chores.getChartName());
        System.out.println(chores.getChoreList());
        System.out.println(chores.getChoreStatus());
        System.out.println(chores.getChoreCount());


        // TODO: Test functionality of the template chore charts

        System.out.println("---------------------------------------------------------------------------");
        ChoreChart SundayChores = new ChoreChart(ChoreTemplates.Sunday, "Sunday Chores");
        System.out.println(SundayChores.getChartName());
        System.out.println(SundayChores.getChoreStatus());
        System.out.println(SundayChores.getChoreCount());
        System.out.println(SundayChores.getChoreList());


        // TODO: Test functionality of the template chore charts

        System.out.println("---------------------------------------------------------------------------");
        ChoreChart Bathroom = new ChoreChart(ChoreTemplates.BathroomChart, "Bathroom Chores");
        System.out.println(Bathroom.getChartName());
        System.out.println(Bathroom.getChoreStatus());
        System.out.println(Bathroom.getChoreCount());
        System.out.println(Bathroom.getChoreList());

        // TODO: Test functionality of the template chore charts

        System.out.println("---------------------------------------------------------------------------");
        ChoreChart Kitchen = new ChoreChart(ChoreTemplates.KitchenChart, "Kitchen Chores");
        System.out.println(Kitchen.getChartName());
        System.out.println(Kitchen.getChoreStatus());
        System.out.println(Kitchen.getChoreCount());
        System.out.println(Kitchen.getChoreList());

        System.out.println("-----------------------------------------------------------------------------");




    }
}
