public class Ship extends Vehicle implements Floatable {
    public Ship() {
        super.fuel = 0.0;
    }
    public Ship(double fuel) {
        super.fuel = fuel;
    }
    @Override
    public void fl0at() {
        if (fuel >= 50) {
            fuel -= 50;
            System.out.println("Ship moves");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void honk() {
        System.out.println("Shhhhh");
    }
    public void move() {
        fl0at();
    }
    public void move(int distance) {
        for (int i = 1; i <= distance; i++) {
            if (fuel < 50) {
                System.out.println("Fuel is not enough.");
                break;
            }
            else {
                fl0at();
            }
        }
    }
    public void startEngine() {
        if (fuel >= 10) {
            fuel -= 10;
            System.out.println("Engine starts");
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine() {
        System.out.println("Engine stops");
    }
}
