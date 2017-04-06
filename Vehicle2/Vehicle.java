
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
    private int numWheels;
    private int maxSpeed;
    private int mpg;
    
    public int getWheels()
    {
        return numWheels;
    }
    
    public int getSpeed()
    {
        return maxSpeed;
    }
    
    public int getMPG()
    {
        return mpg;
    }
}
