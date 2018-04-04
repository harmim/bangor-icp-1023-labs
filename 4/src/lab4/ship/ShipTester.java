package lab4.ship;


/**
 * @author Dominik Harmim harmim6@gmail.com
 */
public class ShipTester
{
	public static void main(String[] args)
	{
		System.out.println("New CruiseShip CruiseShip1 built in 2010 with max 100 passengers");
		CruiseShip cruiseShip = new CruiseShip("CruiseShip1", 2010, 100);
		System.out.println("Name: " + cruiseShip.getName());
		System.out.println("Year of built: " + cruiseShip.getYearOfBuilt());
		System.out.println("Maximum number of Passengers: " + cruiseShip.getMaxNumberOfPassengers());
		System.out.println(cruiseShip);

		System.out.println("\nNew CargoShip CargoShip1 built in 2015 with capacity 20");
		CargoShip cargoShip = new CargoShip("CargoShip1", 2015, 20);
		System.out.println("Name: " + cargoShip.getName());
		System.out.println("Year of built: " + cargoShip.getYearOfBuilt());
		System.out.println("Capacity: " + cargoShip.getCapacity());
		System.out.println(cargoShip);

		System.out.println("\nFleet of 5 ships");
		Ship[] fleet = {
			new CargoShip("CargoShip1", 2000, 10),
			new CargoShip("CargoShip2", 2008, 20),
			new CruiseShip("CruiseShip1", 2017, 600),
			new CruiseShip("CruiseShip2", 2001, 200),
			new CruiseShip("CruiseShip3", 2012, 300),
		};
		for (Ship ship : fleet) {
			System.out.println(ship);
		}
	}
}
