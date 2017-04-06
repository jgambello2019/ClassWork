
/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
    private int handleBarWidth;
    
    public int getBars()
    {
        return handleBarWidth;
    }
    
    public int compareTo(Vehicle m)
    {
       int different = 0;
       if (m instanceof Motorcycle)
       {
           Motorcycle bikeOne = (Motorcycle)m;
           if(bikeOne.getWheels() == this.getWheels())
               different++;
        
           if(bikeOne.getSpeed() == this.getSpeed())
               different++;
            
           if(bikeOne.getMPG() == this.getMPG())
               different++;
            
           if(bikeOne.getWheels() == this.getWheels())
                different++;
       }
       return different;
    }
}
