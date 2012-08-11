package parkinglot;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/8/12
 * Time: 1:31 PM
 */
public class ParkerManagerTest {
    @Test
    public void should_get_report() throws Exception {
        ParkerManager manager = new ParkerManager();
        Parker parker1 = new Parker(new SerialChooser());
        parker1.addParkingLot(new ParkingLot(5));
        parker1.addParkingLot(new ParkingLot(4));
        parker1.park(new Car());

        Parker parker2 = new Parker(new SerialChooser());
        parker2.addParkingLot(new ParkingLot(5));
        parker2.addParkingLot(new ParkingLot(4));
        parker2.addParkingLot(new ParkingLot(2));
        parker2.park(new Car());
        parker2.park(new Car());
        parker2.park(new Car());

        manager.addParker(parker1);
        manager.addParker(parker2);

        String report = "manager:\n" +
                "  parker:\n" +
                "    parkinglot:0/5\n" +
                "    parkinglot:1/4\n" +
                "  parker:\n" +
                "    parkinglot:0/5\n" +
                "    parkinglot:1/4\n" +
                "    parkinglot:2/2\n";
        assertThat(manager.report(new TextReport()), is(report));
    }
}
