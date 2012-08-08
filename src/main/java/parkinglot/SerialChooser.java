package parkinglot;

import java.util.List;

/**
* Created with IntelliJ IDEA.
* User: twer
* Date: 8/6/12
* Time: 8:57 PM
*/
public class SerialChooser implements Chooser {

    @Override
    public ParkingLot chooseParkingLot(List<ParkingLot> parkingLots) {
        ParkingLot choosedLot = null;
        for (ParkingLot parkingLot : parkingLots) {
            if (!parkingLot.isFull()) {
                choosedLot = parkingLot;
            }
        }
        return choosedLot;
    }
}
