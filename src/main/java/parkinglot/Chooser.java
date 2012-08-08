package parkinglot;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/7/12
 * Time: 8:58 PM
 */
public interface Chooser {
    ParkingLot chooseParkingLot(List<ParkingLot> parkingLots);
}
