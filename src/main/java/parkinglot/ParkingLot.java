package parkinglot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/6/12
 * Time: 7:23 PM
 */
public class ParkingLot {
    private Map<ParkingTicket, Car> carports = new HashMap<ParkingTicket, Car>();
    private int capacity;
    private int spaces;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.spaces = capacity;
    }

    public ParkingTicket park(Car car) {
        return isFull() ? null : parkCarIntoCarport(car);
    }

    public boolean isFull() {
        return spaces == 0;
    }

    private ParkingTicket parkCarIntoCarport(Car car) {
        ParkingTicket ticket = new ParkingTicket();
        carports.put(ticket, car);
        spaces--;
        return ticket;
    }

    public Car unpark(ParkingTicket ticket) {
        return carports.get(ticket);
    }

    public double vacancyRate() {
        return spaces / capacity;
    }

    public String report() {
        return Report.reportParkingLot(this);
    }

    public String info() {
        return capacity - spaces + "/" + capacity;
    }
}
