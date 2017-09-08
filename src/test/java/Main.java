import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nastia");

        Map<String, Vehicle> vehicle = new HashMap<String, Vehicle>();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle helicopter = new Helicopter();
        Vehicle truck = new Truck();

        vehicle.put("BMW", car);
        vehicle.put("Mercedes", car);
        vehicle.put("Honda", car);
        vehicle.put("Freedom", boat);
        vehicle.put("Pegasus", boat);
        vehicle.put("Beast", truck);
        vehicle.put("Godzilla", truck);
        vehicle.put("Hawk", helicopter);

        person.rideVehicle("BMW");
        car.repairVehicle(car, "Honda");

    }
}


