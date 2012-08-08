package parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/8/12
 * Time: 1:38 PM
 */
public class ParkerManager {
    private List<Parker> parkers = new ArrayList<Parker>();

    public void addParker(Parker parker) {
        parkers.add(parker);
    }

    public String report() {
        return Report.reportManager(this);
    }

    public List<Parker> getParkers() {
        return parkers;
    }

}
