/**
 * @author: Tiffany Blacksher
 * @author: Justin Blacksher
 * @Filename: Children.java
 * @description: Creates an object for keeping track of groups of children or single child.
 */
package com.company;
import java.util.HashMap;
import java.util.Scanner;


public class Children {
    Scanner scan = new Scanner(System.in);
    private int numChildren;    // Keeps track of how many childrens


    public Children(int numKids) { // Default Constructor for the children class

        numChildren = numKids; // Default value is equal to zero
        HashMap<String, ChoreChart> childrenCharts = new HashMap<>();
        for (int i = 0; i < numKids; i++){      // Creates a List of children and associated Chore Chart
            String tmpName;
            ChoreChart tmpChart;

            System.out.println("Name of Child: ");
            tmpName = scan.nextLine();
            tmpChart = new ChoreChart();

            childrenCharts.put(tmpName, tmpChart);      // Creates hash map of the iterated names, objects

        }

        // TESTS
        ChoreChart value = childrenCharts.get("James");
        System.out.println(childrenCharts);
        System.out.println(value.getChartName());

        for (String i : childrenCharts.keySet()) {
            System.out.println(i);
        }


    }

    public int getNumChildren() {   // Getter for the number of children
        return numChildren;
    }

    public void setNumChildren(int numChildren) {    // setter for the number of children
        this.numChildren = numChildren;
    }
}
