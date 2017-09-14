import java.util.HashMap;
import java.util.Map;

public class Person {
    public Person() {
        this.vehicle = vehicle;
        vehicle.put("BMW", car);
        vehicle.put("Mercedes", car1);
        vehicle.put("Honda", car2);
        vehicle.put("Freedom", boat);
        vehicle.put("Pegasus", boat1);
        vehicle.put("Beast", truck);
        vehicle.put("Godzilla", truck1);
        vehicle.put("Hawk", helicopter);
    }

    Map<String, Vehicle> vehicle = new HashMap<String, Vehicle>();

    Vehicle car = new Car();
    Vehicle car1 = new Car();
    Vehicle car2 = new Car();
    Vehicle boat = new Boat();
    Vehicle boat1 = new Boat();
    Vehicle helicopter = new Helicopter();
    Vehicle truck = new Truck();
    Vehicle truck1 = new Truck();


    public void rideVehicle(Vehicle vehicle) {
        vehicle.ride();
        System.out.println("Person rides a vehicle - " + vehicle);
    }

    public void callService(RepairService service, Vehicle vehicle) {
        service.repair(vehicle);
        System.out.println(vehicle + " was fixed by the service");

    }


}
