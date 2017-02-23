
/**
 * Runner for the Vehicle class and its sub classes
 * @author (Joseph Beatty, Nathan Hefner, Jack Gambello, Ethan Malzberg) 
 * @version (1.0)
 */
public class Runner
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        Vehicle v2 = new Vehicle();
        Car c = new Car(4,"green",2);
        Bike b = new Bike();
        Truck t = new Truck(18, "blue", 1);
        
        System.out.println(c.getColor());
        System.out.println(b.getWheels());
        System.out.println(v.equals(v2));
    }
}
