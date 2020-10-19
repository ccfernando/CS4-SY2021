import java.util.* ;
public class ExerciseArray {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System. in );
    double[] numbersList = new double[10];

    System.out.println("Enter " + numbersList.length + " values: \n");
    for (int i = 0; i < numbersList.length; i++) {
      System.out.print("numbersList[" + i + "]: ");
      numbersList[i] = keyboard.nextDouble();
    }
    System.out.println();
    System.out.print("The values entered: ");
    for (double e: numbersList) {
      System.out.print(e + " ");
    }
    double max = numbersList[0];
    for (int i = 1; i < numbersList.length; i++) {
      if (numbersList[i] > max) {
       max = numbersList[i];
    }
    System.out.println();
    System.out.println("The largest value is: " + max);
  }
}
