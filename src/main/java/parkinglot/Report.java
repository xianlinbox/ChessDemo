package parkinglot;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/11/12
 * Time: 8:09 AM
 */
public interface Report {
    String reportManager(ParkerManager parkerManager);

    String reportParker(Parker parker);

    String reportParkingLot(ParkingLot parkingLot);
}
