import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        RepairService service = new RepairService();

        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);
        person.rideVehicle(person.car);

        person.callService(service, person.car);
        person.callService(service, person.car);

    }
}


