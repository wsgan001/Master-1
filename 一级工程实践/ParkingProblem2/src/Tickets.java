import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 13-11-24
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
public class Tickets {
    private  String carId;
    private String parkingDateTime;
    private String takeCarTime;
    private int lotId;
    public Tickets(Car car, ParkingLot lot) {
        this.carId = car.getId();
        this.lotId = lot.getId();
        this.parkingDateTime = (new Date()).toString();
    }

    public int getLotId() {
        return lotId;
    }

    public String getCarId() {
        return carId;
    }

    public String getParkingDateTime() {
        return parkingDateTime;
    }
}
