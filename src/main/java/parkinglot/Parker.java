package parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/7/12
 * Time: 9:30 PM
 */
public class Parker {
    protected List<ParkingLot> parkingLotList = new ArrayList<ParkingLot>();
    protected Chooser chooser;

    public Parker(Chooser chooser) {
        this.chooser = chooser;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
    }

    public ParkingTicket park(Car car) {
        ParkingLot choosedLot = chooser.chooseParkingLot(parkingLotList);
        return choosedLot == null ? null : choosedLot.park(car);
    }

    public Car unpark(ParkingTicket ticket) {
        for (ParkingLot parkingLot : parkingLotList) {
            if (parkingLot.unpark(ticket) != null) {
                return parkingLot.unpark(ticket);
            }
        }
        return null;
    }

    public String report(Report report) {
        return report.reportParker(this);
    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }
}
