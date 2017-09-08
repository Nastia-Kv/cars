public abstract class Vehicle {
    public final int engine = 1;
    int damage = 100;


    public void repairVehicle(Vehicle vehicle, String name) {
        RepairService.repair(vehicle);
        System.out.println(name + " was repaired using static RepairService.repair()");

    }

}
