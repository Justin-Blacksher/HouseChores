package com.company;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.ChoreChart.*;
import static com.company.ChoreChart.completeChoreChart;
import static com.company.ChoreChart.setCustomChoreList;


public class Graphics {


   public static void EntryGraphic() {


      // TODO: Split into two words maybe because it is so huge.

      System.out.println(" CCCCCCCCCCCCChhhhhhh                                                                                   CCCCCCCCCCCCChhhhhhh                                                           tttt");
      System.out.println(" CCC::::::::::::Ch:::::h                                                                                CCC::::::::::::Ch:::::h                                                        ttt:::t");
      System.out.println(" CC:::::::::::::::Ch:::::h                                                                              CC:::::::::::::::Ch:::::h                                                        t:::::t");
      System.out.println(" C:::::CCCCCCCC::::Ch:::::h                                                                             C:::::CCCCCCCC::::Ch:::::h                                                        t:::::t");
      System.out.println(" C:::::C       CCCCCC h::::h hhhhh          ooooooooooo   rrrrr   rrrrrrrrr       eeeeeeeeeeee          C:::::C       CCCCCC h::::h hhhhh         aaaaaaaaaaaaa  rrrrr   rrrrrrrrr   ttttttt:::::ttttttt");
      System.out.println(" C:::::C               h::::hh:::::hhh     oo:::::::::::oo r::::rrr:::::::::r    ee::::::::::::ee       C:::::C               h::::hh:::::hhh      a::::::::::::a r::::rrr:::::::::r  t:::::::::::::::::t");
      System.out.println(" C:::::C               h::::::::::::::hh  o:::::::::::::::or:::::::::::::::::r  e::::::eeeee:::::ee     C:::::C               h::::::::::::::hh    aaaaaaaaa:::::ar:::::::::::::::::r t:::::::::::::::::t");
      System.out.println(" C:::::C               h:::::::hhh::::::h o:::::ooooo:::::orr::::::rrrrr::::::re::::::e     e:::::e     C:::::C               h:::::::hhh::::::h            a::::arr::::::rrrrr::::::rtttttt:::::::tttttt");
      System.out.println(" C:::::C               h::::::h   h::::::ho::::o     o::::o r:::::r     r:::::re:::::::eeeee::::::e     C:::::C               h::::::h   h::::::h    aaaaaaa:::::a r:::::r     r:::::r      t:::::t");
      System.out.println(" C:::::C               h:::::h     h:::::ho::::o     o::::o r:::::r     rrrrrrre:::::::::::::::::e      C:::::C               h:::::h     h:::::h  aa::::::::::::a r:::::r     rrrrrrr      t:::::t");
      System.out.println(" C:::::C               h:::::h     h:::::ho::::o     o::::o r:::::r            e::::::eeeeeeeeeee       C:::::C               h:::::h     h:::::h a::::aaaa::::::a r:::::r                  t:::::t");
      System.out.println(" C:::::C       CCCCCC h:::::h     h:::::ho::::o     o::::o r:::::r            e:::::::e                 C:::::C       CCCCCC h:::::h     h:::::ha::::a    a:::::a r:::::r                  t:::::t    tttttt");
      System.out.println(" C:::::CCCCCCCC::::C h:::::h     h:::::ho:::::ooooo:::::o r:::::r            e::::::::e                 C:::::CCCCCCCC::::C h:::::h     h:::::ha::::a    a:::::a r:::::r                  t::::::tttt:::::t");
      System.out.println(" CC:::::::::::::::C h:::::h     h:::::ho:::::::::::::::o r:::::r             e::::::::eeeeeeee          CC:::::::::::::::C h:::::h     h:::::ha:::::aaaa::::::a r:::::r                  tt::::::::::::::t");
      System.out.println(" CCC::::::::::::C h:::::h     h:::::h oo:::::::::::oo  r:::::r              ee:::::::::::::e            CCC::::::::::::C h:::::h     h:::::h a::::::::::aa:::ar:::::r                    tt:::::::::::tt");
      System.out.println(" CCCCCCCCCCCCC hhhhhhh     hhhhhhh   ooooooooooo    rrrrrrr                eeeeeeeeeeeeee               CCCCCCCCCCCCC hhhhhhh     hhhhhhh  aaaaaaaaaa  aaaarrrrrrr                      ttttttttttt");

   }






   // ------------------------------------------------------------ MAIN MENU

   public static void DefaultMenu() {

      Scanner scan = new Scanner(System.in);
      int selection = 0;
      Main.setHasChoreChartFalse();
      Main.setHasChildrenFalse();


      System.out.println("***************************************");
      System.out.println("                 MAIN                  ");
      System.out.println("***************************************");
      System.out.println("* Program: Chore Chart 1.0");
      System.out.println("* Authors: Tiffany and Justin Blacksher");
      System.out.println(" ");
      System.out.println("Status: There are no chore charts. You must add chore charts");
      System.out.println(" ");
      System.out.println("1. Add children              (Unavailable Need a chore chart first)");
      System.out.println("2. Add Chore Chart");
      System.out.println("3. Change Chore Status       (Unavailable Need Chore chart First)");

      System.out.println(" ");
      System.out.print("Enter Selection (All unavailable press 2 to start the setup process.) : ");
      selection = scan.nextInt();

      Main.clearTheScreen();

      System.out.println("*********************************************************");
      System.out.println("*               CHORE OPTIONS                           *");
      System.out.println("*********************************************************");
      System.out.println(" ");
      System.out.println("1. Create chart from scratch");
      System.out.println("2. Create chart from Template");
      System.out.println("3. Create default chart");
      System.out.println(" ");
      System.out.print("Selection: ");

      int selectionChart = scan.nextInt();
      if (selectionChart == 1) {
         Main.clearTheScreen();
         ChoreChart tmpChart = setCustomChoreList();
         Main.setActiveChart(tmpChart);
         Main.setHasChoreChartTrue();


      } else if (selectionChart == 2) {
         Main.clearTheScreen();

         ChoreChart tmpChart;
         System.out.println("********** Templates *************");
         System.out.println("1. Bathroom Chart");
         System.out.println("2. Bedroom Chart");
         System.out.println("3. Sunday Chart");
         System.out.println("4. Education Chart");
         System.out.println("5. Hallway Chart");
         System.out.println("6. Kitchen Chart");
         System.out.println("***********************************");
         System.out.println("");
         System.out.print("Selection: ");


         int chartSelection = scan.nextInt();
         switch (chartSelection) {
            case 1:
               tmpChart = new ChoreChart(ChoreTemplates.BathroomChart);
               tmpChart.setChartName("Bathroom Chart");
               Main.setActiveChart(tmpChart);
               Main.setHasChoreChartTrue();
               OpenMenu(tmpChart);

            case 2:
               tmpChart = new ChoreChart(ChoreTemplates.BedroomChart);
               tmpChart.setChartName("Bedroom Chart");
               Main.setActiveChart(tmpChart);
               Main.setHasChoreChartTrue();
               OpenMenu(tmpChart);

            case 3:
               tmpChart = new ChoreChart(ChoreTemplates.Sunday);
               tmpChart.setChartName("Sunday FUNDAY! Chart");
               Main.setActiveChart(tmpChart);
               Main.setHasChoreChartTrue();
               OpenMenu(tmpChart);

            case 4:
               tmpChart = new ChoreChart(ChoreTemplates.EducationChart);
               tmpChart.setChartName("Education Chart");
               Main.setActiveChart(tmpChart);
               Main.setHasChoreChartTrue();
               OpenMenu(tmpChart);

            case 5:
               tmpChart = new ChoreChart(ChoreTemplates.HallwayChart);
               tmpChart.setChartName("Hallway Chart");
               Main.setActiveChart(tmpChart);
               Main.setHasChoreChartTrue();
               OpenMenu(tmpChart);

            case 6:
               tmpChart = new ChoreChart(ChoreTemplates.KitchenChart);
               tmpChart.setChartName("Kitchen Chart");
               Main.setActiveChart(tmpChart);
               Main.setHasChoreChartTrue();
               OpenMenu(tmpChart);

         }
      } else if (selection == 3) {
         String name;
         ChoreChart tmpChart = new ChoreChart();
         tmpChart.SetDefaultChoreList();
         name = scan.nextLine();
         tmpChart.setChartName(name);
         Main.setActiveChart(tmpChart);
         Main.setHasChoreChartTrue();
         OpenMenu(tmpChart);

      }


   }



   // ------------------------------------------------------------------- OPEN MENU


   public static void OpenMenu(ChoreChart chart) {

      Scanner scan = new Scanner(System.in);
      int selection;


      System.out.println("***************************************");
      System.out.println("                 MAIN                  ");
      System.out.println("***************************************");
      System.out.println("* Program: Chore Chart 1.0");
      System.out.println("* Authors: Tiffany and Justin Blacksher");
      System.out.println(" ");
      System.out.println("Chart Created: " + chart.getChartName());
      System.out.println("Total Chores: " + chart.getChoreCount());
      System.out.println(" ");
      System.out.println("Missing Children needed");
      System.out.println(" ");
      System.out.println("1. Add children");
      System.out.println("2. Add Chore Chart");
      System.out.println("3. Change Chore Status");

      System.out.println(" ");
      System.out.print("Enter Selection (will default to 1): ");
      selection = scan.nextInt();


      if (selection == 1) {
         int numChildren;
         System.out.print("How many children: ");
         numChildren = scan.nextInt();
         ChoreChart myChart = Main.activeChart;
         Children myKids = new Children(numChildren, myChart);
         Main.setActiveChildren(myKids);
         Main.setHasChildrenTrue();
         FinalMenu(Main.activeChart, Main.activeChildren);
      } else {
         int numChildren;
         System.out.print("How many children: ");
         numChildren = scan.nextInt();
         ChoreChart myChart = Main.activeChart;
         Children myKids = new Children(numChildren, myChart);
         Main.setActiveChildren(myKids);
         Main.setHasChildrenTrue();
         FinalMenu(Main.activeChart, Main.activeChildren);
      }
   }



   // ---------------------------------------------------------------- FINAL MENU


   public static void FinalMenu(ChoreChart chart, Children children) {

      Scanner scan = new Scanner(System.in);
      int finalSelection;



      System.out.println("***************************************");
      System.out.println("                 MAIN                  ");
      System.out.println("***************************************");
      System.out.println("* Program: Chore Chart 1.0");
      System.out.println("* Authors: Tiffany and Justin Blacksher");
      System.out.println(" ");
      System.out.println("----------------- Chores Done --------------------");
      System.out.println(" ");
      ChoreChart.printChoreList();
      System.out.println(" ");
      System.out.println("--------------------------------------------------");
      System.out.println("Press Enter To Continue: ");
      System.out.printf("Chart Created: %s%n", chart.getChartName());
      System.out.printf("Total Chores: %d%n", chart.getChoreCount());
      System.out.println(" ");
      System.out.println("Children Added!");
      System.out.println("---------------------------------------");
      ArrayList<String> names = children.names;
      for (int j = 0; j < names.size(); j++) {
         String i = names.get(j);
         System.out.println("[+] " + i);
      }
      System.out.println("----------------------------------------");
      System.out.println(" ");
      System.out.println("1. Add children (Completed)");
      System.out.println("2. Add Chore Chart (Completed)");
      System.out.println("3. Change Chore Status");
      System.out.println(" ");
      System.out.println("Until more features are added you can only Change chore status");
      System.out.print("Press Enter to Change Chore Status ");
      scan.nextLine();
      finalSelection = 3;

      switch (finalSelection){
         case 3:
            String name;
            String doneChore;
            System.out.println("********************************************");
            System.out.println("*          Choose Child                    *");
            System.out.println("********************************************");
            ArrayList<String> myNames = children.names;
            for (int j = 0; j < myNames.size(); j++) {
               String i = names.get(j);
               System.out.println("[+] " + i);

            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.print("Make your selection (Type exactly as shown) : ");
            name = scan.next();
            scan.nextLine();
            ArrayList<String> myChores = children.chores;
            for (String i : myChores){
               System.out.println("[+] " + i );
            }
            System.out.print("Which chore would you like to complete (Type exactly as shown): ");
            doneChore = scan.nextLine();

            myChores.remove(doneChore);
            System.out.println(" ");
            System.out.println("***************");
            System.out.println("The remaining chores are.");
            for (String i : myChores){
               System.out.println("[+] " + i );
            }
            Main.activeChart.setChoreCount(Main.activeChart.getChoreCount() - 1 );

            Boolean comp = completeChoreChart(Main.activeChart.getChoreCount());
            ChoreChart.choresDoneList(name, doneChore);
            if (comp == Boolean.TRUE){
               System.out.println("------------------------");
               ChoreChart.printChoreList();
               System.out.println("------------------------");
               System.out.println("Press Enter To Continue: ");
               scan.nextLine();
               FinalMenu(Main.activeChart, Main.activeChildren);
            }
            else{
               System.out.println("------------------------");
               ChoreChart.printChoreList();
               System.out.println("------------------------");
               System.out.println("Press Enter To Continue: ");
               scan.nextLine();
               DefaultMenu();
            }

         default:
            throw new IllegalStateException("Unexpected value: Reporting function TBA " + finalSelection);


      }

   }
}