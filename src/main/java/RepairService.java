public class RepairService {
    private int damage = 0;


    public void repair(String carName) {
        if (damage != 0){
            System.out.println("After riding, the vehicle " + carName + " got repaired. Now damage is positive: ");
            System.out.println(++damage);

        }

    }




}


