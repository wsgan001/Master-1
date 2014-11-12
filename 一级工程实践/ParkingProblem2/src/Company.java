import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 13-11-24
 * Time: 下午3:20
 * To change this template use File | Settings | File Templates.
 */
public class Company {
    private HashSet parkBoys = new HashSet();
    private HashSet parkLots = new HashSet();

    public Company() {
        initeComany(10,100);  //假设有10个boy, 10个停车位，每个车位有100个车
    }

    public void initeComany(int parkBoyNum, int parkLotNum)
    {
        for(int i=0;i<parkBoyNum;i++)
        {
            this.parkBoys.add(new ParkingBoy());
        }
        for(int i=0;i<parkLotNum;i++)
        {
            this.parkLots.add(new ParkingLot(100));
        }


    }
    public HashSet getParkBoy() {
        return parkBoys;
    }

    public HashSet getParkLot() {
        return parkLots;
    }

    public void addParkBoy(ParkingBoy parkBoy) {
        this.parkBoys.add(parkBoy);
    }
}
