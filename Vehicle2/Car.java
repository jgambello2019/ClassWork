
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    // instance variables - replace the example below with your own
    private int numDoors;
    
    public int getNumDoors()
    {
        return numDoors;
    }
    
    public int compareTo(Vehicle c)
    {
       int different = 0;
       if (c instanceof Car)
       {
           Car carOne = (Car)c;
           if(carOne.getWheels() == this.getWheels())
               different++;
        
           if(carOne.getSpeed() == this.getSpeed())
               different++;
            
           if(carOne.getMPG() == this.getMPG())
               different++;
            
           if(carOne.getNumDoors() == this.getNumDoors())
                different++;
       }
       return different;
    }
}
