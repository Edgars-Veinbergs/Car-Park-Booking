package ie.tus.carpark;

public class Main {

	public static void main(String[] args) {
		System.out.println("Car Park Booking System");
		
		Parking parkingSpace = new Parking(2941);
		System.out.println("Parking ID: " + parkingSpace.getParkingID());
	}

}
