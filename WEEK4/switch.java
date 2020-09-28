import java.util.Scanner;
class CalculatorSwitch {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result = 0;
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        // ask user to enter operator
        System.out.print("Enter operator (either +, -, * or /): ");
        // store the inputted character to operator variable
        operator = scanner.next().charAt(0);
        // ask user to enter numbers
        System.out.print("Enter number1 and number2 respectively: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        switch (operator) {
            case‘ +’:
                result = numer1 + number 2;
                System.out.println(number1 + " + " + number2 + “ = ”+result);
                break;
            case‘ -’:
                result = numer1 - number 2;
                System.out.println(number1 + " - " + number2 + “ = ”+result);
                break;
            case‘ *’:
                result = numer1 * number 2;
                System.out.println(number1 + " x " + number2 + “ = ”+result);
                break;
            case‘ /’:
            result = numer1 / number 2;
            System.out.println(number1 + " / " + number2 + “ = ”+result);
            break;
            default:
                System.out.println(“Invalid operator!”);
                break;
        }
    }
}
