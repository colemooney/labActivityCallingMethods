import java.util.Scanner;
public class LabActivityCallingMethods
{
  public static void main(String[] arg)
  {
    
    //CONSTANTS
    final double BASELINE_EXECUTION_TIME = 14.52; //seconds
    
    //VARIABLES
    double computerExecutionTime; //seconds
  
    
    String computerOneDescription;
    double computerOneRelativePerformance;
    
    String computerTwoDescription;
    double computerTwoRelativePerformance;
    
    String computerThreeDescription;
    double computerThreeRelativePerformance;
    
    //ARRAYS
    
    //OBJECTS
    Scanner keyboardInput = new Scanner(System.in);
    
    //SOLUTION
    CS170.information("Cole Mooney", "Lab Activity", "Calling Method");
    
    //Computer 1 Keyboard Input
    System.out.print("Enter Computer 1 Description: "); 
    computerOneDescription = keyboardInput.nextLine(); //save description
    System.out.print("Enter Computer 1 Execution Time (Seconds): ");
    computerExecutionTime = keyboardInput.nextDouble(); //save execution time
    keyboardInput.nextLine(); //start new line 
    
    computerOneRelativePerformance = ComputerArchitecture.relativePerformance(computerExecutionTime, BASELINE_EXECUTION_TIME);  //save method solution to double
    
    //Computer 2 Keyboard Input
    System.out.print("Enter Computer 2 Description: ");
    computerTwoDescription = keyboardInput.nextLine();
    System.out.print("Enter Computer 2 Execution Time (Seconds): ");
    computerExecutionTime = keyboardInput.nextDouble();
    keyboardInput.nextLine();
    
    computerTwoRelativePerformance = ComputerArchitecture.relativePerformance(computerExecutionTime, BASELINE_EXECUTION_TIME);  
    
    //Computer 3 Keyboard Input
    System.out.print("Enter Computer 3 Description: ");
    computerThreeDescription = keyboardInput.nextLine();
    System.out.print("Enter Computer 3 Execution Time (Seconds): ");
    computerExecutionTime = keyboardInput.nextDouble();
    keyboardInput.nextLine();
    
    computerThreeRelativePerformance = ComputerArchitecture.relativePerformance(computerExecutionTime, BASELINE_EXECUTION_TIME);  
    
    
    //Results
    System.out.println("Computer 1 Description: " + computerOneDescription + "  Relative Performance: " + computerOneRelativePerformance + " of Computer 1");
    
    System.out.println("Computer 2 Description: " + computerTwoDescription + "  Relative Performance: " + computerTwoRelativePerformance + " of Computer 2");
    
    System.out.println("Computer 3 Description: " + computerThreeDescription + "  Relative Performance: " + computerThreeRelativePerformance + " of Computer 3");

   
   
    keyboardInput.close();
    
    }
}
