public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        RepairService service = new RepairService();

        person.rideVehicle("BMW");
        person.rideVehicle("BMW");
        person.rideVehicle("Mercedes");
        person.rideVehicle("Mercedes");
        person.rideVehicle("Pegasus");

        person.callService(service, "BMW");
        person.callService(service, "BMW");
        person.callService(service, "Mercedes");
        person.callService(service, "Mercedes");
        person.callService(service, "Pegasus");

    }
}


