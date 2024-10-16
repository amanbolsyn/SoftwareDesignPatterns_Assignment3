import java.util.Iterator;
import java.util.List;

public class DriverIterator implements Iterator<Driver> {
    private List<Driver> drivers;
    private int position;

    public DriverIterator(DriverCollection driverCollection) {
        this.drivers = driverCollection.getDrivers();
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < drivers.size();
    }

    @Override
    public Driver next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more drivers available.");
        }
        return drivers.get(position++);
    }
}
