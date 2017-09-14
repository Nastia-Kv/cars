import java.util.HashMap;
import java.util.Map;

public class Person {
    public Person() {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Helicopter helicopter = new Helicopter();
        vehicle.put("BMW", car1);
        vehicle.put("Mercedes", car2);
        vehicle.put("Honda", car3);
        vehicle.put("Freedom", boat1);
        vehicle.put("Pegasus", boat2);
        vehicle.put("Beast", truck1);
        vehicle.put("Godzilla", truck2);
        vehicle.put("Hawk", helicopter);
    }

    private Map<String, Vehicle> vehicle = new HashMap<String, Vehicle>();


    public void rideVehicle(String carName) {
        vehicle.get(carName).ride();
        System.out.println("Person rides a vehicle - " + carName);
    }

    void callService(RepairService service, String carName) {
        service.repair(vehicle.get(carName));

    }
}
