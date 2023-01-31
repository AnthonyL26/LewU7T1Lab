import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList getInventory() {
        return inventory;
    }
    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int first, int second) {
        if (second >= inventory.size()) {
            return false;
        } else {
            Car replaced = inventory.set(first, inventory.get(second));
            inventory.set(second, replaced);
            return true;
        }
    }
}
