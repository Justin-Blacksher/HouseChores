package com.company;

public class ChoreTemplates {

    // TODO: Create Templates for use in creation of chore charts
    static String[] Sunday = {"Clean Shower", "Clean Toilet", "Mop Hallway", "Sweep Porch", "Read 30 Minutes",
            "Shower", "Lay out clothes for school", "Organize schoolwork"};
    static String[] BathroomChart = {"Clean toilet", "Clean Shower", "Mop Floor", "Clean Sink"};
    static String[] KitchenChart = {"Dishes", "Clean Fridge", "Mop floor", "Clean Microwave"};
    static String[] HallwayChart = {"Sweep Floor", "Shake Rugs", "Mop Floor", "Clean Molding ledges"};
    static String[] BedroomChart = {"Make Bed", "Clean under bed", "Organize closet","Organize bookshelf", "Clean walls"};
    static String[] EducationChart = {"Check canvas", "Make study todo list", "Do all late work", "Read 30m", "Study 20m"};

    public static String[] getSunday() {
        return Sunday;
    }

    public static String[] getBathroomChart() {
        return BathroomChart;
    }

    public static String[] getKitchenChart() {
        return KitchenChart;
    }

    public static String[] getHallwayChart() {
        return HallwayChart;
    }

    public static String[] getBedroomChart() {
        return BedroomChart;
    }

    public static String[] getEducationChart() {
        return EducationChart;
    }


    }
