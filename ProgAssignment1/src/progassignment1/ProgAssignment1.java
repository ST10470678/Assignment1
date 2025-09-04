
package progassignment1;
import java.util.Scanner;

public class ProgAssignment1 {

    
    public static void main(String[] args) {

        Series inputs=new Series();
        Scanner scanner = new Scanner(System.in);
        String choice1;
        int choice2;
        
       do{ //loops premenu until user presses anything other than "1"
           //premenu
        System.out.println("Enter (1) to launch menu or any other key to exit:");
        choice1= scanner.nextLine(); //stores user's input

        if("1".equals(choice1)){

        // Display Menu
        System.out.println("(1) Capture a new series."); //to capture a new series
        System.out.println("(2) Search for a series.");  //to search for a new series
        System.out.println("(3) Update series age Restriction."); //to update said new series
        System.out.println("(4) Delete a series."); //to delete a series from array
        System.out.println("(5) Print series report- 2025"); //print a report of all series
        System.out.println("(6) Exit Application."); //exits application
        
        System.out.print("Enter your choice:");
        choice2= scanner.nextInt(); //stores user's choice for menu
        scanner.nextLine(); //clears scanner

        
       switch(choice2){
       
           case 1 -> inputs.captureSeries(); //calls capture method
   
           case 2 -> inputs.searchSeries(); //calls search method
   
           case 3 -> inputs.updateSeries(); //calls update series info method
   
           case 4 -> inputs.deleteSeries(); //calls delete series method
               
           case 5 -> inputs.seriesReport(); //calls series report method
    
           case 6 -> inputs.exitSeriesProgram(); //calls exit program method
                             
           default -> System.out.println("Invalid choice please try again!"); //default in chance of not valid input
       }
        }
        else{
            inputs.exitSeriesProgram(); //exits program on anything other than a 1 
        } 
    }while("1".equals(choice1));
  }
}

/*
Refrence list:
Farrell, J., 2022. Java Programming. 10th ed. Boston, MA: Cengage Learning US.
*/