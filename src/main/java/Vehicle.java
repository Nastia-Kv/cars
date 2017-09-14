public abstract class Vehicle {
    int damage = 0;

    public void ride() {
        ++damage;
        System.out.println("Riding a vehicle causes some damage: " + damage);
    }

}
