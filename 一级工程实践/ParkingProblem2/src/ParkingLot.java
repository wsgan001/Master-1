import java.util.HashMap;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: yangwenjing
 * Date: 13-11-24
 * Time: 下午2:23
 * To change this template use File | Settings | File Templates.
 */
public class ParkingLot {
   private static int idCounter=0;
   private int id;
   private int parkCapacity ;
   private int parkAvailable;


   private HashMap<Tickets,Car> parkingCars;
    public ParkingLot(int parkCapacity){
        idCounter ++;
        this.id = idCounter;
        this.parkCapacity = parkCapacity;
        this.parkAvailable = parkCapacity;
        this.parkingCars = null;
    }

    public int getId() {
        return id;
    }

    public Tickets park(Car car)
    {
        if(this.parkAvailable<=0)
            return null;

        Tickets tickets = new Tickets(car,this);
        this.parkingCars.put(tickets,car);
        this.parkAvailable--;
        return tickets;
    }

    public Car pick(Tickets ticket)
    {
        Car car = this.parkingCars.get(ticket);
        this.parkAvailable++;
        return car;
    }
    public int getAvailableLots() {
        return parkAvailable;
    }
}
