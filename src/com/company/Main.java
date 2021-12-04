package com.company;

public class Main {

    private static String[] args;

    public static void main(String[] args) {


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
        ChoreChart SundayChores = new ChoreChart(ChoreTemplates.Bathroom, "Sunday Chores");
        System.out.println(SundayChores.getChartName());
        System.out.println(SundayChores.getChoreStatus());
        System.out.println(SundayChores.getChoreCount());
        System.out.println(SundayChores.getChoreList());


    }
}
