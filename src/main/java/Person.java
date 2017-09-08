import java.util.Map;

public class Person {
    private String name;


    public Person(String name) {
        this.name = name;
        Map<String, Vehicle> vehicle;

    }

    public void rideVehicle(Vehicle vehicle){
        vehicle.ride(vehicle);

    }

    public void callService(RepairService service, String carName) {
        service.repair(carName);
        System.out.println(carName + " was fixed by the service");

    }


}
