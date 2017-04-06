
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    // instance variables - replace the example below with your own
    private int numWindows;
    
    public int getWindows()
    {
        return numWindows;
    }
        
    
    public int compareTo(Vehicle t)
    {
       int different = 0;
       if (t instanceof Truck)
       {
           Truck truckOne = (Truck)t;
           if(truckOne.getWheels() == this.getWheels())
               different++;
        
           if(truckOne.getSpeed() == this.getSpeed())
               different++;
            
           if(truckOne.getMPG() == this.getMPG())
               different++;
            
           if(truckOne.getWindows() == this.getWindows())
                different++;
       }
       return different;
    }
}
