public abstract class Vehicle {
    int damage = 100;

    public void ride(){
        --damage;
        System.out.println("Riding a vehicle");
    }


    public void repairVehicle(Vehicle vehicle, String name) {

        System.out.println(name + " was repaired using static RepairService.repair()");
    }

}
