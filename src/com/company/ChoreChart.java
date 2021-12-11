/**
 * @author: Tiffany Blacksher
 * @author: Justin Blacksher
 * @Filename: ChoreChart.java
 * @description: Creates the chore chart whether its default or its custom. Templates available.
 */

package com.company;
import java.util.*;


public class ChoreChart {



    // TODO: Define private fields for ChoreChart Assigned - Justin
    private String chartName;
    // Defines the percentage completed
    private Boolean choreStatus = Boolean.FALSE;
    // Array list to handle chores
    private ArrayList<Object> choreList = new ArrayList<Object>();
    // Initialize the count to zero
    private Integer choreCount = 0;
    // Initialize the Chores done
    private Integer choresDone = 0;
    // HashMap of who completed what chores
    public static HashMap<String, String> doneChoresList = new HashMap<>();

    public static void choresDoneList(String name, String chore) {
        doneChoresList.put(chore, name);
    }

    public static void printChoreList(){
        for (String i : doneChoresList.keySet()){

            System.out.println(doneChoresList.get(i) + " Completed " + i);

        }

    }

    // ----------------------------------------------------------------- TEMPLATE CHART
    public ChoreChart(ArrayList tmp){ // Create Chart with template

        ArrayList tmpTEMP = tmp;

        this.setChartName("Template Chart");

        choreList.addAll(tmpTEMP);

        setChoreCount(tmpTEMP.size());


    }
    // --------------------------------------------------------------- DEFAULT CHART
    // TODO: Define Default constructor Assigned - Justin
    public ChoreChart(){                            // Defines a default chore chart that is quick and dirty
        this.chartName = "Default Chart";                // Default chart name will always be Default Chart

        // TODO: Add more default chores to the default initializer
        // TODO: Create a function with a loop that deals with the counter field for cleaner code
        SetDefaultChoreList();                      // Initializes the default chore list
    }


    // ----------------------------------------------------------- Create a custom chart
    // TODO: Define a constructor that will take a custom chore list as a param
    public ChoreChart(String[] List, String chartName){
        this.chartName = chartName;                 // Bring in the chart name and set

        // Add the chores from the list into the choreList and update the chore count
        for (String s : List) {
            this.choreList.add(s);
            choreCount++;
        }
    }

    // TODO: Define setters and getters
    public String getChartName() {
        return chartName;
    }

    public Boolean getChoreStatus() {
        return choreStatus;
    }

    public ArrayList<Object> getChoreList() {
        return choreList;
    }

    public Integer getChoreCount() {
        return choreCount;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public void setChoreStatus(Boolean choreStatus) {
        this.choreStatus = choreStatus;
    }

    public void setChoreList(ArrayList<Object> choreList) {
        this.choreList = choreList;
    }

    public void setChoreCount(Integer choreCount) {
        this.choreCount = choreCount;
    }
    public Integer getChoresDone() {
        return choresDone;
    }

    public void setChoresDone(Integer choresDone) {
        this.choresDone = choresDone;
    }

    // ***************************** METHODS
    // TODO: Define function to receive children object - Assigned Tiffany Blacksher
    // TODO: Define function that can add and remove chores from existing lists - Assigned Tiffany Blacksher
    // TODO: Define function that sets the default chore chart - Assigned Tiffany Blacksher
    /*
    THIS IS THE DEFAULT CONSTRUCTOR
    - Generates a chorelist by default
    - Sets the counter to the length of the default list
    - Adds the Generated list into the ArrayList for this module
    @author: Tiffany Blacksher
    */

    public void SetDefaultChoreList(){          // Creates default chore list
        String[] defChores = {"Sweep and Mop", "Make Beds", "Dishes", "Garbage",
                "Clean Bathroom", "Dust Rooms", "Remove dirt from wall by bed",
                "Vacuum Room", "Homework", "Read 30 Minutes", "Clean under bed",
                "Shower", "Brush Teeth", "Put away shoes", "Clean closets", "Organize clothes"
        };
        this.choreCount = defChores.length;         // This defines the chore count for accurate stats
        Collections.addAll(choreList, defChores); // This statement merges the defChores list with the ArrayList
    }

    // TODO: Create methods to create custom chore list
    public static ChoreChart setCustomChoreList(){
        Scanner scan = new Scanner(System.in); // Scanner object to get user input
        Scanner listNum = new Scanner(System.in); // Scanner to get other input
        System.out.print("Name the chart: ");
        String nameDefault = scan.nextLine();
        System.out.println("Setting Custom list:");
        System.out.print("How many items for this list: ");
        int listItems = listNum.nextInt();
        String[] customChores = new String[listItems];

        for (int i = 0; i < listItems; i++){
            System.out.println("Enter for position: " + i);
            customChores[i] = scan.nextLine();

        }
        ChoreChart customChart = new ChoreChart(customChores, nameDefault);
        customChart.setChoreCount(listItems);
        return customChart;
    }
    public static Boolean completeChoreChart(int num){
        if ( num == 0){
            Main.setHasChoreChartFalse();
            return Boolean.FALSE;
        }
        else{
            Main.setHasChoreChartTrue();
            return Boolean.TRUE;
        }
    }

}

