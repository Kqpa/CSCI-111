public class MovingVan extends Truck 
{
    private int distance;
    private boolean hasRamp;

    public MovingVan(String make, String model, int year, int numWheels, int distance, boolean hasRamp)
    {
        super(make, model, year, numWheels);
        if (distance <= 0)
        {
            throw new IllegalArgumentException("The distance has to be a positive integer");
        }
        this.distance = distance; 
        this.hasRamp = hasRamp;
    }
    
    public int getDistance()
    {
        return this.distance;
    }

    public boolean getRamp()
    {
        return this.hasRamp;
    }

    public String toString()
    {
        if (hasRamp)
        {
            return "capacity = " + super.getCapacity() + ", distance to cargo = " + this.distance + ", has a ramp";
        }
        return "capacity = " + super.getCapacity() + ", distance to cargo = " + this.distance + ", does not have a ramp";
    }
}
