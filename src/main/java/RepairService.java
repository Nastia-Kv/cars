public class RepairService {
    static int damage = 100;
    private void RepairService() {
        return;

    }

    public static void repair(Vehicle vehicle) {
        System.out.println("After riding, the vehicle " + vehicle + " got repaired. Now damage is positive: " + ++damage);
    }




}


