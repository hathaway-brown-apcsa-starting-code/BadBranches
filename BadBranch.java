import java.util.Scanner;

public class BadBranch
{

  /** Converts a numeric grade (percent) to a letter grade */
  public static String getLetterGrade(int grade)
  {
    String ans;
    if (grade >= 90)  {
      ans = "A";
    }
    if (grade >= 80)  {
      ans = "B"; 
    }
    if (grade >= 70)  {
      ans = "C";
    }
    if (grade >= 60)  {
      ans = "D";
    }
    else {
      ans = "F";
    }
    return ans;
  }

  /** a main method for testing   */
  public static void main (String[] args)
  {
    Scanner kbd = new Scanner (Systen.in);
    System.out.println("Enter a numeric grade: ");
    int grade = kbd.nextInt();
    while (grade >= 0) {
      System.out.println ("A grade of " + grade + " is a(n) " + getLetterGrade(grade));
      System.out.println("\nEnter a numeric grade (negative to quit): ");
      grade = kbd.nextInt();
    }
    kbd.close();
    
