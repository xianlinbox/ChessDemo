package parkinglot;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/8/12
 * Time: 6:27 PM
 */
public class Report {

    public static final String FOUR_SPACE_INDENT = "    ";
    public static final String TWO_SPACE_NDENT = "  ";

    public static String reportManager(ParkerManager parkerManager) {
        StringBuilder stringBuilder = new StringBuilder().append("manager:\n");
        for (Parker parker : parkerManager.getParkers()) {
            stringBuilder.append(parker.report());
        }
        return stringBuilder.toString();
    }

    public static String reportParker(Parker parker) {
        StringBuilder stringBuilder = new StringBuilder().append(TWO_SPACE_NDENT).append("parker:\n");
        for (ParkingLot parkingLot : parker.getParkingLotList()) {
            stringBuilder.append(parkingLot.report());
        }
        return stringBuilder.toString();
    }

    public static String reportParkingLot(ParkingLot parkingLot) {
        StringBuilder stringBuilder = new StringBuilder()
                .append(FOUR_SPACE_INDENT)
                .append("parkinglot:")
                .append(parkingLot.info())
                .append("\n");
        return stringBuilder.toString();
    }
}
