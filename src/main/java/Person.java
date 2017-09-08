public class Person {

    int damage = 100;

    public Person(String name) {
    }

    public void rideVehicle(String name) {
        System.out.println("Riding a vehicle damages " + name);
        damage--;
        System.out.println(name + " got " + damage + " damage");
    }


}
