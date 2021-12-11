/**
 * @author: Tiffany Blacksher
 * @author: Justin Blacksher
 * @Filename: Children.java
 * @description: Creates an object for keeping track of groups of children or single child.
 */
package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Children {
    Scanner scan = new Scanner(System.in);
    private int numChildren;    // Keeps track of how many childrens
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> chores = new ArrayList<String>();

    public Children(int numKids, ChoreChart chart ) { // Default Constructor for the children class


        chart.getChoreList().forEach(i -> chores.add((String) i));
        this.setNumChildren(numKids);  // Default value is equal to zero
        HashMap<String, ChoreChart> childrenCharts = new HashMap<>();
        for (int i = 0; i < this.getNumChildren(); i++){      // Creates a List of children and associated Chore Chart
            String tmpName;
            ChoreChart tmpChart;


            System.out.println("Name of Child: ");
            tmpName = scan.nextLine();
            tmpChart = chart;
            names.add(tmpName);
            
            childrenCharts.put(tmpName, tmpChart);      // Creates hash map of the iterated names, objects

        }

    }

    public int getNumChildren() {   // Getter for the number of children
        return numChildren;
    }

    public void setNumChildren(int numChildren) {    // setter for the number of children
        this.numChildren = numChildren;
    }
}
//  public HashMap<String, ChoreChart> Children(int numKids, ChoreChart chart) {
//      HashMap<String, ChoreChart> childrenCharts = new HashMap<>();
//      int numChildren = numKids;
//      System.out.println("Name the Chart: ");
//      chart.setChartName(scan.nextLine());
//
//      for (int i = 0; i < numChildren; i++) {
//          String tmpName;
//          ChoreChart tmpChart = chart;
//
//
//          System.out.println("Name of Child: ");
//          tmpName = scan.nextLine();
//
//
//          childrenCharts.put(tmpName, tmpChart);
//      }
//      ChoreChart value = childrenCharts.get("James");
//      //System.out.println(childrenCharts);
//      System.out.println(value.getChartName());
//      System.out.println(value.getChoreList());
//
//      for (String i : childrenCharts.keySet()) {
//          System.out.println(i);
//      }
//      return childrenCharts;
//  }
