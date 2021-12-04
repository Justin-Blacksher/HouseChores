package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class ChoreChart {



    // TODO: Define private fields for ChoreChart Assigned - Justin
    private String chartName;
    private Double choreStatus;
    private ArrayList<String> choreList;
    private Integer choreCount;



    // TODO: Define Default constructor Assigned - Justin
    public ChoreChart(){                            // Defines a default chore chart that is quick and dirty
        chartName = "Default Chart";                // Default chart name will always be Default Chart
        choreStatus = 0.0;                          // Defines the percentage completed
        choreCount = 0;                             // Initialize the count to zero
        choreList = new ArrayList<String>();        // Array list to handle chores

        // TODO: Add more default chores to the default initializer
        // TODO: Create a function with a loop that deals with the counter field for cleaner code
        SetDefaultChoreList();                      // Initializes the default chore list
    }

    // TODO: Define a constructor that will take a custom chore list as a param
    public ChoreChart(String[] List, String chartName){
        this.chartName = chartName;
        this.choreStatus = 0.0;
        choreCount = 0;
        choreList = new ArrayList<String>();

        // Add the chores from the list into the choreList and update the chore count
        for (String s : List) {
            choreList.add(s);
            choreCount++;
        }
    }

    // TODO: Define setters and getters
    public String getChartName() {
        return chartName;
    }

    public Double getChoreStatus() {
        return choreStatus;
    }

    public ArrayList<String> getChoreList() {
        return choreList;
    }

    public Integer getChoreCount() {
        return choreCount;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public void setChoreStatus(Double choreStatus) {
        this.choreStatus = choreStatus;
    }

    public void setChoreList(ArrayList<String> choreList) {
        this.choreList = choreList;
    }

    public void setChoreCount(Integer choreCount) {
        this.choreCount = choreCount;
    }
    // ***************************** METHODS
    // TODO: Define function to receive children object
    // TODO: Define function that can add and remove chores from existing lists
    // TODO: Define function that sets the default chore chart
    public void SetDefaultChoreList(){          // Creates default chore list
        String[] defChores = {"Sweep and Mop", "Make Beds", "Dishes", "Garbage",
                              "Clean Bathroom", "Dust Rooms", "Remove dirt from wall by bed",
                              "Vacuum Room", "Homework", "Read 30 Minutes", "Clean under bed",
                              "Shower", "Brush Teeth", "Put away shoes", "Clean closets", "Organize clothes"
        };
        this.choreCount = defChores.length;
        Collections.addAll(choreList, defChores);
    }

}


