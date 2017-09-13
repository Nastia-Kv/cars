public class RepairService {
    private int damage = 100;


//    public void repair(String carName) {
//        if (damage != 0){
//            System.out.println("After riding, the vehicle " + carName + " got repaired. Now damage is positive: ");
//            System.out.println(++damage);
//
//        }
//
//    }

    public void repair(String carName) {
       while (damage >=0){
           --damage;
           System.out.println(damage + "damage");
       }

    }


}


