package parkinglot;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/6/12
 * Time: 7:59 PM
 */
public class ParkerTest {
    @Test
    public void should_get_my_car_from_first_parking_lot_when_first_parking_Lot_has_space() throws Exception {
        Car car = new Car();
        Parker parker = new Parker(new SerialChooser());
        ParkingLot parkingLot1 = new ParkingLot(2);
        parker.addParkingLot(parkingLot1);
        ParkingLot parkingLot2 = new ParkingLot(2);
        parker.addParkingLot(parkingLot2);
        ParkingTicket ticket = parker.park(car);
        assertThat(parker.unpark(ticket), is(parkingLot2.unpark(ticket)));
    }

    @Test
    public void should_get_my_car_from_2nd_lot_when_2nd_lot_has_higher_rate() throws Exception {
        Car car = new Car();
        Parker parker = new Parker(new VacancyChooser());
        parker.addParkingLot(new ParkingLot(5));
        ParkingLot parkingLot2 = new ParkingLot(2);
        parker.addParkingLot(parkingLot2);
        parker.park(new Car());
        ParkingTicket ticket = parker.park(car);
        assertThat(parker.unpark(ticket), is(parkingLot2.unpark(ticket)));
    }
}
