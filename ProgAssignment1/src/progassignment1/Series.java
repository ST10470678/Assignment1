
package progassignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class Series {
 
   public ArrayList<String> SeriesID= new ArrayList<>(); //stores all series ids
   public ArrayList<String> SeriesName= new ArrayList<>(); //stores all series names
   private ArrayList<Integer> SeriesAge= new ArrayList<>(); //stores all series age restrictions
   private ArrayList<String> SeriesNumberOfEpisodes= new ArrayList<>(); //stores all ep numbers
   Scanner inputScanner = new Scanner(System.in); 

    public ArrayList<String> getSeriesID() {
        return SeriesID;
    }

    public void setSeriesID(ArrayList<String> SeriesID) {
        this.SeriesID = SeriesID;
    }

    public ArrayList<String> getSeriesName() {
        return SeriesName;
    }

    public void setSeriesName(ArrayList<String> SeriesName) {
        this.SeriesName = SeriesName;
    }

    public ArrayList<Integer> getSeriesAge() {
        return SeriesAge;
    }

    public void setSeriesAge(ArrayList<Integer> SeriesAge) {
        this.SeriesAge = SeriesAge;
    }

    public ArrayList<String> getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }

    public void setSeriesNumberOfEpisodes(ArrayList<String> SeriesNumberOfEpisodes) {
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }

    public Scanner getInputScanner() {
        return inputScanner;
    }

    public void setInputScanner(Scanner inputScanner) {
        this.inputScanner = inputScanner;
    }
    
   
   
   //method to caputre series
   public String captureSeries(){
       
       System.out.println("Enter series ID:");
       String ID= inputScanner.nextLine();
       SeriesID.add(ID); //asks user for series id and stores it
       
       int age;
       while(true){//loop for wrong age restriction
           System.out.println("Enter the series age restriction:");
           age= inputScanner.nextInt();
           inputScanner.nextLine();//asks user for age restriction
           
           if(age>=2 && age<= 18){
               System.out.println("Correct age registration added!");
               SeriesAge.add(age);
               break;
           }else{
           
               System.out.println("You have entered an incorrect age! Please re-enter >>");//if age restriction is under 2 or over 18 loops
           }
           
       }
   
       System.out.println("Enter series name:");
       String name=inputScanner.nextLine();
       SeriesName.add(name);// asks and stores series name
       
     
       
       System.out.println("Enter the number of episodes of "+name);
       String epNum=inputScanner.nextLine();
       SeriesNumberOfEpisodes.add(epNum);//asks and stores ep number
       return ID;
   } 
    
    
   //method to search a series
   public void searchSeries(){

        System.out.println("Enter the series id to search: ");
        String id= inputScanner.nextLine();
        int index=SeriesID.indexOf(id);//asks user for id to search
        
        if(index !=-1){
            //on successful search displays series info
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("Series ID: "+ SeriesID.get(index));
            System.out.println("Series name: "+ SeriesName.get(index));
            System.out.println("Series age restriction: "+ SeriesAge.get(index));
            System.out.println("Series number of episodes: "+ SeriesNumberOfEpisodes.get(index));
            System.out.println("------------------------------------");
            System.out.println("");
            
        }else{
        
            System.out.println("Series with Id: "+id+" was not found! Please try again >>"); //asks for another id if it cant be found
            
        }
      
    }
   
     //method to update series info
    public void updateSeries(){
    
        
        System.out.println("Enter the series id to update or press (1) to return to menu: ");
        String id= inputScanner.nextLine();//asks user for series id
 
        int index=SeriesID.indexOf(id);
         
        if(index !=-1){//if id is found allows for updates
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("Enter new series name: ");
            String upName= inputScanner.nextLine();
            SeriesName.set(index, upName);
            
            System.out.println("Enter new age restriction: ");
            int upAge=inputScanner.nextInt();
            inputScanner.nextLine();
            SeriesAge.set(index, upAge);
            
            System.out.println("Enter new number of episodes: ");
            String epNumUp= inputScanner.nextLine();
            SeriesNumberOfEpisodes.set(index, epNumUp);
            System.out.println("------------------------------------");
            System.out.println("");

        }else{//if id is not found
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("Series with Id: "+id+" was not found!");
            System.out.println("------------------------------------");
            System.out.println("");
        } 
        }
    
    //to delete series from array
    public void deleteSeries(){
        
        System.out.println("Please enter the series id to be deleted: ");
        String id=inputScanner.nextLine();//searches for series using id
        
        int index=SeriesID.indexOf(id);
        
        if(index !=-1){//if found will ask if sure to delete
            System.out.println("Are you sure you want to delete series "+id+" from the system? Yes (y) to delete: ");
            String input= inputScanner.nextLine();
            
            if ("y".equals(input)){//deletes series from arrays
                
                SeriesID.remove(index);
                SeriesName.remove(index);
                SeriesAge.remove(index);
                SeriesNumberOfEpisodes.remove(index);
                
                System.out.println("Series with series id "+id+" was deleted successfully!");//confirms series deleted
            }   
        }else{
            
            System.out.println("Series with Id: "+id+" was not found!");//if series not found
        }
    }
    
    //shows full series report
    public void seriesReport(){
        
        if (SeriesID.isEmpty()){//if there are no ids
        
            System.out.println("No series id found.");
            
        }

        for(int i=0; i<SeriesID.size(); i++){//will show full report
        System.out.println("");    
        System.out.println("------------------------------------");
            System.out.println(SeriesID.get(i));
            System.out.println(SeriesName.get(i));
            System.out.println(SeriesAge.get(i));
            System.out.println(SeriesNumberOfEpisodes.get(i));
        System.out.println("------------------------------------");
        System.out.println("");
        }
    }
    
    //method to exit program
    public void exitSeriesProgram(){
        System.out.println("Exiting Program!");
        inputScanner.close();
        System.exit(0);
    }
    
    public void captureSeries(String ID, int age, String name, String epNum) {
    SeriesID.add(ID);
    SeriesAge.add(age);
    SeriesName.add(name);
    SeriesNumberOfEpisodes.add(epNum);
 }
}