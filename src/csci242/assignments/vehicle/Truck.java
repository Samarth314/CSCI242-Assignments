package csci242.assignments.vehicle;

/**
 * Short description.
 * <p>
 * Long description.
 *
 * @author Ryan Breaker
 * @edu.uwp.cs.242.course CSCI242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class Truck extends TransportationVehicle {

    protected int numOfContainers;


    public Truck() {}

    public Truck(int vehicleId, String manufacturer, String model,
                 int loadCapacity, int numOfContainers) {
        this.vehicleId = vehicleId;
        this.manufacturer = manufacturer;
        this.model = model;
        this.loadCapacity = loadCapacity;
        this.numOfContainers = numOfContainers;
    }


    public int getNumOfContainers() {
        return numOfContainers;
    }

    public void setNumOfContainers(int numOfContainers) {
        this.numOfContainers = numOfContainers;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return numOfContainers == truck.numOfContainers;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numOfContainers;
        return result;
    }
}
