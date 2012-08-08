package parkinglot;

import org.junit.Test;

import javax.smartcardio.Card;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/6/12
 * Time: 7:19 PM
 */
public class ParkingLotTest {
    @Test
    public void should_can_unpark_my_car_when_i_parked_my_car() throws Exception {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingTicket ticket = parkingLot.park(car);
        assertThat(parkingLot.unpark(ticket), is(car));
    }
}
