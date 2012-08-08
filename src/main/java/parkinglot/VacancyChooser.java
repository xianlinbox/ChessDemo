package parkinglot;

import java.util.List;

/**
* Created with IntelliJ IDEA.
* User: twer
* Date: 8/6/12
* Time: 8:49 PM
*/
public class VacancyChooser implements Chooser{

    public ParkingLot chooseParkingLot(List<ParkingLot> parkingLots) {
        ParkingLot choosedLot = null;
        double vacancyRate = 0;
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.vacancyRate() > vacancyRate) {
                vacancyRate = parkingLot.vacancyRate();
                choosedLot = parkingLot;
            }
        }
        return choosedLot;
    }
}
