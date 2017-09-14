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
            System.out.println(health);
        } else{
            if (health == 0){
                System.out.println("nothing");
            }
        }
    }

}


