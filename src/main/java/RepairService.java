public class RepairService {
    private int health = 0;
    Vehicle vehicle = new Vehicle() {
        @Override
        public void ride() {
            super.ride();
        }
    };


    public void repair(Vehicle vehicle) {
        if (vehicle.damage > 0) {
            health = vehicle.damage - vehicle.damage;
            System.out.println("Service successfully repaired the " + vehicle);
            System.out.println("Health now is " + health);
            System.out.println();
        } else{
            if (health == 0){
                System.out.println("nothing");
            }
        }
    }

}


