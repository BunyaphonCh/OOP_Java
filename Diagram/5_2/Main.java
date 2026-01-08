public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Car ===");
        Car myCar = new Car();
        myCar.setCarInfo(60, "200", "Diesel");
        myCar.showCarInfo();

        myCar.move();
        myCar.showCarInfo();

        myCar.move();

        System.out.println("\n=== Testing Plane ===");

        Plane myPlane = new Plane();
        myPlane.setPlaneInfo(300, "900");
        myPlane.showPlaneInfo();

        myPlane.fly();
        myPlane.showPlaneInfo();
    }
}
