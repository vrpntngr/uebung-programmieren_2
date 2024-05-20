package de.htw.berlin.vorlesung.nr6;

public class SwitchCaseBeispiele {

    public static void main(String[] args) {
        weekdayFromIfElse(4);
        weekdayFromIfElse(8);
        System.out.println(weekDayFromSwitch(4));
        System.out.println(weekDayFromSwitch(8));
        System.out.println(weekDayFromSwitchModern(4));
        System.out.println(weekDayFromSwitchModern(8));
        weekdayFrom(4);
        weekdayFrom(8);
        //weekdayFrom2(4);
        //weekdayFrom2(8);
    }

    public static String weekDayFromSwitch(int day) throws MeineSpecialException {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new MeineSpecialException("Invalid day: " + day);
        }

    }

    public static String weekDayFromSwitchModern(int day) {
        String stringDay = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "No valid day";
        };
        return stringDay;
    }

    public static void weekdayFromIfElse(int day) {
        String dayString;

        if (day == 1) {
            dayString = "Monday";
        } else if (day == 2) {
            dayString = "Tuesday";
        } else if (day == 3) {
            dayString = "Wednesday";
        } else if (day == 4) {
            dayString = "Thursday";
        } else if (day == 5) {
            dayString = "Friday";
        } else if (day == 6) {
            dayString = "Saturday";
        } else if (day == 7) {
            dayString = "Sunday";
        } else {
            dayString = "Invalid day";
        }

        System.out.println("The day is " + dayString);
    }

    public static void weekdayFrom(int day) {
        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
            default:
                dayString = "Invalid day";
        }

        System.out.println("The day is " + dayString);
    }

    // neuere Schreibweise
    public static void weekdayFrom2(int day) {
        String dayString = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("The day is " + dayString);
    }
}


