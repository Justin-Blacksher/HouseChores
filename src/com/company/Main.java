package com.company;

public class Main {

    public static void main(String[] args) {




        ChoreChart chores = new ChoreChart();
        System.out.println(chores.getChartName());
        System.out.println(chores.getChoreList());
        System.out.println(chores.getChoreStatus());
        System.out.println(chores.getChoreCount());

        String[] Sunday = {"Clean Shower", "Clean Toilet", "Mop Hallway", "Sweep Porch", "Read 30 Minutes",
                           "Shower", "Lay out clothes for school", "Organize schoolwork"
        };
        System.out.println("---------------------------------------------------------------------------");
        ChoreChart SundayChores = new ChoreChart(Sunday, "Sunday Chores");
        System.out.println(SundayChores.getChartName());
        System.out.println(SundayChores.getChoreStatus());
        System.out.println(SundayChores.getChoreCount());
        System.out.println(SundayChores.getChoreList());


    }
}
