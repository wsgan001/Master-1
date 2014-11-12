import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 13-11-24
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class TestParkingBoy extends TestCase {
    public static Company company = new Company();

    @Test
    public void testParkingBoy()
    {
        //TODO:
    }
    @Test
    public void testGetAvailableLotsInAParkingLot()
    {
        ParkingLot pl = new ParkingLot(5);
        assertEquals(5,pl.getAvailableLots());
    }

    @Test
    public void testAddParkingLot(){
        //TODO:测试一个ParkingBoy 管理多个parkingLot
        ParkingLot pl = new ParkingLot(5);
        ParkingBoy pBoy = new ParkingBoy();
        pBoy.addParkingLot(pl);
        assertEquals(5,pBoy.availableParkingSpace());
    }
    public void testAvailableParkingSpace()
    {
        ParkingLot pl = new ParkingLot(10);
        ParkingLot pl2 = new ParkingLot(12);
        ParkingLot pl3 = new ParkingLot(20);

        ParkingBoy pBoy = new ParkingBoy();
        pBoy.addParkingLot(pl);
        pBoy.addParkingLot(pl2);
        pBoy.addParkingLot(pl3);
        assertEquals(42,pBoy.availableParkingSpace());
    }

    @Test
    public void testPark()
    {
        //TODO: 测试parking boy park a car
        ParkingLot pl = new ParkingLot(10);
        ParkingLot pl2 = new ParkingLot(12);
        ParkingLot pl3 = new ParkingLot(20);

        ParkingBoy pBoy = new ParkingBoy();
        pBoy.addParkingLot(pl);
        pBoy.addParkingLot(pl2);
        pBoy.addParkingLot(pl3);
        Car car = new Car("12324");
        Tickets tickets = pBoy.park(car);


        assertNotNull(tickets);
        assertEquals("12324",tickets.getCarId());
        assertEquals(41,pBoy.availableParkingSpace());
    }

    public void testPick()
    {
        ParkingLot pl = new ParkingLot(10);
        ParkingLot pl2 = new ParkingLot(12);
        ParkingLot pl3 = new ParkingLot(20);

        ParkingBoy pBoy = new ParkingBoy();
        pBoy.addParkingLot(pl);
        pBoy.addParkingLot(pl2);
        pBoy.addParkingLot(pl3);
        Car car = new Car("12324");
        Tickets tickets = pBoy.park(car);

        Car car2 = pBoy.pick(tickets);
        assertEquals("12324",car2.getId());
        assertEquals(42,pBoy.availableParkingSpace());

    }

}
