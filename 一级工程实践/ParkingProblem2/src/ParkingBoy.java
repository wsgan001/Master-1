import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 13-11-24
 * Time: 下午2:38
 * To change this template use File | Settings | File Templates.
 */
public class ParkingBoy {
    private static int boyCounter = 0;
    private int id;
    private HashMap<Integer,ParkingLot> Lots = new HashMap<Integer, ParkingLot>();

    public ParkingBoy() {
        boyCounter = boyCounter+1;
        this.id = boyCounter;
    }

    public void addParkingLot(ParkingLot pl)
    {
        this.Lots.put(pl.getId(),pl);
    }

    public int availableParkingSpace()
    {
        int result = 0;
        for(Iterator iterator = Lots.iterator();iterator.hasNext();)
        {
            ParkingLot pl = (ParkingLot)iterator.next();
            result += pl.getAvailableLots();
        }
        return result;
    }

    public Tickets park(Car car)
    {
        ParkingLot pl = null;
        for(Iterator iterator = Lots.iterator();iterator.hasNext();)
        {
            pl = (ParkingLot)iterator.next();
            if(pl.getAvailableLots()>0)
                break;
        }

        return pl.park(car);

    }

    public Car pick(Tickets tickets) {

        return this.Lots.get(tickets.getLotId()).pick(tickets);


          //To change body of created methods use File | Settings | File Templates.
    }
}
