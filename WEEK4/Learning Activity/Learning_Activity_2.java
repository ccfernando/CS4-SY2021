public static void main(String[] args) {
    String dayString = “”;
    String displayString = “Day string equivalent is: “;
    int dayNumeric;
    // create an object of Scanner class
    Scanner scanner = new Scanner(System.in);
    // ask user to enter a number
    System.out.print("Please enter numeric value of day in a week : ");
    // store the inputted value to dayNumeric variable
    dayNumeric = scanner.nextInt();
    switch (dayNumeric) {
        case 1:
            dayString = “Monday”;
            break;
        case 2:
            dayString = “Tuesday”;
            break;
        case 3:
            dayString = “Wednesday”;
            break;
        case 4:
            dayString = “Thursday”;
            break;
        case 5:
            dayString = “Friday”;
            break;
        case 6:
            dayString = “Saturday”;
            break;
        case 7:
            dayString = “Sunday”;
            break;
        default:
            dayString = “Invalid input”;
            displayString = “”;
            break;
    }
    System.out.println(displayString + dayString);
}
