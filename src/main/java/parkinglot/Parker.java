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

    Parker(Chooser chooser) {
        this.chooser = chooser;
    }

    public Parker(){
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
    }

    public ParkingTicket park(Car car) {
        ParkingLot choosedLot = getChooser().chooseParkingLot(parkingLotList);
        return choosedLot == null ? null : choosedLot.park(car);
    }

    protected Chooser getChooser() {
        return chooser;
    }

    public Car unpark(ParkingTicket ticket) {
        for (ParkingLot parkingLot : parkingLotList) {
            if (parkingLot.unpark(ticket) != null) {
                return parkingLot.unpark(ticket);
            }
        }
        return null;
    }
}
