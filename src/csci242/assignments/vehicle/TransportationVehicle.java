package csci242.assignments.vehicle;

/**
 * Short description.
 * <p/>
 * Long description.
 *
 * @author Ryan Breaker
 * @edu.uwp.cs.242.course CSCI242 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 2
 * @bugs None
 */
public class TransportationVehicle extends Vehicle {

    protected int loadCapacity;


    public TransportationVehicle() {}

    public TransportationVehicle(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TransportationVehicle that = (TransportationVehicle) o;

        return loadCapacity == that.loadCapacity;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + loadCapacity;
        return result;
    }
}