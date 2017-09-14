public class RepairService {
    Vehicle vehicle = new Vehicle() {
        @Override
        public void ride() {
            super.ride();
        }
    };

    public void repair(Vehicle vehicle) {
        if (vehicle.damage > 0) {
            vehicle.damage = vehicle.damage - vehicle.damage;
            System.out.println("Service successfully repaired the " + vehicle);
            System.out.println("Health now is " + vehicle.damage);
            System.out.println();
        } else {
            if (vehicle.damage == 0) {
                System.out.println("The vehicle " + vehicle + " is already repaired");
                System.out.println();
            }
        }
    }
}


