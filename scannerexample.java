package scannerexample;

import java.util.Scanner;

public class scannerexample {

  public static void main(String[] args) {

    // Declare the object and initialize with
    // predefined standard input object
    Scanner sc = new Scanner(System. in );
    
    System.out.println("Enter the following information separatd by a new line (Enter Key): "
    		+ "\nName, Gender (M/F), Year of birth, Mobile No., Balance, GPA, Enrolment Status (True or False) ");
    // String input: 
    String fullname = sc.nextLine();
    
    // Character input
    char gender = sc.next().charAt(0);
    
    // Numerical data input
    int yrofbrth = sc.nextInt();
    long mobileNo = sc.nextLong();
    float balance = sc.nextFloat();
    double gpa = sc.nextDouble();
    
    // Boolean data input
    boolean enroll = sc.nextBoolean();
    
    // Print the values to check if the input and
    //computation was correctly obtained.
    System.out.println("Name: " + fullname);
    System.out.println("Gender: " + gender);
    System.out.println("Year of Birth: " + yrofbrth);
    
    //Assignment statement to calculate estimated age
    int age = 2020 - yrofbrth;
    System.out.println("Estimated age: " + age);
    System.out.println("Mobile Number: " + mobileNo);
    System.out.println("GPA: " + gpa);
    System.out.println("Enrolled: " + enroll);
    System.out.println("Payment Balance: " + balance);
  }

}
